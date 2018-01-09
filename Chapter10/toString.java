package Chapter10;
public class toString
{
	double d1 = 42.5;
	double d2 = 52.4; 
	
	public void Conv1()
	{
		String doubleString = "" + d1;
		System.out.println(doubleString);
	}
	
	public void Conv2()
	{
		String doubleString = Double.toString(d2);
		System.out.println(doubleString);
	}
}