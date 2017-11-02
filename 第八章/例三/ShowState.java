package 第八章.例三;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class ShowState extends JFrame implements ActionListener, Runnable {
	private JTextArea ta;
	private JTextField text_state;
	private JButton button_start, button_interrupt, button_terminate;
	private JLabel label;
	private Thread t;

	public ShowState() {
		super("演示线程状态");
		this.setSize(450, 300);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		ta = new JTextArea();
		ta.setAutoscrolls(true);
		this.add(ta);

		button_start = new JButton("启动");
		button_start.addActionListener(this);

		button_interrupt = new JButton("中断");
		button_interrupt.addActionListener(this);

		button_terminate = new JButton("线程结束后");
		button_terminate.addActionListener(this);
		button_terminate.setEnabled(false);
		button_interrupt.setEnabled(false);
		// 按Thread下方let ShowState implements Runnable
		// 本句让界面一生成就有线程对象，因为本局在界面类的构造方法中
		t = new Thread(this);

		label = new JLabel("线程状态");
		text_state = new JTextField(" " + t.getState(), 10);// 线程对象自己获取自己的状态
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(0));// left
		panel.add(button_start);
		panel.add(button_interrupt);
		panel.add(button_terminate);
		panel.add(label);
		panel.add(text_state);
		this.add(panel, BorderLayout.SOUTH);
		this.setVisible(true);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i = 1;
		while (t.isAlive() && !t.isInterrupted()) {
			String str = "a";
			if (i % 20 == 0) {
				str = str + "\n";
			}
			i++;
			ta.append(str);
			try {
				t.sleep(100);
			} catch (InterruptedException e) {
				break;
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button_start) {
			// 上边一句同样的，为什么这里还要重复，是因为线程中断结束后，还要重新生成一个线程对象
			t = new Thread(this);
			// 注意：start（）要run()外执行，而且在时间相应方法中。
			// 启动线程是从线程头部开始启动，所以可以从线程体外部真正启线程
			t.start();

			text_state.setText(" " + t.getState());
			button_start.setEnabled(false);// 现在是单击启动状态，当然start状态不能再次启动，变成虚的
			button_interrupt.setEnabled(true);
		}

		if (e.getSource() == button_interrupt) {
			/*
			 * 注意：t.interrupt;也要在run（）外部运行。 虽然t.interrupt也在run线程外部执行，但中断是在线程体内部某个部分中断，
			 * 从外部无法识别中断部位。因此，t.interrupt是假中断，只是提供一个中断信号， 它碰到线程体run中终端线程的方法 如sleep()时才真中断。
			 */
			t.interrupt();

			text_state.setText(" " + t.getState());
			button_start.setEnabled(true);
			button_terminate.setEnabled(true);
			button_interrupt.setEnabled(false);
		}

		if (e.getSource() == button_terminate) {
			text_state.setText(" " + t.getState());
		}
	}

	public static void main(String args[]) {
		new ShowState();
	}

}
