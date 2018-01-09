package chapter7;

/*
	This class will create an applet that will draw a house.
	Author: Josias JJ Oberholster.
	Chapter 7 Listing 7.16.
	Last Changed: 25 October 2017.
*/

import javax.swing.JApplet;
import java.awt.Color;
import java.awt.Graphics;

public class House extends JApplet{

	private int[] xHouse = {150, 150, 200, 250, 250};
	private int[] yHouse = {100, 40, 20, 40, 100};
	private int[] xDoor = {175, 175, 200, 200};
	private int[] yDoor = {100, 60, 60, 100};
	private int[] xWindow = {220, 220, 240, 240};
	private int[] yWindow = {60, 80, 80, 60};
	
	
	public void paint(Graphics canvas){
		this.setBackground(Color.LIGHT_GRAY);
		
		canvas.setColor(Color.GREEN);
		canvas.fillPolygon(xHouse, yHouse, xHouse.length);
		canvas.setColor(Color.black);
		canvas.drawPolyline(xDoor, yDoor, xDoor.length);
		canvas.drawPolygon(xWindow, yWindow, xWindow.length);
		canvas.drawString("Home Sweet Home!", 150, 120);
	}
}
