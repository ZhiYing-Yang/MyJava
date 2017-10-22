package LastYearTest.T2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class Window extends JFrame{
	JComboBox tu_select;
	Object []tuxing = {"圆形", "矩形"};
	public Window(){
		super("计算表面积和体积");
		
		this.setBounds(100, 100, 500, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		tu_select = new JComboBox(tuxing);
		this.add(tu_select);
		
		this.setVisible(true);
	}
	
	public static void main(String args[]) {
		new Window();
	}
}
