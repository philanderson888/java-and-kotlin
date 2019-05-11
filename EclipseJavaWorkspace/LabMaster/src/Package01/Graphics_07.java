package Package01;

/**
 * @author philipanderson
 * 
 * Goal is to display simple canvas in centre of BorderLayout.Center
 * 
 * Display a red box
 *
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Graphics_07 extends Canvas{
	
	Graphics_07(){
		
	}
	
	JFrame frame = new JFrame();
	JButton buttonNorth = new JButton();
	JButton buttonSouth = new JButton();
	
	public static void main(String[] args) {
		Graphics_07 gui = new Graphics_07();
		gui.draw();
	}
	void draw(){
		Canvas_01 canvas_01 = new Canvas_01();
		
		frame.setSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize()));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	class Canvas_01 extends Canvas{
		Canvas_01(){
			
		}
		public void paint(Graphics g){
			g.setColor(Color.red);
			g.fillRect(0, 0, 100, 100);
		}
	}

}
