package Chapter6;
import java.util.ArrayList;

public class ArrayListTryTestDrive
{
	private static int x = 0;
	private static int y;
	private static int theSize;
	
	public static void main(String[] args)
	{
		ArrayList<String> button = new ArrayList<String>();
		
		button.add("Start");
		button.add("Stop");
		button.add("Rewind");
		button.add("Fast-Foward");
				
		if(x < 1)
		{
			ArrayListTry.printAl(button);
			x++;
		}
		
		while(x == 1)
		{
			button.add("Pause");
			button.remove("Stop");
			ArrayListTry.printAl(button);
			break;
		}
		
		if(x < 2)
		{
			theSize = button.size();
			ArrayListTry.count(theSize);
			x++;
		}
		
		y = x;
		while((y | x) < 5)
		{
			button.add("Empty");
			ArrayListTry.printAl(button);			
			theSize = button.size();
			ArrayListTry.count(theSize);
			y++;
		}
		
		if(y < 6)
		{
			button.remove("Empty");
			ArrayListTry.printAl(button);
			theSize = button.size();
			ArrayListTry.count(theSize);
			y++;
		}
	}
}
