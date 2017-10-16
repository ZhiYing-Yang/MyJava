package 第六章.例十;//作业1：将右边的panel改成四行一列，第二行，第三行改成一行三列

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/*
 * JFrame是一个矩形窗口，里面放我们布局的图形元素。
 * java中只有两种最外的独立窗口
 * */
public class ItemCompoent extends JFrame {
	JComboBox cb_channel;
	JList list_shows;
	JLabel label;
	Object[] channel = { "中央一台", "中央二台" };
	Object[][] shows = { { "新闻联播", "焦点访谈" }, { "交换空间", "经济与法", "经济半小时" } };

	public ItemCompoent() {
		super("列表组件示例");

		this.setBounds(100, 100, 300, 200);// (x, y, width, high);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);// 关闭时退出
		this.setLayout(new FlowLayout());

		cb_channel = new JComboBox(channel);// 注意用()
		this.add(cb_channel);

		list_shows = new JList(shows[0]);// 默认显示中央一台，以及新闻联播、焦点访谈
		this.add(list_shows);

		label = new JLabel("");
		this.add(label);

		cb_channel.addItemListener(new ItemListener() { // 匿名内部类
			// 用于下拉列表的项是否被选中
			public void itemStateChanged(ItemEvent e) {
				int i = cb_channel.getSelectedIndex();
				list_shows.setListData(shows[i]);// 下拉列表中的i对应列表中的shows[i]
				// setListData设置数据到列表上
			}
		});

		list_shows.addListSelectionListener(new ListSelectionListener() {
			// 用于各种节目是否被选中，即列表项是否被选中
			public void valueChanged(ListSelectionEvent e) {
				String str = cb_channel.getSelectedItem().toString();
				if (!list_shows.isSelectionEmpty()) {
					str = "" + list_shows.getSelectedValue();
				}
				label.setText("你选中的是" + str);
			}
		});

		this.setVisible(true);

	}
}
