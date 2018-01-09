package Chapter8;
public class MyAnimalList
{
	private MyAnimalList[] animals = new MyAnimalList[5];
	private int nextIndex = 0;
	
	public void add(MyAnimalList a)
	{
		if(nextIndex < animals.length)
		{
			animals[nextIndex] = a;
			System.out.println("Animal Added at " + nextIndex);
			nextIndex++;
		}
	}
}