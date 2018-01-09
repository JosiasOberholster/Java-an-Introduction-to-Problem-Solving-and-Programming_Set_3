package chapter5;

/*
	This program demonstrates the use of the
	SpeciesFirstTry class.
	Author: Josias JJ Oberholster.
	Chapter 5 Listing 5.4.
	Last Change: 29 May 2017.
 */

public class SpeciesFirstTryDemo {

	public static void main(String[] args){
		
		SpeciesFirstTry speciesOfTheMonth = new SpeciesFirstTry();
		SpeciesFirstTry speciesOfTheYear = new SpeciesFirstTry();
		
		System.out.println("Enter date on the species of the Motnh:");
		speciesOfTheMonth.readInput();
		speciesOfTheMonth.getFemalePopulation();
		speciesOfTheMonth.getMalePopulation();
		speciesOfTheMonth.writeoutput();
		
		System.out.println("Enter date on the species of the Year");
		speciesOfTheYear.readInput();
		speciesOfTheYear.writeoutput();
		
		int futurePopulation = speciesOfTheMonth.getPopulationIn10();
		
		System.out.println("in ten years the population will be " + futurePopulation);
		
		//Change the species to show how to change
		//the value of instance variables:
		speciesOfTheMonth.name = "Klingon ox";
		speciesOfTheMonth.population = 10;
		speciesOfTheMonth.growthRate = 15;
		
		System.out.println("\nThe new Species of the Month:");
		speciesOfTheMonth.writeoutput();
		System.out.println("In ten years the populaiton will be " + speciesOfTheMonth.getPopulationIn10());
	}
}
