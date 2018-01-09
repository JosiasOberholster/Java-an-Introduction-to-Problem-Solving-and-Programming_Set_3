package Chapter8;
public class AnimalTestDrive
{
	public static void main(String[] args)
	{
		MyAnimalList list = new MyAnimalList();
		MyAnimalList dog = new MyAnimalList();
		MyAnimalList cat = new MyAnimalList();
		
		list.add(dog);
		list.add(cat);
		
		if(dog.equals(cat))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		System.out.println("Dog hashCode: " + dog.hashCode());
		System.out.println("Dog hashCode: " + cat.hashCode());
		
		System.out.println(dog.getClass());
		System.out.println(cat.getClass());
		
		System.out.println(dog.toString());
		System.out.println(cat.toString());
	}
}