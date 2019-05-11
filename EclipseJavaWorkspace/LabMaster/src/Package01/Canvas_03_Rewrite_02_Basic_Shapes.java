package Package01;

import java.awt.*;
import javax.swing.*;

public class Canvas_03_Rewrite_02_Basic_Shapes extends Canvas {

	public Canvas_03_Rewrite_02_Basic_Shapes(){
		
	}
	
	public void paint(Graphics g){
		g.setColor(Color.blue);
		g.fillRect(50, 50, 200,200);
		g.setColor(Color.BLACK);
		g.drawRect(50, 50, 200, 200);
		g.setColor(Color.yellow);
		g.fillOval(200, 200, 50, 50);
		g.fillRoundRect(350, 350, 50, 50, 10, 10);
		g.setColor(Color.black);
		g.drawString("Test string", 400, 400);
	}
	
	public void init(Graphics g){

	}
	
	public static void main(String[] args) {
		Canvas_03_Rewrite_02_Basic_Shapes canvas = new Canvas_03_Rewrite_02_Basic_Shapes();
		JFrame frame = new JFrame("Test Frame");
		JLabel label = new JLabel("Test Label");
		label.setVisible(true);
		label.setBounds(250, 250, 200, 50);
		Font font = new Font("Times New Roman", Font.PLAIN, 24);
		label.setFont(font);
		label.setBackground(Color.black);
		label.setForeground(Color.white);
		label.setText("test label text");
		frame.add(label);
		JButton buttonSubmit = new JButton("Submit");
	    buttonSubmit.setVisible(true);
		
		frame.setSize(600,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(canvas);
		frame.setVisible(true);
	}
}