package chapter5;

/*
	This program will hold records of
	endangered species.
	Author: Josias JJ Oberholster.
	Chapter 5 Listing 5.3.
	Last Change: 29 May 2017.
 */

import java.util.Scanner;

public class SpeciesFirstTry {

	public String name;
	public int population, number, femalePopulation = 0, malePopulation = 0,
			   populationNumber = 0;
	public double growthRate;
	
	public void readInput(){
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the species' name?");
		this.name = keyboard.nextLine();
		
		System.out.println("What is the population of the species?");
		this.population = keyboard.nextInt();
		
		System.out.println("Enter growth rate (% increase per year):");
		this.growthRate = keyboard.nextDouble();
		
		System.out.println("Enter the number of the species to catalog");
		this.number = keyboard.nextInt();
	}
	
	public void writeoutput(){
		
		System.out.println("");
		System.out.println("Name = " + this.name);
		System.out.println("Populaiton = " + this.population);
		System.out.println("Growth rate = " + this.growthRate + "%");
		System.out.println("Catalog number = " + this.number);
		System.out.println("Female population: " + this.femalePopulation);
		System.out.println("Male population: " + this.malePopulation);
	}
	
	public int getPopulationIn10(){
		
		int result = 0;
		double populationAmount = this.population;
		int count = 10;
		
		while((count > 0) &&  (populationAmount > 0)){
			populationAmount = populationAmount + (this.growthRate / 100) * populationAmount;
			
			count--;
		}
		
		if(populationAmount > 0){
			result = (int) populationAmount;
		}
		
		return result;
	}
	
	public int getFemalePopulation(){
		
		populationNumber = population;
		
		for(; populationNumber > 0; populationNumber--){
			if(populationNumber % 2 != 0){
				femalePopulation++;
			}
		}
		return femalePopulation;
	}
	
	public int getMalePopulation(){
		
		populationNumber = population;
		
		for(; populationNumber > 0; populationNumber--){
			if(populationNumber % 2 == 0){
				malePopulation++;
			}
		}
		return malePopulation;
	}
}
