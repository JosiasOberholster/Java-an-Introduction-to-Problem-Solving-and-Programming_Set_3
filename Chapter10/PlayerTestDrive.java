package Chapter10;
public class PlayerTestDrive
{
	public static void main(String[] args)
	{
		System.out.println(Player.playerCount);
		Player p = new Player("David Blane");
		System.out.println(Player.playerCount);
	}
}