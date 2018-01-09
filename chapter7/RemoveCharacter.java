package chapter7;

/*
	This class will take a set of characters in an array and
	remove any duplicates that exists.
	Author: Josias JJ Oberholster.
	Chapter 7 Exercise 9.
	Last Changed: 21 December 2017.
*/

import java.util.Scanner;

public class RemoveCharacter {

	static Scanner sc = new Scanner(System.in);
	private static char[] userCharacters, arrayCopy;
	private static int charAmount, check;
	
	/*
		Main constructor to call
	*/
	private RemoveCharacter(){
		getCharacters();
		RemoveDuplicates(userCharacters);
	}
	
	public static void main(String[] args){
		RemoveCharacter r = new RemoveCharacter();
	}

	/*
		A method to remove double characters in a single word.
	*/
	private static void RemoveDuplicates(char[] in){
		boolean check[] = new boolean[charAmount];
				
		//Create copy of array
		arrayCopy = new char[charAmount];
		for(int i = 0; i < charAmount; i++){
			arrayCopy[i] = in[i];
			check[i] = false;
		}
		
		//Check for duplicates, if duplicate exists, the boolean array
		//will return true, otherwise will return true;
		for(int i = 0; i < charAmount; i++){
			if(check[i] == false){
				for(int j = i + 1; j < charAmount; j++){
					if(userCharacters[i] == userCharacters[j]){
						check[j] = true;
					}
				}
			}
		}
		
		//Will return result if array does not contain a duplicate
		System.out.println("Array without Duplicates");
		for(int i = 0; i < charAmount; i++){
			if(check[i] == false){
				System.out.println(arrayCopy[i]);
			}
		}
	}
	
	/*
		This method will create the array of characters.
	*/
	private static void getCharacters(){
		System.out.println("How many characters would you like to add?");
		System.out.println("[Character amount must hav a minimum of 2, and a maximum of 10]");
		charAmount = sc.nextInt();
		
		if(charAmount < 2 || charAmount > 10){
			System.out.println("[ERROR: Character amount must hav a minimum of 2, and a maximum of 10]");
			getCharacters();
		}
		
		userCharacters = new char[charAmount];
		
		for(int i = 0; i < charAmount; i++){
			System.out.print("Enter character " + (i + 1) + ":");
			char uChar = sc.next().charAt(0);
			userCharacters[i] = uChar;
		}
	}
}