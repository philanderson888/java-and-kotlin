/**
 * I think I finally cracked it on this one
 * 
 * Graphics_11
 * 
 * Got my border layout all fine
 * 
 * Got my INNER CLASSES ALL WORKING SO ALL REQUIRED VARIABLES ARE AVAILABLE UNIVERSALLY
 * 
 * Got the canvas on the screen in the middle
 * 
 * Got an event to repaint and to update the canvas
 * 
 * All good !!!
 * 
 * 30 November 2015
 * 
 */

package Package01;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 * I think I finally cracked it on this one
 * 
 * Graphics_11
 * 
 * Got my border layout all fine
 * 
 * Got my INNER CLASSES ALL WORKING SO ALL REQUIRED VARIABLES ARE AVAILABLE UNIVERSALLY
 * 
 * Got the canvas on the screen in the middle
 * 
 * Got an event to repaint and to update the canvas
 * 
 * All good !!!
 * 
 * 30 November 2015
 * 
 */
public class Graphics_11 {

	JFrame frame = new JFrame();
	JButton buttonNorth = new JButton();
	JButton buttonSouth = new JButton();
	JButton buttonEast = new JButton();
	JButton buttonWest = new JButton();
	int xCoordinate = 0;
	int yCoordinate = 0;
	Canvas_11 canvas = new Canvas_11();	
	
	public static void main(String[] args) {
		Graphics_11 gui = new Graphics_11();
		gui.draw();
	}
	void draw(){
		
		buttonNorth.addActionListener(new ButtonNorthActionListener());

		frame.getContentPane().add(BorderLayout.NORTH, buttonNorth);
		frame.getContentPane().add(BorderLayout.SOUTH, buttonSouth);
		frame.getContentPane().add(BorderLayout.EAST, buttonEast);
		frame.getContentPane().add(BorderLayout.WEST, buttonWest);
		frame.getContentPane().add(BorderLayout.CENTER, canvas);
		frame.setSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize()));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	class Canvas_11 extends Canvas{
		public void paint(Graphics g){
			g.setColor(Color.red);
			g.fillRect(xCoordinate, yCoordinate, 100,100);
		}
	}
	class ButtonNorthActionListener implements ActionListener{

		
		public void actionPerformed(ActionEvent e){
			buttonNorth.setText("Clicked");
			xCoordinate+=10;
			yCoordinate+=10;
			System.out.println("Values of x and y are " + xCoordinate + " and " + yCoordinate);
			canvas.repaint();
		}
	}

}
