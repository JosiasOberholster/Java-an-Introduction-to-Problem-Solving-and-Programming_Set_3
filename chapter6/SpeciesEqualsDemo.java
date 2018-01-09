package chapter6;

/*
	This class explains more on the static of the main class.
	Author: Josias JJ Oberholster.
	Chapter 6 Listing 6.9.
	Last Changed: 12 July 2017.
*/

public class SpeciesEqualsDemo {

	public static void main(String[] args){
		
		Species s1 = new Species(); 
		Species s2 = new Species();
		
		s1.setSpecies("Klingon Ox", 10, 15);
		s2.setSpecies("Klingon Ox", 10, 15);
		
		if(s1 == s2){
			System.out.println("Match with ==.");
		}else{
			System.out.println("Do not match with ==.");
		}
		
		if(s1.equals(s2)){
			System.out.println("Match with the method equals.");
		}else{
			System.out.println("Does not match with the method equals.");
		}
		
		System.out.println("Now change one Klingon Ox to lowercase");
		s2.setSpecies("klingon ox", 10, 15);
		
		if(s1.equals(s2)){
			System.out.println("Match with the method equals.");
		}else{
			System.out.println("Does not match with the method equals.");
		}
	}
}
