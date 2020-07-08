package Package01;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.*;


public class BorderLayout_01 {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton button5 = new JButton();
	
	public static void main(String[] args) {
		
		BorderLayout_01 gui = new BorderLayout_01();
		gui.go();
		
	}

	public void go(){
		button1.addActionListener(new Button1Listener());
		button2.addActionListener(new Button2Listener());
		button3.addActionListener(new Button3Listener());
		button4.addActionListener(new Button4Listener());
		button5.addActionListener(new Button5Listener());
		frame.setSize(500, 500);
		frame.getContentPane().add(BorderLayout.NORTH,button1);
		frame.getContentPane().add(BorderLayout.WEST,button2);
		frame.getContentPane().add(BorderLayout.CENTER,button3);
		frame.getContentPane().add(BorderLayout.EAST,button4);
		frame.getContentPane().add(BorderLayout.SOUTH,button5);
		frame.setVisible(true);
	}
	
	
	class Button1Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			button1.setText("Clicked");
		}
	}
	
	class Button2Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			button2.setText("Clicked");
		}
	}
	
	class Button3Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			button3.setText("Clicked");
		}
	}
	
	class Button4Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			button4.setText("Clicked");
		}
	}
	
	class Button5Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			button5.setText("Clicked");
		}
	}
	
	
}
