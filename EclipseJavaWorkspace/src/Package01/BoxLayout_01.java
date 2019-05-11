package Package01;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class BoxLayout_01 implements ActionListener{
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JPanel panel2 = new JPanel();
	JButton button = new JButton();
	JLabel label = new JLabel();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxLayout_01 gui = new BoxLayout_01();
		gui.go();
	}

	public void go(){
		button.addActionListener(this);
		frame.setSize(500, 500);
		BoxLayout b = new BoxLayout(panel,BoxLayout.Y_AXIS);
		panel.setLayout(b);
		panel.add(button);
		panel.add(label);
		frame.add(panel2);
		frame.add(panel);
		frame.setVisible(true);
	}

	
	@Override
	public void actionPerformed(ActionEvent e){
		System.out.println("Clicked");
		Object model = e.getSource();
		button.setText(button.getText() + " Clicked");
		label.setText(label.getText() + " Clicked");
	}
}
