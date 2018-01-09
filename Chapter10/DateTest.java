package Chapter10;
import java.util.Calendar;

public class DateTest
{
	public static void main(String[] args)
	{
		Calendar c = Calendar.getInstance();
		
		c.set(2004, 0, 7, 15, 40);
		long day1 = c.getTimeInMillis();
		day1 += 1000 * 60 * 60;
		
		c.setTimeInMillis(day1);
		System.out.println("New Hour: " + c.get(c.HOUR_OF_DAY));
		
		c.add(c.DATE, 35);
		System.out.println("Add 35 Days: " + c.getTime());
		
		c.roll(c.DATE, 35);
		System.out.println("Roll 35 Days: " + c.getTime());
		
		c.set(c.DATE, 1);
		System.out.println("Set to 1: " + c.getTime());
	}
}