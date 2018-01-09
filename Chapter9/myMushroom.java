package Chapter9;
import java.util.*;

public class myMushroom
{
	static String amount;
	
	public static void main(String[] args)
	{		
		Mushroom m1 = new Mushroom();			
		Mushroom m2 = new Mushroom(7);
		Mushroom m3 = new Mushroom(true);
		Mushroom m4 = new Mushroom(false, 5);
		Mushroom m5 = new Mushroom(27, true);
	}
}