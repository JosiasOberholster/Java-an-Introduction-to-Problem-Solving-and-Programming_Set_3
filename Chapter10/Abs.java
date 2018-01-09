package Chapter10;
public class Abs
{
	private int x;
	private double z;
	
	public void getX(int x1)
	{
		x1 = x;
	}
	public int setX()
	{
		return x;
	}

	public void getZ(double z1)
	{
		z1 = z;
	}
	public double setZ()
	{
		return z;
	}

	public static void go1(int x)
	{
		int abs1 = x;
		int getAbs1 = Math.abs(abs1);
		System.out.println(getAbs1);
	}
	
	public static void go2(double z)
	{
		double abs1 = z;
		double getAbs1 = Math.abs(abs1);
		System.out.println(getAbs1);
	}
}