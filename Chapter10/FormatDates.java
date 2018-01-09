package Chapter10;
import java.util.Date;

public class FormatDates
{
	public static void main(String[] args)
	{
		Date today = new Date();
		
		String d1 = String.format("%tc", new Date());
		String d2 = String.format("%tr", new Date());
		String d3 = String.format("%tA, %tB %tD", today, today, today);
		String d4 = String.format("%tA, %<tB %<tD", today);
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
	}
}