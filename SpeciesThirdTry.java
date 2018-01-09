package chapter5;

/*
	This program will demonstrate the use of a 
	private access modifier.
	Author: Josias JJ Oberholster.
	Chapter 5 Listing 5.8.
	Last Changed: 31 May 2017.
 */

import java.util.Scanner;

public class SpeciesThirdTry {

	private String name;
	private int population;
	private double growthRate;
	
	public void readInput(){
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the species' name?");
		name = keyboard.nextLine();
		
		System.out.println("What is the population of the species?");
		population = keyboard.nextInt();
		
		System.out.println("Enter growth rate (% increase per year):");
		growthRate = keyboard.nextDouble();
	}
	
	public void writeoutput(){
		
		System.out.println("");
		System.out.println("Name = " + this.name);
		System.out.println("Populaiton = " + this.population);
		System.out.println("Growth rate = " + this.growthRate + "%");
	}
	
	public int predictPopulation(int years){
		
		int result = 0;
		double populationAmount = population;
		int count = years;
		
		while((count > 0) && (population > 0)){
			populationAmount = (populationAmount + (growthRate / 100) * populationAmount);
			count--;
		}
		if(populationAmount > 0){
			result = (int) populationAmount;
		}
		return result;
	}
}
