package Chapter9;
public class Mushroom
{
	private int size;
	private boolean isMagic;
	
	public Mushroom()
	{
		size = 25;
		isMagic = true;
		
		System.out.println("Mushroom One is " + size + " cm");
		System.out.println("Is this mushroom magic? " + isMagic);
		System.out.println("");
	}
	
	public Mushroom(int size)
	{
		if(size < 25)
		{
			isMagic = true;
		}
		else
		{
			isMagic = false;
		}
		System.out.println("Mushroom Two is " + size + " cm");
		System.out.println("Is this mushroom magic? " + isMagic);
		System.out.println("");
	}
	
	public Mushroom(boolean isMagic)
	{
		size = 3;
		System.out.println("Mushroom Three is " + size + " cm");
		System.out.println("Is this mushroom magic? " + isMagic);
		System.out.println("");
	}
	
	public Mushroom(boolean isMagic, int size)
	{
		while(size < 25)
		{
			System.out.println("Mushroom grew 1cm");
			size++;
		}
		
		System.out.println("Mushroom Five is " + size + " cm");
		System.out.println("Is this mushroom magic? " + isMagic);
		System.out.println("");
	}
	
	public Mushroom(int size, boolean isMagic)
	{
		while(size < 25)
		{
			System.out.println("Mushroom grew 1cm");
			size++;
		}
		
		System.out.println("Mushroom Six is " + size + " cm");
		System.out.println("Is this mushroom magic? " + isMagic);
		System.out.println("");
	}
	
	

}