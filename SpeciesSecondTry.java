package chapter5;

import java.util.Scanner;

/*
	This is a second attempt at improving the species class.
	In this class, I added a parameter to the predictPopulation
	method. Returns the projected population of the receiving 
	object after the specified number of years.
	Author: Josias JJ Oberholster.
	Chapter 5 Listing 5.6.
	Last Changed: 30 May 20017.
 */

public class SpeciesSecondTry {
	
	public String name;
	public int population;
	public double growthRate;
	
	public void readInput(){
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the species' name?");
		this.name = keyboard.nextLine();
		
		System.out.println("What is the population of the species?");
		this.population = keyboard.nextInt();
		
		System.out.println("Enter growth rate (% increase per year):");
		this.growthRate = keyboard.nextDouble();
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