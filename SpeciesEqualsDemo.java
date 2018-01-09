package chapter5;

/*
	This class will the the Species class.
	Author: Josias JJ Oberholster.
	Chapter 5 Listing 5.18.
	Last Changed: 1 June 2017.
 */

public class SpeciesEqualsDemo {

	public static void main(String[] args){
		
		SpeciesFifthTry s1 = new SpeciesFifthTry(), s2 = new SpeciesFifthTry();
		
		s1.setSpecies("Klingon ox", 10, 15);
		s2.setSpecies("Klingon ox", 10, 15);
		
		if(s1 == s2){
			System.out.println("Match with ==.");
		}else{
			System.out.println("Do not match with ==");
		}
		
		if(s1.equals(s2)){
			System.out.println("Match with the method equals");
		}else{
			System.out.println("Do not match with the method equals");
		}
		
		System.out.println("Now change one Klingon ox to lowercase");
		
		s2.setSpecies("klingon ox", 10, 15); // Use lowercase.
		
		if(s1.equals(s2)){
			System.out.println("Match with the method equals");
		}else{
			System.out.println("Do not match with the method equals");
		}
	}
}