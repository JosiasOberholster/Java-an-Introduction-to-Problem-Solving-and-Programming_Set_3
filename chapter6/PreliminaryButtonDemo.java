package chapter6;

/*
	Simple demonstration of adding buttons to an applet.
	These buttons do not do anything. That comes in a later version.
	Author: Josias JJ Oberholster.
	Chapter 6 Listing 6.21.
	Last Changed: 24 July 2017.
*/

import javax.swing.JApplet;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;

public class PreliminaryButtonDemo extends JApplet{
		
	public void init(){
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.white);
		
		contentPane.setLayout(new FlowLayout());
		
		JButton sunnyButton = new JButton("Sunny");
		contentPane.add(sunnyButton);
		
		JButton cloudyButton = new JButton("Cloudy");
		contentPane.add(cloudyButton);
	}
}
