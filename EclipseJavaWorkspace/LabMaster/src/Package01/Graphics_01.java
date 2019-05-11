package Package01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Graphics_01 extends Canvas{

	public static void main(String args[]){
		Graphics_01 canvas = new Graphics_01();
		DisplayFrame gui = new DisplayFrame();
		gui.go();
		
	}
	
	
	
	public void paint(Graphics g){
		g.setColor(Color.yellow);
		g.fillRect(200,200,50,50);
	}


	public void init(Graphics g){
		
	}
	
	public Graphics_01(){
		
	}


}






class DisplayFrame implements ActionListener{

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	
	
	public void go(){
		frame.setSize(500,500);
		button.addActionListener(this);
		panel.add(button);
		frame.add(panel);
		frame.setVisible(true);
	}

	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		button.setText("clicked");
	}
	
}