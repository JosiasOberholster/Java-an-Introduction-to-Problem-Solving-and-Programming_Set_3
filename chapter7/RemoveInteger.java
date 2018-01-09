package chapter7;

/*
	This class will receive a list of single integers, the user will choose
	a single integer and remove all duplicates.
	Author: Josias JJ Oberholster.
	Chapter 7 Exercise 10.
	Last Changed: 21 December 2017.
*/

import java.util.Scanner;

public class RemoveInteger {

	static Scanner sc = new Scanner(System.in);
	private static int[] userInteger;
	private static int userAmount;
	
	public RemoveInteger(){
		getIntgers();
		
		System.out.println("What integer would you like to remove?");
		int remove = sc.nextInt();
		
		Remove(remove, userInteger);
	}
	
	public static void main(String[] args){
		RemoveInteger ri = new RemoveInteger();
	}
	
	//Method will remove selected integer from array.
	private static void Remove(int v,int[] in){
		boolean check[] = new boolean[userAmount];
		int digit = v;
		
		for(int i = 0; i < userAmount; i++){
			if(in[i] == digit){
				check[i] = true;
			}
		}
		
		for(int i = 0; i < userAmount; i++){
			if(check[i] != true){
				System.out.println(in[i]);
			}
		}
	}
	
	//Method will create array with integers
	private static void getIntgers(){
		System.out.println("How many integers will be supplied");
		System.out.println("[Integer amount must be minimum 3, and maximum 10]");
		userAmount = sc.nextInt();
		
		if(userAmount < 3 || userAmount > 10){
			System.out.println("ERROR: Integer amount must be minimum 3, and maximum 10");
			System.out.println("");
			getIntgers();
		}else{
			userInteger = new int[userAmount];
		}
		
		for(int i = 0; i < userAmount; i++){
			System.out.print("Enter integer " + (i + 1) + ":");
			int integer = sc.nextInt();
			userInteger[i] = integer;
		}
	}
}