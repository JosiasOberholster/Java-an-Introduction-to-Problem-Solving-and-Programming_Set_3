package Chapter9;
public class TestDuckSYP
{
	public static void main(String[] args)
	{
		int weight = 8;
		float density = 2.3F;
		String name = "Donald";
		long[] feathers = {1, 2, 3, 4, 5, 6};
		boolean canFly = true;
		int airSpeed = 22;
		
		DuckSYP[] d = new DuckSYP[7];
		
		d[0] = new DuckSYP();
		d[1] = new DuckSYP(density, weight);
		d[2] = new DuckSYP(name, feathers);
		d[3] = new DuckSYP(canFly);
		d[4] = new DuckSYP(3.3F, airSpeed);
		d[5] = new DuckSYP(false);
		d[6] = new DuckSYP(airSpeed, density);
	}
}