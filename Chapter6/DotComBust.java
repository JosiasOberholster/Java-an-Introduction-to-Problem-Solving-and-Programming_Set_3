package Chapter6;
import java.util.*;

public class DotComBust
{
	private GameHelper2 helper = new GameHelper2();
	private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
	private int numOfGuesses = 0;
	
	private void setUpGame()
	{
		//first make some dot coms and give them locations
		DotCom one = new DotCom();
		DotCom two = new DotCom();
		DotCom three = new DotCom();
		
		one.setName("Pets.com");
		two.setName("eToys.com");
		three.setName("Go2.com");
		
		dotComList.add(one);
		dotComList.add(two);
		dotComList.add(three);
		
		System.out.println("Your goal is to sink three dot coms");
		System.out.println("Pets.com, eToys.com, Go2.com");
		System.out.println("try to sink them all in the fewesat number of guesses");
		
		for(DotCom dotComToSet: dotComList)
		{
			ArrayList<String> newLocation = helper.placeDotCom(3);
			dotComToSet.setLocationCells(newLocation);
		}//Close loop
	}//Close setUpGame() method
	
	private void startPlaying()
	{
		while(!dotComList.isEmpty())
		{
			String userGuess = helper.getUserInput("Enter a guess");
			checkUserGuess(userGuess);
		}//Close while loop
		finishGame();
	}
	
	private void checkUserGuess(String userGuess)
	{
		numOfGuesses++;
		String result = "miss";
		
		for(DotCom dotComToTest: dotComList)
		{
			result = dotComToTest.checkYourself(userGuess);
			
			if(result.equals("hit"))
			{
				break;
			}
			
			if(result.equals("kill"))
			{
				dotComList.remove(dotComToTest);
				break;
			}
		}//CLose for loop
		System.out.println(result);
	}
	
	private void finishGame()
	{
		System.out.println("All Dot Coms are dead! Your stock is now worthless.");
		if(numOfGuesses <= 18)
		{
			System.out.println("It took you: " + numOfGuesses + " guesses");
			System.out.println("You got out before your options sank.");
		}
		else
		{
			System.out.println("Took you long enought. " + numOfGuesses + " guesses");
			System.out.println("Fish are dancing with your options");
		}
	}//Close finishGame() method
	
	public static void main(String[] args)
	{
		DotComBust game = new DotComBust();
		game.setUpGame();
		game.startPlaying();
	}//Close method
}