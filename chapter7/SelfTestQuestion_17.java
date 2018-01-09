package chapter7;

/*
	This class will display all the elements in array a 
	on the screen, one element per line.
	Author: Josias JJ Oberholster.
	Chapter 17 Self-Test Question 17.
	Last Changed: 11 October 2017.
*/

public class SelfTestQuestion_17 {

	private static final int MAX_NUMBER = 5;
	private static double[] a;
	
	public static void main(String[] args){
		a = new double[MAX_NUMBER];
		a[0] = 5.6;
		a[1] = 45.45;
		a[2] = 77.54;
		a[4] = 0.14;
		
		for(int i = 0; i < a.length; i++){
			System.out.println("Array a, position " + i + ", contains: " + a[i]);
		}
	}
}
