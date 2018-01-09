package Chapter10;
public class Min
{
	private int min1;
	private double min2;
	
	public void getMin1(int x)
	{
		x = min1;
	}
	public int setMin1()
	{
		return min1;
	}
	
	public void getMin2(double z)
	{
		z = min2;
	}
	public double setMin2()
	{
		return min2;
	}

	public static void go1(int minx, int minz)
	{
		int a = Math.min(minx, minz);
		System.out.println(a);
	}
	
	public static void go2(double min1, double min2)
	{
		double a = Math.min(min1, min2);
		System.out.println(a);
	}
}