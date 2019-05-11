/*
 * When frame loads, set border layout with N S W E C 
 * 
 * In the center place a rectangle painted
 * 
 * Button at bottom to close
 * 
 * Button at top to action listen and change text to 'clicked'
 * 
 */

package Package01;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Graphics_04 {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton buttonNorth = new JButton();
	JButton buttonSouth = new JButton();
	JButton buttonEast = new JButton();
	JButton buttonWest = new JButton();
	
	public static void main(String[] args) {
		Graphics_04 gui = new Graphics_04();
		gui.draw();
	}
	
	void draw(){
		buttonNorth.addActionListener(new ButtonNorthActionListener());
		buttonSouth.addActionListener(new ButtonSouthActionListener());
		buttonEast.addActionListener(new ButtonListener(buttonEast));
		buttonWest.addActionListener(new ButtonListener(buttonWest));
		c myNewCanvas = new c();
		myNewCanvas.addMouseListener(new CanvasMouseListener(myNewCanvas));
		
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(d);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.NORTH, buttonNorth);
		frame.getContentPane().add(BorderLayout.SOUTH, buttonSouth);
		frame.getContentPane().add(BorderLayout.EAST, buttonEast);
		frame.getContentPane().add(BorderLayout.WEST, buttonWest);
		frame.getContentPane().add(BorderLayout.CENTER, myNewCanvas);
		frame.setVisible(true);
	}
	
	
	
	class ButtonNorthActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			buttonNorth.setText("Clicked");
		}
	}
	class ButtonSouthActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.exit(0);
		}
	}
	class ButtonListener implements ActionListener{
		
		JButton button;
		
		ButtonListener(JButton button){
			this.button = button;
		}
		public void actionPerformed(ActionEvent e){
			button.setText("Clicked");
		}
	}
	

	
	class c extends Canvas{
		public void paint(Graphics g){
			g.setColor(Color.red);
			g.fillRect(0, 0, 50,50);
			Image image = new ImageIcon("mountain.jpg").getImage();
			g.drawImage(image,50,50,this);
			System.out.println("Test");
		}
	}
	
	class CanvasMouseListener extends Canvas implements MouseListener{ 
		
		Canvas clickedCanvas;
		
		CanvasMouseListener(Canvas clickedCanvas){
			this.clickedCanvas = clickedCanvas;
		}
		
		public void actionPerformed(MouseEvent e){
		}
		
		public void mouseClicked(MouseEvent e){
			System.out.println("Mouse clicked on canvas area");
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
}
