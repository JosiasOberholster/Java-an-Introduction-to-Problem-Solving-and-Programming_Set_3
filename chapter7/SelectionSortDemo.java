package chapter7;

/*
	A class to test ArraySorter.
	Author: Josias JJ Oberholster.
	Chapter 7 listing 7.11.
	Last Changed: 12 October 2017.
*/

public class SelectionSortDemo {

	public static void main(String[] args){
		
		int[] b = {7, 5, 11, 2, 16, 4, 18, 14, 12, 30};
		
		display(b, "before");
		ArraySorter.selectionSort(b);
		display(b, "After");
	}
	
	public static void display(int[] array, String when){
		System.out.println("Array Values " + when + " sorting:");
		
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
	}
}
