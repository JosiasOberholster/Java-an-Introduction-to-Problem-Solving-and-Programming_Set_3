package chapter6;

/*
	Simple demonstration of adding buttons to an applet.
	These buttons do something when clicked.
	Author: Josias JJ Oberholster.
	Chapter 6 Listing 6.22.
	Last Changed: 24 July 2017.
*/

import javax.swing.JApplet;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonDemo extends JApplet implements ActionListener{
	
	public void init(){
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.white);
		
		contentPane.setLayout(new FlowLayout());
		
		JButton sunnyButton = new JButton("Sunny");
		contentPane.add(sunnyButton);
		sunnyButton.addActionListener(this);
		
		JButton cloudyButton = new JButton("Cloudy");
		contentPane.add(cloudyButton);
		cloudyButton.addActionListener(this);
		
		JButton resetButton = new JButton("Reset");
		contentPane.add(resetButton);
		resetButton.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		Container contentPane = getContentPane();
		
		if(e.getActionCommand().equals("Sunny")){
			contentPane.setBackground(Color.blue);
		}else if(e.getActionCommand().equals("Cloudy")){
			contentPane.setBackground(Color.gray);
		}else if(e.getActionCommand().equals("Reset")){
			contentPane.setBackground(Color.white);
		}else{
			System.out.println("ERROR: An error in button interface.");
		}
	}
}
