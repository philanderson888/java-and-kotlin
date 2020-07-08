package Package01;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Graphics_05 {

	static JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton buttonNorth = new JButton();
	JButton buttonSouth = new JButton();
	static int clickCounter = 0;
	
	public static void main(String[] args) {
		Graphics_05 gui = new Graphics_05();
		gui.draw();
	}
	public void draw(){
		buttonNorth.addActionListener(new ButtonNorthListener());
		buttonSouth.addActionListener(new ButtonSouthListener());
		buttonSouth.setText("Exit");
		DrawCanvas canvas01 = new DrawCanvas();
		canvas01.addMouseListener(new Canvas01MouseListener(canvas01));
		
		frame.getContentPane().add(BorderLayout.NORTH,buttonNorth);
		frame.getContentPane().add(BorderLayout.SOUTH, buttonSouth);
		frame.getContentPane().add(BorderLayout.CENTER, canvas01);
		frame.setSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize()));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	class ButtonNorthListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			buttonNorth.setText("Clicked");
		}
	}
	
	class ButtonSouthListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.exit(0);
		}
	}
	
	class DrawCanvas extends Canvas{
		public void paint(Graphics g){
			clickCounter++;
			System.out.println("clickCounter has value " + clickCounter);

				Image image = new ImageIcon("scenery.jpg").getImage();
				g.drawImage(image, 0,0 , this);
				int red = 1 + (int)(Math.floor(Math.random()*255));
			    int blue = 1 + (int)(Math.floor(Math.random()*255));
				int green = 1 + (int)(Math.floor(Math.random()*255));
				Color c = new Color(red,green,blue);
				g.setColor(c);
				g.fill3DRect(100, 100, 100, 100, true);		
				Graphics2D g2d = (Graphics2D) g;
				GradientPaint gradient = new GradientPaint(70,70,Color.blue,150,150,Color.orange);
				g2d.setPaint(gradient);
				g2d.fillOval(170, 170, 500, 500);

			if(clickCounter==2){

				g.fill3DRect(200, 100, 100, 100, true);	
			}
			if(clickCounter==3){	
				g.fill3DRect(300, 100, 100, 100, true);	
			}

		}
	}
	
	class Canvas01MouseListener implements MouseListener{
		DrawCanvas c;
		Canvas01MouseListener(DrawCanvas c){
			this.c = c;
		}
		public void mouseEntered(MouseEvent e){
			
		}
		public void mouseExited(MouseEvent e){
			
		}
		public void mousePressed(MouseEvent e){
			
		}
		public void mouseReleased(MouseEvent e){
			
		}
		public void mouseClicked(MouseEvent e){
			System.out.println("Canvas clicked");
			buttonSouth.setText(buttonSouth.getText() + " Canvas Clicked ");
			c.repaint();
		}
		
	}
	

}
