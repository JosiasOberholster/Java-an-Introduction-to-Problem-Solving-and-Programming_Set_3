package chapter6;

/*
	Class whose privacy can be breached.
	Author: Josias JJ Oberholster.
	Chapter 6 Listing 6.18
	Last Changed: 19 July 2017.
*/

public class PetPair {

	private Pet first, second;
	
	public PetPair(Pet firstPet, Pet secondPet){
		first = firstPet;
		second = secondPet;
	}
	
	public Pet getFirst(){
		return first;
	}
	
	public Pet getSecond(){
		return second;
	}
	
	public void writeOutpur(){
		System.out.println("First pet in the pair:");
		first.writeOutput();
		System.out.println("\nSecond pet in the pair:");
		second.writeOutput();
	}
}
