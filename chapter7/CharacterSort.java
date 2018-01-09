package chapter7;

/*
	This class will sort an array of characters.
	Author: Josias JJ Oberholster.
	Chapter 7 Exercise 15.
	Last Changed: 28 December 2017.
*/

import java.util.Scanner;

public class CharacterSort {

	static Scanner sc = new Scanner(System.in);
	private static char[] characters;	
	private final static int DEFAULT = 10;
	private static int arrayLength;
	
	/*
		Default constructor.
	*/
	public CharacterSort(){
		//Does nothing
	}
	
	/*
		If array length is defined.
	*/
	public CharacterSort(int length){
		characters = new char[length];
		Entries();
		SortArray(characters);
	}
	
	public static void main(String[] args){
		EntryNumber();
		CharacterSort cs = new CharacterSort(arrayLength);
	}
	
	/*
		Method will create array with either default array length,
		or custom array length.
	*/
	private static void EntryNumber(){
		System.out.println("Is there a custom number of entries?");
		System.out.println("[y / n]");
		String entries = sc.next();
		
		if(entries.equalsIgnoreCase("y")){
			System.out.println("What is entry length?");
			arrayLength = sc.nextInt();
		}else if(entries.equalsIgnoreCase("n")){
			System.out.println("Default entry number is: " + DEFAULT);
			System.out.println("Do you want to continue?");
			System.out.println("[y / n]");
			String entriesDefault = sc.next();
			
			if(entriesDefault.equalsIgnoreCase("y")){
				arrayLength = DEFAULT;
			}else if(entriesDefault.equalsIgnoreCase("n")){
				EntryNumber();
			}else{
				System.out.println("Please supply either \"y\" or \"n\"");
				EntryNumber();
			}
		}else{
			System.out.println("Please supply either \"y\" or \"n\"");
			EntryNumber();
		}
	}
	
	/*
		Method will add characters to entry.
	*/
	private static void Entries(){
		for(int i = 0; i < characters.length; i++){
			System.out.println("Supply entry no " + (i + 1));
			characters[i] = sc.next().charAt(0);
		}
	}
	
	/*
		Method will sort array
	*/
	private static void SortArray(char[] sort){
		
	}
}