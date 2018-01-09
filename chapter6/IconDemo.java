package chapter6;

/*
	A demonstration on how to use an icon in Java.
	Author: Josias JJ Oberholster.
	Chapter 6 Listing 6.23.
	Last Changed: 24 July 2017.
*/

import javax.swing.JApplet;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class IconDemo extends JApplet{

	public void init(){
		JLabel niceLabel = new JLabel("Java is fun!");
		ImageIcon dukeIcon = new ImageIcon("chapter6/duke_waving.gif");
		niceLabel.setIcon(dukeIcon);
		getContentPane().add(niceLabel);
	}
}
