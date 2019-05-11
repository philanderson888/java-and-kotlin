package Package01;

/**
 * @author philipanderson
 * 
 * Goal is to create a frame with border layout
 * 
 * Button in North with listener
 * 
 * Button in South to exit
 * 
 * Canvas in Center
 * 
 * Canvas has mouseListener which changes the colour randomly using an inner class
 *
 */

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Graphics_06{
	
	JFrame frame = new JFrame();
	JButton buttonNorth = new JButton();
	JButton buttonSouth = new JButton();
	JLabel labelWest = new JLabel();
	static int clickCounter = 0;

	
	public static void main(String[] args) {
		Graphics_06 gui = new Graphics_06();
		gui.drawFrame();
	}
	void drawFrame(){
		buttonNorth.setText("");
		buttonNorth.addActionListener(new ButtonNorthActionListener());
		
		buttonSouth.setText("Exit");
		buttonSouth.addActionListener(new ButtonSouthActionListener());
				
		labelWest.setSize(50,50);
		labelWest.setBackground(Color.blue);
		labelWest.setMaximumSize(new Dimension(200,200));
		
		Canvas_01 myCanvas = new Canvas_01();
		myCanvas.addMouseListener(new CanvasMouseListener());
			
		frame.setSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize()));
		frame.getContentPane().add(BorderLayout.NORTH, buttonNorth);
		frame.getContentPane().add(BorderLayout.SOUTH, buttonSouth);
		frame.getContentPane().add(BorderLayout.CENTER, myCanvas);
		frame.getContentPane().add(BorderLayout.WEST,labelWest);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	class ButtonNorthActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			clickCounter++;
			buttonNorth.setText("Clicked");
			labelWest.setText(labelWest.getText()+" Clicked " + clickCounter + " times ...");
		}
	}
	class ButtonSouthActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.exit(0);
		}
	}
	class Canvas_01 extends Canvas{
		public void paint(Graphics g){
			int red = 1+(int)(Math.floor(Math.random()*255));
			int blue = 1+(int)(Math.floor(Math.random()*255));
			int green = 1+(int)(Math.floor(Math.random()*255));
			Color randomColor = new Color(red,green,blue);
			g.setColor(randomColor);
			g.setColor(Color.red);
			g.fillRect(100, 100, 200,200);
			g.drawRect(0, 0, 100, 100);
		}
	}
	class CanvasMouseListener implements MouseListener{
		public void mouseClicked(MouseEvent e) {
			System.out.println("About to repaint");
			frame.repaint();
		}
		public void mousePressed(MouseEvent e) {
		}
		public void mouseReleased(MouseEvent e) {
		}
		public void mouseEntered(MouseEvent e) {
		}
		public void mouseExited(MouseEvent e) {
		}
	}

}
