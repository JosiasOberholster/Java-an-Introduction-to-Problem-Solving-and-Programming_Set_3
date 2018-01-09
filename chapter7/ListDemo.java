package chapter7;

/*
	This is a demo class to create a list using arrays.
	Author: Josias JJ Oberholster.
	Chapter 7 Listing 7.8.
	Last Changed: 111 October 2017.
*/

import java.util.Scanner;

public class ListDemo {

	public static final int MAX_SIZE = 3; // Assumed > 0
	
	public static void main(String[] args){
		
		OneWayNoRepeatsList toDoList = new OneWayNoRepeatsList(MAX_SIZE);
		
		System.out.println("Enter items for the lis, when prompted.");
		
		boolean moreEntries = true;
		String next = null;
		
		Scanner keyboard = new Scanner(System.in);
		
		while(moreEntries && !toDoList.isFull()){
			System.out.println("Enter an item.");
			next = keyboard.nextLine();
			toDoList.addItem(next);
			
			if(toDoList.isFull()){
				System.out.println("List is now full.");
			}else{
				System.out.println("More items for the list?");
				String ans = keyboard.nextLine();
				
				if(ans.trim().equalsIgnoreCase("no")){
					moreEntries = false; //User says no more
				}else{
					for(int i = 0; i < MAX_SIZE; i++){
						toDoList.getEntryArray(i);
					}
				}
			}
		}
		
		System.out.println("The list contains");
		int position = toDoList.START_POSITION;
		next = toDoList.getEntryAt(position);
		
		while(next != null){
			System.out.println(next);
			position++;
			next = toDoList.getEntryAt(position);
		}
	}
}
