package chapter6;

/*
	Simple demonstration of changing visibility in an Applet.
	Author: Josias JJ Oberholster.
	Chapter 6 Listing 6.24.
	Last Changed: 24 July 2017.
*/

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VisibilityDemo extends JApplet implements ActionListener{

	private JLabel response;
	private Container contentPane;
	private JButton aButton;
	
	public void init(){
		contentPane = getContentPane();
		contentPane.setBackground(Color.white);
		
		//Create Button
		aButton = new JButton("Push Me!");
		aButton.addActionListener(this);
		aButton.setVisible(true);
		
		//Create Label
		response = new JLabel("Thanks, that felt good!");
		ImageIcon smileyFaceIcon = new ImageIcon("chapter6/Sunny_Icon.gif");
		response.setIcon(smileyFaceIcon);
		response.setVisible(false);
		
		//Add Button
		contentPane.setLayout(new FlowLayout());
		contentPane.add(aButton);
		
		//Add Label
		contentPane.add(response);
	}
	
	public void actionPerformed(ActionEvent e){
		contentPane.setBackground(Color.pink);
		response.setVisible(true);
		aButton.setVisible(false);
	}
}
