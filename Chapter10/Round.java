package Chapter10;
public class Round
{
	private double x;
	private float z;
	
	public void getX(double x1)
	{
		x1 = x;
	}
	public double setX()
	{
		return x;
	}
	
	public void getZ(float z1)
	{
		z1 = z;
	}
	public float setZ()
	{
		return z;
	}
	
	public static void go1(double x1)
	{
		double x2 = Math.round(x1);
		System.out.println(x2);
	}
	
	public static void go2(float z1)
	{
		float z2 = Math.round(z1);
		System.out.println(z2);
	}
}