package chapter7;

/*
	This class will keep record sales of a store.
	Author: Josias JJ Oberholster.
	Chapter 7 Exercise 6.
	Chapter 7 Exercise 7.
	Chapter 7 Exercise 8.
	Last Changed: 19 December 2017.
*/

import java.util.Scanner;

public class Ledger {

	static Scanner sc = new Scanner(System.in);
	private static double[] sales, value;
	private static int salesMade, averageCount;
	private static int maxSales;
	private static boolean repeat, increasing;
	private static double salesTotal, average;
	
	/*
		Constructor will the set the max amount of sales to max.
	*/
	public static int Ledger(double sale){
		maxSales = (int) sale;
		return maxSales;		
	}
	
	public static void main(String[] args){
		//Get the max amount of sales, set max to array.
		System.out.println("What is the max number of sales to be made?");
		double sale = sc.nextDouble();
		Ledger(sale);
		sales = new double[maxSales];
		value = new double[maxSales];
		
		//The process of making a sale and adding the value to the array.
		MakeSale();
		
		//Will return the total price of the sale
		getTotalSales();
	}
	
	/*
		This class will conduct the sale process.
	*/
	private static void MakeSale(){
		for(int i = 0; i < maxSales; i++){
			System.out.println("Sale " + (i + 1) + ": What is the price?");
			System.out.print("$");
			double price = sc.nextDouble();
			AddSale(i, price);
			
			if(i + 1 < maxSales){
				AnotherSale();
			}
			
			getNumberOfSales();
			if(repeat == false || i >= maxSales){
				System.out.println("Sale ended");
				break;
			}
		}
	}
	
	/*
		Adds a sales whose value is d.
	 */
	private static void AddSale(int i, double d){
		sales[i] = d;
	}
	
	/*
		Returns the number of sales made.
	*/
	private static int getNumberOfSales(){
		salesMade++;
		return salesMade;
	}
	
	/*
		Returns the total value of sales
	*/
	private static void getTotalSales(){
		for(int i = 0; i < maxSales; i++){
			salesTotal += sales[i];
		}
		
		System.out.println("Total sales made: " + salesMade);
		System.out.println("Total price $" + salesTotal);
		
		getAverageSale();
		System.out.println("Average sale price is $" + average);
		
		getCountAbove(average);
		System.out.println(averageCount + " items exceeds the average amount");
		
		isStrictlyIncreasing(value);
		if(increasing == true){
			System.out.println("The product sale has increased per item, since first item.");
		}else if(increasing == false){
			System.out.println("The product sale has increased per item, since first item.");
		}else{
			System.out.println("ERROR: Boolean value no found");
		}
	}
	
	/*
		This class will allow the sale to end if the sale has
		come to an end.
	*/
	private static boolean AnotherSale(){
		System.out.println("Is there another sale?");
		System.out.println("[y / n]");
		String answer = sc.next();
		
		if(answer.equalsIgnoreCase("y")){
			repeat = true;
		}else if(answer.equalsIgnoreCase("n")){
			repeat = false;
		}else{
			System.out.println("Error");
			AnotherSale();
		}
		
		return repeat;
	}
	
	/*
		Return the average value of the sale
	*/
	private static double getAverageSale(){
		double total = 0.0;
		
		for(int i = 0; i < maxSales; i++){
			total += sales[i];
			value[i] = sales[i];
		}
		
		average = total / salesMade;
		return average;
	}
	
	/*
		Return the number of sales that exceeds v in value
		and v is the average
	*/
	private static double getCountAbove(double v){
		for(int i = 0; i < maxSales; i++){
			if(sales[i] >= average){
				averageCount++;
			}else{
				//Do nothing
			}
		}
		
		return averageCount;
	}
	
	/*
		Will return true if each value in the boolean is bigger than the
		previous value, otherwise return false.
	*/
	private static boolean isStrictlyIncreasing(double[] in){
		for(int i = 0; i < maxSales - 1; i++){
			if(in[i] > sales[i + 1]){
				increasing = true;
			}else{
				increasing = false;
			}
		}
		
		return increasing;
	}
}