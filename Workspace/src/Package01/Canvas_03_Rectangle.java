package Package01;

import java.awt.*;
import javax.swing.*;

public class Canvas_03_Rectangle extends Canvas{

	public Canvas_03_Rectangle(){
		
	}
	
	public void paint (Graphics g){
		g.setColor(Color.blue);
		g.fillRect(50, 50, 200, 200);
		g.setColor(Color.black);
		g.drawRect(50, 50, 200, 200);
		g.drawLine(0, 0, 250, 250);
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		Canvas_03_Rectangle canvas = new Canvas_03_Rectangle();
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(canvas);
		frame.setVisible(true);
	}

}
