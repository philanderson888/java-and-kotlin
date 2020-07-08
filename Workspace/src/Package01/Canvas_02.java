package Package01;

import java.awt.*;
import javax.swing.*;

public class Canvas_02 extends Canvas{
	
	public Canvas_02(){
		
	}

	public void paint(Graphics g){
		g.setColor(Color.black);
		g.drawLine(0, 0, 200, 200);
	}
	
	public static void main(String[] args) {
		Canvas_02 canvas = new Canvas_02();
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(canvas);
		frame.setVisible(true);
	}

}
