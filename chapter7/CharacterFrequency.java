package chapter7;

/*
	This class will count the number of times a 
	single digit appears in a telephone number.
	Author: Josias JJ Oberholster.
	Chapter 7 Exercise 5.
	Last Changed: 19 December 2017.
*/

import java.util.Scanner;

public class CharacterFrequency {

	static Scanner sc = new Scanner(System.in);
	private static String telNumber;
	private static int[] singleNumber = new int[10]; 
	private static int zero, one, two, three, four, five, six, seven, eight, nine;
	
	public CharacterFrequency(){
		getNumber();
		getNumbers(telNumber);
		count();
		display();
	}
	
	public static void main(String[ ]args){
		CharacterFrequency cf = new CharacterFrequency();
	}
	
	
	/*
		Method will prevent the number from being lower or higher than 10.
		Method will return the number as String telNumber.
	*/
	private static String getNumber(){
		System.out.println("Enter your telephone number:");
		System.out.println("[The telephone number has to be 10 integers]");
		telNumber = sc.nextLine();
		
		if(telNumber.length() > 10 || telNumber.length() < 10){
			System.out.println("ERROR: The telephone number has to be 10 integers");
			getNumber();
		}
		
		return telNumber;
	}
	
	/*
		Method will receive number, convert String to integer and
		place each number in a separate array.
		singleNumbera array will be filled with the telephone number.
	*/
	private static void getNumbers(String telephoneNumber){
		String number = telephoneNumber;
		
		for(int i = 0; i < 10; i++){
			String sNumber = telephoneNumber.substring(i, i + 1);
			int iNumber = Integer.parseInt(sNumber);
			singleNumber[i] = iNumber;
		}
	}
	
	//Method will keep track of how many times a specific number appeared.
	private static void count(){
		for(int i = 0; i < 10; i++){
			int number = singleNumber[i];
			
			switch(number){
				case 0:
					zero++;
					break;
				case 1:
					one++;
					break;
				case 2:
					two++;
					break;
				case 3:
					three++;
					break;
				case 4:
					four++;
					break;
				case 5:
					five++;
					break;
				case 6:
					six++;
					break;
				case 7:
					seven++;
					break;
				case 8:
					eight++;
					break;
				case 9:
					nine++;
					break;
			}
		}
	}

	//Method will display the amount of times a single number appears.
	private static void display(){
		System.out.println("Zero appears " + zero + " times.");
		System.out.println("One appears " + one + " times.");
		System.out.println("Two appears " + two + " times.");
		System.out.println("Three appears " + three + " times.");
		System.out.println("Four appears " + four + " times.");
		System.out.println("Five appears " + five + " times.");
		System.out.println("Six appears " + six + " times.");
		System.out.println("Seven appears " + seven + " times.");
		System.out.println("Eight appears " + eight + " times.");
		System.out.println("Nine appears " + nine + " times.");
	}
}