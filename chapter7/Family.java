package chapter7;

/*
	This program will count the amount of families that 
	are considered poor.
	Author: Josias JJ Oberholster.
	Chapter 7 Exercise 3.
	Last Changed: 30 October 2017.
*/

import java.util.Scanner;

public class Family {

	static double income;
	static double totalIncome;
	static double housingCost;
	static double foodCost;
	static double family[];
	static int size;
	static boolean currentStatus;
	static String status;
	
	static Scanner sc = new Scanner(System.in);
	
	public Family(){}

	public Family(double setIncome, int setSize){
		income = setIncome;
		size = setSize;
		
		isPoor(housingCost, foodCost);
		setAsString();
		System.out.println(status);
	}
	
	/*
		Postcondition: This method will collect the data for each family.
	*/
	void getFamily(){
		System.out.println("How many family members are there?");
		int familyMembers = sc.nextInt();
		family = new double[familyMembers];
		
		for(int i = 0; i < family.length; i++){
			int f = i + 1;
			System.out.print("What is  the income for family member " + f + " :");
			double income = sc.nextDouble();
			
			family[i] = income;
		}
	}
	
	/*
		Postcondition: This method will collect the data for each member in the family
		and set their housing cost.
	*/
	double setHousingCost(){
		for(int i = 0; i < family.length; i++){
			int f = i + 1;
			System.out.print("What is the housing cost for family member " + f + " :");
			double pHouseCost = sc.nextDouble();
			housingCost = housingCost + pHouseCost;
		}
		
		return housingCost;
	}
	
	/*
		Postcondition: This method will collect the data for each member in the family
		and set their food cost.
	*/
	double setFoodCost(){
		double getFoodCost = 0.0;
		
		for(int i = 0; i < family.length; i++){
			int f = i + 1;
			System.out.print("What is the food cost for family member " + f + " :");
			double pFoodCost = sc.nextDouble();
			
			getFoodCost = getFoodCost + pFoodCost;
			foodCost = getFoodCost / family.length;
		}
	
	return foodCost;
}
	
	/*
		Precondition: Requires input to be gathered first.
		Postcondition: Will return true if family is considered poor.
	*/
	static boolean isPoor(double housingCost, double foodCost){
		double getPoor = (housingCost + foodCost) * size;
		double getFamilyHalf = totalIncome / 2;
		
		if(getPoor < getFamilyHalf){
			currentStatus = true;
		}else{
			currentStatus = false;
		}
		
		return currentStatus;
	}
	
	/*
		Postcondition: This method will return a string containing
		the family information.
	*/
	static String setAsString(){
		if(currentStatus == true){
			status = "Current family is poor";
		}else{
			status = "Current family is not poor";
		}
		
		return status;
	}
}