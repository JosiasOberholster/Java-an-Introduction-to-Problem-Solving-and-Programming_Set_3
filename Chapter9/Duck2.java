package Chapter9;
public class Duck2
{
	private int size;
	
	public Duck2()
	{
		//Supply default code here
		size = 27;
		System.out.println("The default duck size is: " + size);
	}
	
	public Duck2(int duckSize)
	{
		size = duckSize;
		System.out.println("The chosen duck size is: " + size);
	}
}