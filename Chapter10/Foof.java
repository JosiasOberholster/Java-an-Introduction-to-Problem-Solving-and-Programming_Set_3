package Chapter10;
public class Foof
{
	final int size = 3; //Now the variable can't be changed
	final int whuffie;
	
	Foof()
	{
		whuffie = 42; // Wwhuffie can't be changed
	}
	
	void doStuff(final int x)
	{
		//x can't be changed
	}
	
	void doMore()
	{
		final int z = 7;
		//z can't be changed
	}
}