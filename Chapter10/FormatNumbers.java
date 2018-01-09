package Chapter10;
public class FormatNumbers 
{
	public static void main(String[] args) 
	{
		String new1 = String.format("I have: %,.4f apples", 25468.12544);
		String new2 = String.format("I have: %,d apples", 25468);
		String new3 = String.format("The hexadeciaml of 42 is: %x", 42);
		String new4 = String.format("The character of 42 is: %c", 42);
		String new5 = String.format("But new1 (which is: %,.4f), is a bit more than new2 (which is: %,d)", 25468.12544,25468);
		
		
		System.out.println(new1);
		System.out.println(new2);
		System.out.println(new3);
		System.out.println(new4);
		System.out.println(new5);
	}

}
