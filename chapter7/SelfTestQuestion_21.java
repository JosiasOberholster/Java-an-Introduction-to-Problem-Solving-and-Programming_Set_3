package chapter7;

public class SelfTestQuestion_21 {

	private static final int MAX_NUMBER = 5;
	private static double[] a;
	private static int numberUsed;
	private static double addNumber = 42;
	private static int setAfter = 1;
	
	public static void main(String[] args){
		
		
		a = new double[MAX_NUMBER];
		a[0] = 5.6;
		a[2] = 32.56;
		
		for(int i = 0; i < a.length; i++){
			
			double number = a[i];
			
			if(number != 0.0){
				System.out.println("Array a, position " + i + ", contains: " + a[i]);
				numberUsed++;
				
				if((i + 1 < a.length) && (a[i + 1] == 0.0) && (setAfter != 0)){
					a[i + 1] = addNumber;
					setAfter--;
				}
			}
		}
		
		if(numberUsed == 5){
			System.out.println("Array is full.");
		}else{
			System.out.println("Array is not full.");
		}
		
		System.out.println("Number of used elements: " + numberUsed);
	}
}