package chapter7;

/*
	This class will draw a rectangle 10px high, 20px wide
	and the upper left corner is at the point (7, 8).
	Author: Josias JJ Oberholster.
	Chapter 7 Self_Test Question 33.
	Last CHnaged: 25 October 2017.
*/

import javax.swing.JApplet;
import java.awt.Color;
import java.awt.Graphics;

public class Self_Test_Question_33 extends JApplet{

	private int[] xBlock = {7, 27, 27, 7};
	private int[] yBlock = {8, 8, 18, 18};
	
	public void paint(Graphics c){
		this.setBackground(Color.BLACK);
		
		c.setColor(Color.white);
		c.fillPolygon(xBlock, yBlock, xBlock.length);
	}
}
