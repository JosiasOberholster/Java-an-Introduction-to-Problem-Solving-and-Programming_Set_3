package Chapter10;
public class Random
{
	private int r1;
	
	public void getR1(int rand1)
	{
		rand1 = r1;
	}	
	public int setR1()
	{
		return r1;
	}
	
	public static void random1(int x)
	{
		int randNum1 = x;
		int random1 = (int)(Math.random() * randNum1);
		System.out.println(random1);
	}
	
	public static void random2()
	{
		double randNum2 = Math.random();
		System.out.println(randNum2);
	}
}