package Package01;

import java.awt.*;
import javax.swing.*;

public class Canvas_01 extends Canvas{
	
	public Canvas_01(){
		
	}
	
	public void paint(Graphics graphics){
		
	}

	public static void main(String[] args) {
		
		Canvas_01 myCanvas = new Canvas_01();
		
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(myCanvas);
		frame.setVisible(true);
		
		
		
	}

}
