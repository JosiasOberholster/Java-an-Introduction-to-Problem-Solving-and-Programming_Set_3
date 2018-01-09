package Chapter9;
public class DuckSYP
{
	int pound = 6;
	float floatability = 2.1F;
	String name = "Generic";
	long[] feathers = {1, 2, 3, 4, 5, 6, 7};
	boolean canFly = true;
	int maxSpeed = 25;
	
	public DuckSYP()
	{
		System.out.println("Type 1 duck");
	}
	
	public DuckSYP(boolean fly)
	{
		canFly = fly;
		System.out.println("Type 2 duck");
	}
	
	public DuckSYP(String n, long[] f)
	{
		name = n;
		feathers = f;
		System.out.println("Type 3 duck");
	}
	
	public DuckSYP(int w, float f)
	{
		pound = w;
		floatability = f;
		System.out.println("Type 4 duck");
	}
	
	public DuckSYP(float density, int max)
	{
		floatability = density;
		maxSpeed = max;
		System.out.println("Type 5 duck");
	}
}