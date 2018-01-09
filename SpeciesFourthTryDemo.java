package chapter5;

/*
	Demonstrates the use of the mutator method setSpecies.
	Author: Josias JJ Oberholster.
	Chapter 5 Listing 5.12.
	Last Changed: 31 May 2017.
 */

import java.util.Scanner;

public class SpeciesFourthTryDemo {

	public static void main(String[] args){
		
		SpeciesFourthTry speciesOfTheMonth = new SpeciesFourthTry();
		
		System.out.println("Enter number of years to project:");
		Scanner keyboard = new Scanner(System.in);
		int numberOfYears = keyboard.nextInt();
		
		System.out.println("Enter data of the Species of the Month:");
		speciesOfTheMonth.readInput();
		speciesOfTheMonth.writeoutput();
		
		int futurePopulation = speciesOfTheMonth.predictPopulation(numberOfYears);
		System.out.println("In " + numberOfYears + " years the popualation will be " + futurePopulation);
		
		//Change the species to show how to change
		//the value of instance variables:
		speciesOfTheMonth.setSpecies("Klingon ox", 10, 15);
		System.out.println("The new Species of the Month:");
		speciesOfTheMonth.writeoutput();
		
		futurePopulation = speciesOfTheMonth.predictPopulation(numberOfYears);
		System.out.println("In " + numberOfYears + " years the population will be " + futurePopulation);
	}
}
