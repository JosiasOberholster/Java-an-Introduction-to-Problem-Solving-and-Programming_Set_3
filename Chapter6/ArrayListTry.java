package Chapter6;
import java.util.ArrayList;

public class ArrayListTry
{
	public static void printAl(ArrayList<String> control)
	{
		for(String element: control)
		{
			System.out.println("Romote currently has: " + element);
		}
		System.out.println("");
	}
	
	public static void count(int theSize)
	{
		System.out.println("The Current size is: " + theSize);
		System.out.println("");
	}
}
