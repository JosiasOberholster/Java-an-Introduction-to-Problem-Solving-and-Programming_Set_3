package Chapter10;
public class Convert
{
	String a = "1";
	String b = "2.123";
	String c = "true";
	
	public void Conv1()
	{
		int x = Integer.parseInt(a);
		System.out.println(x);
	}
	
	public void Conv2()
	{
		double y = Double.parseDouble(b);
		System.out.println(y);
	}
	
	public void Conv3()
	{
		boolean z = new Boolean(c).booleanValue();
		System.out.println(z);
	}
}