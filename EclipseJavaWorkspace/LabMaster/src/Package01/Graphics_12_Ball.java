package Package01;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

/**
 * 
 * @author philipanderson
 * @version 12 as am developing knowledge in Graphics field
 * 
 * Date : 30 November 2015
 * 
 * Test : when click a button want a ball to move on the screen
 *
 * 
 */
public class Graphics_12_Ball {

	JFrame frame = new JFrame();
	JButton buttonNorth = new JButton();
	JButton buttonSouth = new JButton();
	JButton buttonEast = new JButton();
	JPanel panelEast = new JPanel();
	JButton buttonWest = new JButton();
	Canvas_01 canvas = new Canvas_01();
	JSlider sliderForBallSpeed = new JSlider();
	JSlider sliderForTimerIncrement = new JSlider();
	int timerIncrement = 5;
	Timer timer = new Timer(timerIncrement,new TimerActionListener());
	byte xDirection = 1;
	byte yDirection = 1;
	int ballDiameter = 60;
	float ballxSpeed = 5.1F;
	float ballySpeed = (float)(ballxSpeed-0.2);
	float xCoord = (float)(ballDiameter+1);
	float yCoord = (float)(ballDiameter+1);
	
	Graphics_12_Ball(){
		
	}
	
	public static void main(String[] args) {
		Graphics_12_Ball gui = new Graphics_12_Ball();
		gui.draw();
	}
	void draw(){
		buttonNorth.addActionListener(new ButtonNorthActionListener());
		buttonSouth.addActionListener(new ButtonSouthActionListener());
		buttonWest.addActionListener(new ButtonWestActionListener());
		buttonEast.addActionListener(new ButtonEastActionListener());
		frame.getContentPane().add(BorderLayout.NORTH, buttonNorth);
		frame.getContentPane().add(BorderLayout.SOUTH, buttonSouth);
		frame.getContentPane().add(BorderLayout.WEST, buttonWest);
		panelEast.setLayout(new BoxLayout(panelEast,BoxLayout.Y_AXIS));
		panelEast.add(buttonEast);
		sliderForBallSpeed.addChangeListener(new SliderForBallSpeedChangeListener());
		sliderForBallSpeed.setMaximum(30);
		sliderForBallSpeed.setMinimum(1);
		sliderForBallSpeed.setPaintTicks(true);
		sliderForBallSpeed.setMajorTickSpacing(5);
		sliderForBallSpeed.setPaintLabels(true);
		sliderForBallSpeed.createStandardLabels(5);
		panelEast.add(sliderForBallSpeed);
		sliderForTimerIncrement.addChangeListener(new SliderForTimerIncrementChangeListener());
		sliderForTimerIncrement.setMaximum(200);
		sliderForTimerIncrement.setMinimum(1);
		sliderForTimerIncrement.setPaintTicks(true);
		sliderForTimerIncrement.setMajorTickSpacing(40);
		sliderForTimerIncrement.setPaintLabels(true);
		sliderForTimerIncrement.createStandardLabels(40);
		panelEast.add(sliderForTimerIncrement);
		frame.getContentPane().add(BorderLayout.EAST, panelEast);
		frame.getContentPane().add(BorderLayout.CENTER,canvas);
		frame.setSize(new Dimension(Toolkit.getDefaultToolkit().getScreenSize()));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	class Canvas_01 extends Canvas{
		Canvas_01(){
			
		}
		public void paint(Graphics g){
			g.setColor(Color.white);
			g.fillRect(0,0,canvas.getWidth(),canvas.getHeight());
			g.setColor(Color.blue);
			g.fillOval((int)xCoord, (int)yCoord, ballDiameter, ballDiameter);
		}
	}
	class ButtonNorthActionListener implements ActionListener{
		/**
		 *   @param buttonNorth is to be clicked to kick of the ball moving
		 *   @param xCoord yCoord are position of ball on screen
		 *   @param radius of ball
		 */
		public void actionPerformed(ActionEvent e){
			xCoord+=8;
			yCoord+=8;
			canvas.repaint();
		}
	}
	class ButtonSouthActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.exit(0);
		}
	}
	class ButtonWestActionListener implements ActionListener{
		/**
		 *   Moving ball - this is currently not working!!!
		 */
		public void actionPerformed(ActionEvent e){
			for (int i=0;i<400;i+=10){
				System.out.println("Value of i is " + i);
				xCoord+=10;
				yCoord+=10;
				System.out.println("and the value of x and y are (" + xCoord + "," + yCoord + ")");
				canvas.repaint();
				try{
					Thread.sleep(50);
				}
				catch(Exception ex){					
				}
			}
		}
	}  //end class ButtonWest
	class ButtonEastActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			timer.start();
		}
	}  // class ButtonEast
	class TimerActionListener implements ActionListener{
		/**
		 *   1 December 2015
		 *   
		 *   Successfully implements a ball bouncing around the screen
		 *   
		 *   
		 */
		public void actionPerformed(ActionEvent e){
			xCoord+=ballxSpeed*xDirection;
			yCoord+=ballySpeed*yDirection;
			canvas.repaint();
			if((xCoord+ballDiameter)>canvas.getWidth()){
				xDirection=-1;
			}
			if((xCoord-ballDiameter)<0){
				xDirection=1;
			}
			if((yCoord+ballDiameter)>canvas.getHeight()){
				yDirection=-1;
			}
			if((yCoord-ballDiameter)<0){
				yDirection=1;
			}
		}
	}//class Timer Action Listener
	class SliderForBallSpeedChangeListener implements ChangeListener{
		/**
		 *  Slider
		 *  @param sliderForBallSpeed is set by the slider and changes
		 *  @param ballxSpeed which will be the x-component of the velocity of the {@link Graphics_12_Ball
		 *  Well pleased that I got this slider to work!!!
		 */
		public void stateChanged(ChangeEvent e){
			ballxSpeed=sliderForBallSpeed.getValue();
			ballySpeed=ballxSpeed-0.2F;
		}
	}
	class SliderForTimerIncrementChangeListener implements ChangeListener{
		public void stateChanged(ChangeEvent e){
			timerIncrement=sliderForTimerIncrement.getValue();
			timer.setDelay(timerIncrement);
		}
	}
}
