package chapter5;

/*
	This will test the species class.
	Author: Josias JJ Oberholster.
	Chapter 5 Listing 5.20.
	Last Changed: 5 June 2017.
 */

public class SpeciesTest {

	public static void main(String[] args){
		
		Species testSpecies = new Species();
		
		//Test the setSpecies method
		testSpecies.setSpecies("Tribble", 100, 50);
		
		if(testSpecies.getName().equals("Tribble") &&
		   testSpecies.getPopulation() == 100 &&
		   testSpecies.getGrowthRate() >= 49.99 &&
		   testSpecies.getGrowthRate() <= 50.01){
			System.out.println("PASS: setSpecies test.");
		}else{
			System.out.println("FAIL: setSpecies test."); 
		}
		
		//Test the predictPopulation method
		if((testSpecies.predictPopulation(-1) == 100) &&
		   (testSpecies.predictPopulation(1) == 150) &&
		   (testSpecies.predictPopulation(5) == 759)){
			System.out.println("PASS: predictPopulation test");
		}else{
			System.out.println("FAIL: predictPopulaiton test");
		}
	}
}