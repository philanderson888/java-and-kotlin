
package Package01;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class Form1 extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame Frame = new JFrame();
		Frame.setVisible(true);
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame.setSize(800, 800);
		JButton Button = new JButton();
		Button.setSize(50, 50);
		Button.setAlignmentX(200);
		Button.setAlignmentY(200);
		Button.setVisible(true);
		JTextArea textArea = new JTextArea();
		textArea.setSize(300, 300);
		textArea.setBackground(Color.YELLOW);
		textArea.setVisible(true);
		textArea.setAlignmentX(75);
		textArea.setAlignmentY(75);
		JLabel label01 = new JLabel();
		label01.setText("test");
		label01.setPreferredSize(new Dimension(50,50));
		label01.setBackground(Color.blue);
		Frame.add(Button);
		Frame.add(textArea);
		Frame.add(label01);
	}
}
