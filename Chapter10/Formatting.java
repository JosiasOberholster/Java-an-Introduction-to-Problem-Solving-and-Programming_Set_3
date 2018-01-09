package Chapter10;
public class Formatting
{	
	public static void main(String[] args)
	{
		double point = 98476578.09876;
		
		String numPoint1 = String.format("I have %.2f bugs to fix", point);
		String numPoint2 = String.format("I have %,.3f bugs to fix", point);
		String numPoint3 = String.format("I have %.4f, bugs to fix", point);
		System.out.println(numPoint1);
		System.out.println(numPoint2);
		System.out.println(numPoint3);
	}
}