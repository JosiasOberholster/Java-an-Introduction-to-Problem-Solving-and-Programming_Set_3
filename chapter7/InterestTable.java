package chapter7;

/*
	Displays a two-dimensional table showing how
	interest rate affect bank balances.
	Author: Josias JJ Oberholster.
	Chapter 7 Listing 7.12.
	Last Changed: 23 October 2017.
*/

public class InterestTable {

	public static void main(String[] args){
		
		int[][] table = new int[10][6];
		
		for(int row = 0; row < 10; row++){
			for(int column = 0; column < 6; column++){
				table[row][column] = getBalance(1000.00, row + 1, (5 + 0.5 * column));
			}
		}
		
		System.out.println("Balance for Various Interest Rates Compoounded Annually");
		System.out.println("(Rounded to whole dollar amounts)");
		System.out.println();
		System.out.println("Years 5.00% 5.50% 6.00% 6.50% 7.00% 7.50%");
		
		for(int row = 0; row < 10; row++){
			System.out.print((row + 1) + " ");
			
			for(int column = 0; column < 6; column++){
				System.out.print("$" + table[row][column] + " ");	
			}
			
			System.out.println();
		}
	}
	
	/*
		Returns the balance in an account after a given number of years
		and interest rate with an initial balance of startBalance.
		Interest is compounded annually. The balance is rounded 
		to a whole number. 
	*/
	public static int getBalance(double startBalance, int years, double rate){
		double runningBallance = startBalance;
		
		for(int count = 1; count <= years; count++){
			runningBallance = runningBallance * (1 + rate / 100);
		}
		return (int)(Math.round(runningBallance));
	}
}
