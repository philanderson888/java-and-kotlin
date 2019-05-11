package Package01;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.Toolkit;

public class ActionListener_03{

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	
	public static void main(String[] args) {
		ActionListener_03 gui = new ActionListener_03();
		gui.go();
	}
	
	ActionListener_03(){
		
	}

	void go(){
		button.addActionListener(new buttonActionListener());		
		panel.add(button);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(screenSize);
		frame.setVisible(true);
	}
	
	class buttonActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			button.setText("Clicked");
		}	
	}
}
