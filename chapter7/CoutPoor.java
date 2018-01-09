package chapter7;

/*
	This program will conduct a sum to see how many 
	family members are considered poor.
	Author: Josias JJ Oberholster.
	Chapter 7 Exercise 3.
	Last Changed: 30 October 2017.
*/

public class CoutPoor {

	public static void main(String[] args){
		Family f = new Family();
		double totalIncome = 0;
		
		
		f.getFamily();
		int familySize = f.family.length;
		
		f.setHousingCost();
		f.setFoodCost();
		
		for(int i = 0; i < f.family.length; i++){
			totalIncome = totalIncome + f.family[i];
		}
		
		Family f2 = new Family(totalIncome, f.family.length);
	}
	
	
}
