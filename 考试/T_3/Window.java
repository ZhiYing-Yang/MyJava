package 考试.T_3;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Window extends JFrame implements ActionListener {
	JTextArea text;
	JTextField R, PI;
	JButton calculate;
	Circle aCircle;

	public Window() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		text = new JTextArea(5, 5);
		this.add(text, "West");

		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		this.add(p1, "East");

		JLabel banjing, pai;
		banjing = new JLabel("�뾶:");
		p1.add(banjing);

		R = new JTextField(5);
		p1.add(R);

		pai = new JLabel("��:");
		p1.add(pai);

		PI = new JTextField(5);
		PI.setText("3.14");
		p1.add(PI);

		calculate = new JButton("�������");
		p1.add(calculate);
		calculate.addActionListener(this);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
			double r = Double.valueOf(R.getText());
			double pi = Double.valueOf(PI.getText());
			aCircle = new Circle();
			aCircle.setR(r);
			aCircle.setPi(pi);
			text.append("Բ�εİ뾶Ϊ��" + r + "\nPIֵΪ��" + pi + "\n���Ϊ��" + aCircle.area() + "\n");
		} catch (Exception ex) {
			text.append("�޷����������" + ex.toString());
		}
	}
}
