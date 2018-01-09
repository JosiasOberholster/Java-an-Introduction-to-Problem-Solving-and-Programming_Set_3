package chapter6;

/*
	A demonstration on how to add a icon to a button.
	Author: Josias JJ Oberholster.
	Chapter 6 Listing 6.23.
	Last Changed: 27 July 2017.
*/

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ButtonIconDemo extends JApplet implements ActionListener{

	public void init(){
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.white);
		
		contentPane.setLayout(new FlowLayout());
		
		JButton sunnyButton = new JButton("Sunny");
		ImageIcon sunnyIcon = new ImageIcon("chapter6/Sunny_Icon.gif");
		sunnyButton.setIcon(sunnyIcon);
		contentPane.add(sunnyButton);
		sunnyButton.addActionListener(this);
		
		JButton cloudyButton = new JButton("Cloudy");
		ImageIcon cloudyIcon = new ImageIcon("chapter6/Cloudy_Icon.gif");
		cloudyButton.setIcon(cloudyIcon);
		contentPane.add(cloudyButton);
		cloudyButton.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		Container contentPane = getContentPane();
		
		if(e.getActionCommand().equals("Sunny")){
			contentPane.setBackground(Color.blue);
		}else if(e.getActionCommand().equals("Cloudy")){
			contentPane.setBackground(Color.gray);
		}else{
			System.out.println("ERROR: An error happened in buttons");
		}
	}
}
