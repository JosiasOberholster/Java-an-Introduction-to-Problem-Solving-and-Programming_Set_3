package chapter7;

/*
	This class will take two separate orders of candy boxes,
	and combine their orders.
	Author: Josias JJ Oberholster.
	Chapter 7 Exercise 11.
	Last Changed: 21 December 2017. 
*/

import java.util.Scanner;

public class CandyBoxes {

	static Scanner sc = new Scanner(System.in);
	private static final String PRODUCTS[] = {"Mints", "Chocolates with Nuts", "Chewy Chocolates", "Dark Chocolate Creams", "Sugar-Free Suckers"};
	private static int orderOne[], orderTwo[], combined[];
	
	public CandyBoxes(){
		Orders();
		CombineOrder(orderOne, orderTwo);
	}
	
	public static void main(String[] args){
		CandyBoxes cb = new CandyBoxes();
	}
	
	//Method will take two orders and combine them
	private static void CombineOrder(int first[], int second[]){
		combined = new int[PRODUCTS.length];
		
		for(int i = 0; i < PRODUCTS.length; i++){
			combined[i] = orderOne[i] + orderTwo[i];
		}
		
		System.out.println("The combined order is:");
		for(int i = 0; i < PRODUCTS.length; i++){
			System.out.println(PRODUCTS[i] + ": " + combined[i]);
		}
	}
	
	//This method will create two separate orders.
	private static void Orders(){
		int amount;
		orderOne = new int[PRODUCTS.length];
		orderTwo = new int[PRODUCTS.length];
		
		for(int a = 0; a < 2; a++){
			//First client order
			if(a == 0){
				System.out.println("What is client " + (a + 1) + "'s order:");
				for(int i = 0; i < PRODUCTS.length; i++){
					System.out.print(PRODUCTS[i] + ": ");
					amount = sc.nextInt();
					orderOne[i] = amount;
				}
			//Second client order
			}else if(a == 1){
				System.out.println("What is client " + (a + 1) + "'s order:");
				for(int i = 0; i < PRODUCTS.length; i++){
					System.out.print(PRODUCTS[i] + ": ");
					amount = sc.nextInt();
					orderTwo[i] = amount;
				}
			}else{
				System.out.println("An error occured.");
			}
		}
	}
}