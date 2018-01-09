package chapter5;

/*
	Demonstrates the use of a parameter
	with the method predictPopulaiton.
	Author: Josias JJ Oberholster.
	Chapter 5 Listing 5.7.
	Last Changed: 30 May 2017.
 */

public class SpeciesSecondTryDemo {

	public static void main(String[] args){
		
		SpeciesSecondTry speciesOfTheMonth = new SpeciesSecondTry();
		
		System.out.println("Enter data on the Species of the Month:");
		speciesOfTheMonth.readInput();
		speciesOfTheMonth.writeoutput();
		
		int futurePopulation = speciesOfTheMonth.predictPopulation(10);
		System.out.println("In ten years the population will be " + futurePopulation);
		
		//Change the species to show how to change
		//the value of instance variables:
		speciesOfTheMonth.name = "Klingon ox";
		speciesOfTheMonth.population = 10;
		speciesOfTheMonth.growthRate = 15;
		
		System.out.println("The new Species of the Month:");
		speciesOfTheMonth.writeoutput();
		System.out.println("In 10 years the populaiton will be " + speciesOfTheMonth.predictPopulation(10));
	}
}
