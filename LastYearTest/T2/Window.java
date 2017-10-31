package LastYearTest.T2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Window extends JFrame implements ActionListener {
	JComboBox tu_select;
	JButton btn_calculate;
	JTextArea text;
	JLabel chang, kuan, gao;
	JTextField chang_text, kuan_text, gao_text;
	Object[] tuxing = { "矩形", "圆形" };

	public Window() {
		super("计算表面积和体积");

		this.setBounds(100, 100, 500, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		this.add(panel, "North");
		tu_select = new JComboBox(tuxing);
		panel.add(tu_select);
		tu_select.addActionListener(this);

		int input_long = 3;
		chang = new JLabel("长");
		panel.add(chang);
		chang_text = new JTextField(input_long);
		panel.add(chang_text);

		kuan = new JLabel("宽");
		panel.add(kuan);
		kuan_text = new JTextField(input_long);
		panel.add(kuan_text);

		gao = new JLabel("高");
		panel.add(gao);
		gao_text = new JTextField(input_long);
		panel.add(gao_text);

		btn_calculate = new JButton("计算表面积和体积");
		panel.add(btn_calculate);
		btn_calculate.addActionListener(this);

		text = new JTextArea(5, 20);
		text.setText("计算四棱柱表面积和体积：" + "\n");
		this.add(text);

		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		// 选择图形事件
		if (e.getSource() == tu_select) {
			if (tu_select.getSelectedItem().toString() == "圆形") {
				chang.setText("半径");
				kuan.setText("π");
				text.setText("计算圆柱表面积和体积：" + "\n");
			} else {
				chang.setText("长");
				kuan.setText("宽");
				text.setText("计算四棱柱表面积和体积：" + "\n");
			}
		}

		// 计算面积按钮点击事件
		if (e.getSource() == btn_calculate) {
			try {
				double a, b, c, surface_area, volume;
				a = Double.valueOf(chang_text.getText());
				b = Double.valueOf(kuan_text.getText());
				c = Double.valueOf(gao_text.getText());
				if (kuan.getText().toString() == "宽") {
					text.append("长：" + a + "\t" + "宽：" + b + "\t" + "高：" + c + "\n");
					Geometry retangle = new Retangle();
					surface_area = retangle.getSurfaceArea(a, b, c);
					volume = retangle.getVolume(a, b, c);
				} else {
					text.append("底面半径：" + a + "\t" + "π：" + b + "\t" + "高：" + c + "\n");
					Geometry circle = new Circle();
					surface_area = circle.getSurfaceArea(a, b, c);
					volume = circle.getVolume(a, b, c);
				}
				text.append("表面积为：" + surface_area + "\n");
				text.append("体积为：" + volume + "\n" + "\n");

			} catch (Exception ex) {
				text.append("无法计算：" + ex.toString() + "\n");
			}
		}
	}

}
