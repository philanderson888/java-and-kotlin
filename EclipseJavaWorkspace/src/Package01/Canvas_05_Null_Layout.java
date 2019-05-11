package Package01;

import java.awt.*;
import javax.swing.*;

public class Canvas_05_Null_Layout {

	public Canvas_05_Null_Layout(){
		
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Frame and Panel With Flow Layout");
		JPanel panel = new JPanel();
		JButton button01 = new JButton("Button 1");
		JButton button02 = new JButton("Button 2");
		JButton button03 = new JButton("Button 3");
		
		
		button01.setBounds(new Rectangle(30,30,200,70));
		button02.setBounds(new Rectangle(90,90,200,120));
		button03.setBounds(30,30,210,80);
		
		panel.setLayout(null);
		panel.add(button03);
		panel.add(button01);
		panel.add(button02);

		frame.setContentPane(panel);
		frame.setSize(500,500);
		frame.setVisible(true);
	}
}
