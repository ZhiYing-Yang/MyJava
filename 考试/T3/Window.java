package T3;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
public class Window extends JFrame implements ActionListener{
	JTextArea text;
	JTextField R, PI;
	JButton calculate;
	Circle aCircle;
	public Window(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		text =new JTextArea(5, 5);
		this.add(text, "West");
		
		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		this.add(p1, "East");
		
		JLabel banjing, pai;
		banjing = new JLabel("半径:");
		p1.add(banjing);
		
		R = new JTextField(5);
		p1.add(R);
		
		pai = new JLabel("π:");
		p1.add(pai);
		
		PI = new JTextField(5);
		PI.setText("3.14");
		p1.add(PI);
		
		calculate = new JButton("计算面积");
		p1.add(calculate);
		calculate.addActionListener(this);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try{
			double r = Double.valueOf(R.getText());
			double pi = Double.valueOf(PI.getText());
			aCircle= new Circle();
			aCircle.setR(r);
			aCircle.setPi(pi);
			text.append("圆形的半径为："+r+"\nPI值为："+pi+"\n面积为："+aCircle.area()+"\n");
		}
		catch(Exception ex){
			text.append("无法计算面积："+ex.toString());
		}
	}
}
