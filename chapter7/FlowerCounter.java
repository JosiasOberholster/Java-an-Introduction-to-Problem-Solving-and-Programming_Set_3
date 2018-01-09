package chapter7;

/*
	This program will compute the cost of flowers
	sold at a flower stand.
	Author: Josias JJ Oberholster.
	Chapter 7 Exercise 4.
	Last Changed: 6 October 2017.
*/

import java.util.Scanner;

public class FlowerCounter {

	private static final String[] flower = {"Petunia", "Pansy", "Rose", "Violet", "Carnation"};
	private static final double[] cost = {0.50, 0.75, 1.50, 0.50, 0.80};
	private static int flowerNum;
	private static double price;
	
	static Scanner sc = new Scanner(System.in);
	
	public FlowerCounter(){
		getFlowerPrice();
		getFlower();
		getPrice(flowerNum);
		
		System.out.println("Final Price for " + flower[flowerNum - 1] + " is: $" + price);
		
		Resale();
		
	}
	
	public static void main(String[] args){
		FlowerCounter fc = new FlowerCounter();
	}
	
	private static void getFlowerPrice(){
		System.out.println("Flowers are priced as following:");
		for(int i = 0; i < flower.length; i++){
			System.out.println(i + 1 + ". " + flower[i] + ": $" + cost[i]);
		}
	}
	
	private static int getFlower(){
		System.out.println("Please choose a flower.");
		int fNum = sc.nextInt();
		flowerNum = fNum;
		
		return flowerNum;
	}
	
	private static double getPrice(int fNum){
		double setFlowerPrice = cost[fNum - 1];
		
		System.out.println(flower[fNum - 1] + " priced at $" + setFlowerPrice);
		System.out.println("How many flower(s) do you want?");
		int fQuantity = sc.nextInt();
		
		price = setFlowerPrice * fQuantity;
	
		return price;
	}
	
	private static void Resale(){
		System.out.println("Is there another sale?");
		System.out.println("y / n");
		String sale = sc.next();
		if(sale.equalsIgnoreCase("y")){
			FlowerCounter fc = new FlowerCounter();
		}else if(sale.equalsIgnoreCase("n")){
			System.out.println("Thank you for using FlowerCount.");
			System.exit(0);
		}else{
			System.out.println("Wrong input");
			Resale();
		}
	}
}