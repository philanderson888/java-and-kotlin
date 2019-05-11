package Package01;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class Canvas_06_Flow_Layout extends MouseAdapter{

	public Canvas_06_Flow_Layout(){
		
	}
	
	public void mouseClicked(MouseEvent e){
		System.out.println("Mouse clicked");
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Flow Layout");
		frame.setSize(500,500);
		JPanel panel = new JPanel();
		FlowLayout flow = new FlowLayout();
		panel.setLayout(flow);
		JButton button01 = new JButton("This one is listening for a mouse click");
		JButton button02 = new JButton();
		JButton button03 = new JButton();
		JButton button04 = new JButton();
		JButton button05 = new JButton();
		JButton button06 = new JButton();
		JButton button07 = new JButton();
		JButton button08 = new JButton();
		JButton button09 = new JButton();
		JButton button10 = new JButton();
		panel.add(button01);
		panel.add(button02);
		panel.add(button03);
		panel.add(button04);
		panel.add(button05);
		panel.add(button06);
		panel.add(button07);
		panel.add(button08);
		panel.add(button09);
		panel.add(button10);
		MouseListener mouselistener;
		Event event;
		Canvas_06_Flow_Layout myListener = new Canvas_06_Flow_Layout();
		button01.addMouseListener(myListener);
		
		frame.setContentPane(panel);
		frame.setVisible(true);
		

	}

}


