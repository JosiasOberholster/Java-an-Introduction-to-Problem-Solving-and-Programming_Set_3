package chapter7;

import java.util.Scanner;

/*
	Program to generate sales report.
	Author: Josias JJ Oberholster.
	Chapter 7 Self-Test Question 8.
	Last Changed: 27 September 2017.
*/

import java.util.Scanner;

public class SelfTestQuestion8 extends DollarFormat{
	
	private double highestSales;
	private double averageSales;
	private SalesAssociate[] team; // The array object is created in getData.
	private int numberOfAssociates;
	
	//Reads the number of sales associates and data for each one.
	public void getData(){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter number of sales associates:");
		numberOfAssociates = keyboard.nextInt();
		
		team = new SalesAssociate[numberOfAssociates + 1];
		
		for(int i = 1; i <= numberOfAssociates; i++){
			team[i] = new SalesAssociate();
			System.out.println("Enter data for associates " + i);
			team[i].ReadInput();
			System.out.println();
		}
	}
	
	//Computes the average and highest sales figures.
	//Precondition: There is at least one SalesAssociate.
	public void computeStats(){
		double nextSales = team[1].getSales();
		highestSales = nextSales;
		double sum = nextSales;
		
		for(int i = 2; i <= numberOfAssociates; i++){
			nextSales = team[i].getSales();
			sum = sum + nextSales;
			
			if(nextSales > highestSales){
				highestSales = nextSales;
			}
		}
		
		averageSales = sum / numberOfAssociates;
	}
	
	//Displays sales report on the screen.
	public void displayResults(){
		
		System.out.print("Average sales per associate is $");
		writeln(averageSales);
		System.out.println("The highest sales figure is $");
		writeln(highestSales);
		System.out.println();
		System.out.println("The following had the highest sales:");
		
		for(int i = 1; i <= numberOfAssociates; i++){
			double nextSales = team[i].getSales();
			
			if(nextSales == highestSales){
				team[i].writeOutput();
				writeln(nextSales - averageSales);
				System.out.println("$" + (nextSales - averageSales) + " above the average");
				System.out.println();
			}
		}
		
		System.out.println("The rest performed as following:");
		for(int i = 1; i <= numberOfAssociates; i++){
			double nextSales = team[i].getSales();
			
			if(team[i].getSales() != highestSales){
				team[i].writeOutput();
			}
			
			if(nextSales >= averageSales){
				System.out.println("$" + (nextSales - averageSales) + " above average.");
			}else{
				System.out.println("$" + (averageSales - nextSales) + " below the average.");
			}
			
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		SalesReporter clerk = new SalesReporter();
		clerk.getData();
		clerk.computeStats();
		clerk.displayResults();
	}
}
