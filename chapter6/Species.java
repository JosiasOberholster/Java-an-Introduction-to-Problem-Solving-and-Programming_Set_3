package chapter6;

/*
	This program will hold records of
	endangered species.
	Author: Josias JJ Oberholster.
	Chapter 6 Listing 6.9.
	Last Change: 12 July 2017.
 */

import java.util.Scanner;

public class Species{

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
	
	/**
		Precondition: years is a nonnegative number.
		returns the projected population of the receiving object
		after the specified number of years.
	 */
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
	
	public void setSpecies(String newName, int newPopulation, double newGrowthRate){
		
		name = newName;
		
		if(population >= 0){
			population = newPopulation;
		}else{
			System.out.println("ERROR: using a negative population.");
			System.exit(0);
		}
		growthRate = newGrowthRate;
	}
	
	public String getName(){
		return name;
	}
	
	public int getPopulation(){
		return population;
	}
	
	public double getGrowthRate(){
		return growthRate;
	}
	
	public boolean equals(Species otherObject){
		return (name.equalsIgnoreCase(otherObject.name)) &&
			   (population == otherObject.population) &&
			   (growthRate == otherObject.growthRate);
	}
}