package chapter6;

/*
	An enumeration of card suits.
	Author: Josias JJ Oberholster.
	Chapter 6 Listing 6.20.
	Last Changed: 20 July 2017.
*/

enum Suit{
	CLUBS("black"), DIAMONS("red"), HEARTS("red"), SPADES("black");
	
	private final String color;
	
	private Suit(String suitColor){
		color = suitColor;
	}
	
	public String getColor(){
		return color;
	}
}

public class Enum {

}
