package Chapter10;
public class Player
{
	static int playerCount;
	private String name;
	
	public Player(String n)
	{
		playerCount++;
		name = n;
		System.out.println("Player Name: " + n);
		System.out.println("Number of players: " + playerCount);
	}
}