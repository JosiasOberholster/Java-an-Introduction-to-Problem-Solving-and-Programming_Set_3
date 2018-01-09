package chapter7;

/*
	Class for sales associates records.
	Author: Josias JJ Oberholster.
	Chapter 7 Listing 7.3.
	Last Changed: 26 September 2017.
*/

import java.util.Scanner;

public class SalesAssociate {

	private String name;
	private double sales;
	
	public SalesAssociate(){
		name = "No record";
		sales = 0;
	}
	
	public SalesAssociate(String initialName, double intitialSales){
		set(initialName, intitialSales);
	}
	
	public void set(String newName, double newSales){
		name = newName;
		sales = newSales;
	}
	
	public void ReadInput(){
		System.out.println("Enter name of sales associates:");
		Scanner keyboard = new Scanner(System.in);
		name = keyboard.nextLine();
		
		System.out.println("Enter associate's sales: $");
		sales = keyboard.nextDouble();
	}
	
	public void writeOutput(){
		System.out.println("Name: " + name);
		System.out.println("Sales: $" + sales);
	}
	
	public String getName(){
		return name;
	}
	
	public double getSales(){
		return sales;
	}
}
