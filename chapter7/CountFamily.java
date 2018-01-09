package chapter7;

/*
	This program will gather information from the user
	to compute how many family members there are and whom
	of them makes less than 10 percent of the max income value.
	Author: Josias JJ Oberholster.
	Chapter 7 Exercise 2.
	Last Changed: 30 October 2017.
*/

import java.util.Scanner;

public class CountFamily {

	private static final double PERCENTAGE_AMOUNT = 0.1;
	private static double setPercentage = (PERCENTAGE_AMOUNT * 100);
	private static int k;
	private static int lowCount;
	private static double income[];
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
		CountFamily cf = new CountFamily();
	}
	
	public CountFamily(){
		System.out.println("This program will gather information from the user"
				+ "\nto compute how many family members there are and whom"
				+ "\nof them makes less than " + (int) setPercentage + " percent of the max income value.\n");
		
		FamilyAmount();
		income = new double[k];
		getIncome();
		getLess();
		
		System.out.println("The total amount of family members that gets less than \n" 
						+ (int) setPercentage + "of the max income is: " + lowCount);
	}
	
	/*
		Postcondition: Method will only ask for the amount of family members.
		Precondition: Method will return integer k for the amount of family members.
	*/
	private static int FamilyAmount(){
		System.out.println("How many family members are there?");
		k = sc.nextInt();
		return k;
	}
	
	/*
		Precondition: Array length must be set first, all values will be 
		of type double for the array.
		Postcondition: Method will ask for the income of each member and 
		add their value to array income[].
	*/
	private static void getIncome(){
		System.out.println("For each family member, supply their current income.");
		for(int k = 0; k < income.length; k++){
			int fam = k + 1;
			System.out.print("For family member " + fam + ", what is his/sher income: ");
			double in = sc.nextDouble();
			income[k] = in;
		}
	}
	
	/*
		Precondition: All information should be supplied before using this method.
		Postcondition: THe method will return if a family member makes less than 
		set percent of the total income.
	*/
	private static int getLess(){
		double perc = 0.0;
		double currentMax = 0.0;
		
		//Get income max
		for(int i = 0; i < income.length; i++){
			if(income[i] > currentMax){
				currentMax = income[i];
			}
		}
		
		System.out.println("Max income is: " + currentMax);
		
		//Get 10 percent of income sum as a double value
		perc = currentMax * PERCENTAGE_AMOUNT;
		
		//Check each value in array to get the count of how many get less than 
		//set percentage.
		
		for(int i = 0; i < income.length; i++){
			if(income[i] < perc){
				lowCount++;
			}
		}
		
		return lowCount;
	}
}