package chapter6;

/*
	Class of static method to perform dimension conversions.
	Author: Josias JJ Oberholster.
	Chapter 6 Listing 6.5.
	Last Changed: 11 July 2017.
*/

public class DimensionConverter {

	public static final int INCHES_PER_FOOT = 12;
	
	public static double convertFeetToInches(double feet){
		return feet * INCHES_PER_FOOT;
	}
	
	public static double convertInchesToFeet(double inches){
		return inches / INCHES_PER_FOOT;
	}
}