package Package01;

import javax.swing.*;
import java.awt.*;

public class Canvas_04{

	public Canvas_04(){
		
	}
	
	public void xx(){
		
	}
	
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton("Press Me");
		button.setBounds(new Rectangle(10,10,150,50));
		panel.setLayout(null);
		panel.add(button);
		frame.setContentPane(panel);
		frame.setSize(500, 500);
		frame.show();
	}

}
