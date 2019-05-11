package Package01;

import java.awt.event.*;
import javax.swing.*;

public class ActionListener_02 implements ActionListener{

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	
	
	public static void main(String args[]){
		ActionListener_02 gui = new ActionListener_02();
		gui.go();
	}
	
	
	public void go(){
		
		button.addActionListener(this);
		panel.add(button);
		frame.setSize(500, 500);
		frame.add(panel);
		frame.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		button.setText("Clicked");
		
	}
}
