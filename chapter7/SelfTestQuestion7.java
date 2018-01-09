package chapter7;

/*
	This class will use a base array entry of length 3
	and will be filled with name "Jane Doe" and sales of
	$5000.
	Author: Josias JJ Oberholster.
	Chapter 7 Self-Test Question 7.
	LAst Changed: 27 September 2017.
*/

import java.util.Scanner;

public class SelfTestQuestion7 {

	private SalesAssociate[] entry;
	private int numberOfAssociates = 3;
	
	private void Associates(){
		Scanner sc = new Scanner(System.in);
		entry = new SalesAssociate[numberOfAssociates + 1];
		
		for(int i = 1; i < numberOfAssociates + 1; i++){
			entry[i] = new SalesAssociate();
			System.out.println("Enter associate data:");
			entry[i].ReadInput();
			System.out.println();
		}
		
		for(int i = 1; i < numberOfAssociates + 1; i ++){
			entry[i].writeOutput();
		}
	}
	
	public static void main(String[] args){
		SelfTestQuestion7 stq7 = new SelfTestQuestion7();
		stq7.Associates();
	}
}
