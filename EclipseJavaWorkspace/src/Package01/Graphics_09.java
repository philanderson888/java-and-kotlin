package Package01;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
import java.awt.*;

public class Graphics_09 extends Canvas{
	Graphics_09(){
		
	}

	public void paint(Graphics g){
		g.setColor(Color.red);
		g.fillRect(0, 0, 600,800);
	}
	static JFrame frame = new JFrame();
	public static void main(String[] args) {
		Graphics_09 gui = new Graphics_09();
		
		frame.setSize(1300, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(gui);
		frame.setVisible(true);
	}

}
