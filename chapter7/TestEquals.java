package chapter7;

/*
	A demonstration program to test two arrays for equality.
	Author: Josias JJ Oberholster.
	Chapter 7 Listing 7.6.
	LAst Changed: 02 October 2017.
*/

public class TestEquals {

	public static void main(String[] args){
		
		int[] a = new int[3];
		int[] b = new int[3];
		
		setArray(a);
		setArray(b);
		
		if(a == b){
			System.out.println("Equals by ==.");
		}else{
			System.out.println("Not set by ==.");
		}
		
		if(equals(a, b)){
			System.out.println("Equals by equals method.");
		}else{
			System.out.println("Not set by equals method.=.");
		}
	}
	
	public static boolean equals(int[] a, int[] b){
		boolean elementsMatch = true;
		
		if(a.length != b.length){
			elementsMatch = false;
		}else{
			int i = 0;
			
			while(elementsMatch && (i < a.length)){
				if(a[i] != b[i]){
					elementsMatch = false;
				}
				i++;
			}
		}
		return elementsMatch;
	}
	
	public static void setArray(int[] array){
		for(int i = 0; i < array.length; i++){
			array[i] = i;
		}
	}
}
