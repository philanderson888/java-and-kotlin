/*
 * AIM OF THIS PROJECT
 * 
 * USE BORDER MANAGER LAYOUT
 * 
 * DISPLAY ALL FIVE REGIONS
 * 
 * EACH REGION TO HAVE ONE CLICKABLE IMPACT
 * 
 * MIDDLE REGION TO HAVE TWO PANES, DIFFERENT COLOURS, EACH WITH A CLICKABLE BUTTON OF A DIFFERENT COLOUR
 * 
 * 
 * TEST MY APPLICATION
 * 
 * CLICK ON TOP, BOTTOM, LEFT, RIGHT BUTTONS - ALL WORKING
 * CLICK ON MIDDLE TWO BUTTONS - ALL WORKING
 * CHECK MIDDLE TWO BUTTONS ARE IN SEPARATE PANELS DENOTED BY DIFFERENT COLOURS
 * JOB DONE!!!
 */

package Package01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Graphics_03 {

	JFrame frame = new JFrame();
	JPanel panelTopHalf = new JPanel();
	JPanel panelBottomHalf = new JPanel();
	JPanel panelCenter = new JPanel();
	JButton button01 = new JButton();
	JButton button02 = new JButton();
	JButton button03 = new JButton();
	JButton button04 = new JButton();
	JButton button05 = new JButton();
	JButton button06 = new JButton();
	JButton button07 = new JButton();
	JTextField textField01 = new JTextField();
	JTextArea textArea = new JTextArea(16,5);
	JScrollPane scrollPane = new JScrollPane(textArea);
	JCheckBox checkBox = new JCheckBox("Click Here");
	String[] ListBoxEntries = {"Selection 1","Selection 2","Selection 3"};
	DefaultListModel listModel = new DefaultListModel();
	JList listBox = new JList(listModel);
	JScrollPane scrollPaneForListBox = new JScrollPane(listBox);
	
	public Graphics_03(){
		
	}
	
	public static void main(String[] args) {
		Graphics_03 gui = new Graphics_03();
		gui.go();
	}
	
	public void go(){
		
		//FRAME
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(screenSize.width,screenSize.height);
		frame.setBackground(new RandomColor().setRandomColor());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//NORTH
		button01.setBackground(new RandomColor().setRandomColor());
		button01.addActionListener(new Button1Listener());
		panelTopHalf.setBackground(new RandomColor().setRandomColor());
		panelTopHalf.setBorder(new TitledBorder(new EtchedBorder(),"Top"));
		frame.getContentPane().add(BorderLayout.NORTH,button01);
		
		//EAST
		button02.setBackground(new RandomColor().setRandomColor());
		frame.getContentPane().add(BorderLayout.EAST, button02);
		

		//SOUTH
		
		button03.setBackground(new RandomColor().setRandomColor());
		button03.setText("Close");
		button03.addActionListener(new Button3Listener());

		
		//WEST
		button04.setBackground(new RandomColor().setRandomColor());
		
		
		//CENTER TOP
		button05.setBackground(new RandomColor().setRandomColor());
		button05.setText("JButton");
		button05.addActionListener(new Button5Listener());
		
		
		textField01.setPreferredSize(new Dimension(200,50));
		textField01.setText("JText Field");
		
		scrollPane.setEnabled(true);
		scrollPane.setPreferredSize(new Dimension (300,100));
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(0, 0, panelTopHalf.getWidth(), panelTopHalf.getHeight());
		
		textArea.setText("TextArea");
		textArea.setLineWrap(true);
		textArea.setEditable(true);
		textArea.addFocusListener(new TextAreaListener());
		textArea.addMouseListener(new MouseClickListener());
		
		checkBox.addChangeListener(new CheckBoxListener());
		
		panelTopHalf.add(button05);
		panelTopHalf.add(textField01);	
		panelTopHalf.add(scrollPane);
		panelTopHalf.add(checkBox);

		//CENTER BOTTOM
		panelBottomHalf.setBackground(new RandomColor().setRandomColor());
		panelBottomHalf.setBorder(new TitledBorder(new EtchedBorder(),"Bottom"));
		scrollPaneForListBox.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		listModel.addElement("one");
		listBox.addListSelectionListener(new ListSelectionListener1());
		
		panelBottomHalf.add(button06);
		panelBottomHalf.add(scrollPaneForListBox);
		
		//CENTER
		panelCenter.setBackground(new RandomColor().setRandomColor());
		panelCenter.setLayout(new BoxLayout(panelCenter, BoxLayout.Y_AXIS));
		panelCenter.setBorder(new TitledBorder(new EtchedBorder(),"Display Area"));
		panelCenter.add(panelTopHalf);
		panelCenter.add(panelBottomHalf);
		frame.getContentPane().add(BorderLayout.CENTER, panelCenter);

		

		

		

		

		



		frame.getContentPane().add(BorderLayout.SOUTH, button03);
		frame.getContentPane().add(BorderLayout.WEST, button04);

		frame.setVisible(true);
	}
	
	class RandomColor{
		private int green;
		private int red;
		private int blue;

		
		public RandomColor(){
			
		}
		
		public Color setRandomColor(){
			green = (int)(1+Math.floor((255*Math.random())));
			red = (int)(1+Math.floor((255*Math.random())));
			blue = (int)(1+Math.floor((255*Math.random())));
			return new Color(red,green,blue);
		}
	}
	
	class Button1Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			button01.setText("Clicked");
			textArea.setText(textArea.getText() + "Button 1 clicked");
			
		}
	}
	
	class Button3Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			System.exit(0);
		}
	}
		
	
	class Button5Listener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			button05.setText("Button 05 Clicked");
			listModel.addElement(textField01.getText());
		}
	}
	
	class TextAreaListener implements FocusListener{


			@Override
			public void focusGained(FocusEvent e) {
				textArea.append(" Text Area Has Been Clicked In . . . ");
				
			}

			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}		
	}
	
	class MouseClickListener implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			textArea.setText(textArea.getText() + " Mouse Clicked . . . ");
			
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
	
	class CheckBoxListener implements ChangeListener{
		@Override
		public void stateChanged(ChangeEvent e) {
	
		}
		
		public void itemStateChanged(ChangeEvent e){
			if (checkBox.getSelectedObjects()==null){
				checkBox.setText("Off");	
			}
			else{
				checkBox.setText("On");
			}
			textArea.append("State Of Check Box Has Changed To " + checkBox.getText());
		}
		
	}
	
	class ListSelectionListener1 implements ListSelectionListener{

		@Override
		public void valueChanged(ListSelectionEvent e) {
			if(!e.getValueIsAdjusting()){
				textArea.append("\nList Box Selection Has Changed to " + listBox.getSelectedValue().toString());	
			}
		}
		
	}
}


