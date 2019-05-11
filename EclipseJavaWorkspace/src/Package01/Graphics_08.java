package Package01;

import javax.swing.*;
import java.awt.*;

public class Graphics_08 extends Canvas{

	Graphics_08(){
		
	}
	public void paint(Graphics g){
	    g.setColor(Color.blue);
	    g.fillRect(0, 0,100,100);
	}
	public static void main(String[] args) {
		Graphics_08 gui = new Graphics_08();
		JFrame frame = new JFrame();
		frame.setSize(800, 800);
		frame.setBackground(Color.pink);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(gui);
		frame.setVisible(true);
	}


}
