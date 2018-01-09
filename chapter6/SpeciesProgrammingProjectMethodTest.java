package chapter6;

/*
	This class will test the methods of the SpeciesProgrammingProject class.
	Author: Josias JJ Oberholster.
	Chapter 6 Programming Project 2
	Last Changed: 1 August 2017.
*/

public class SpeciesProgrammingProjectMethodTest {

	public static void main(String[] args){
		
		System.out.println("Test 1: Default Constructor.");
		SpeciesProgrammingProject spTest1 = new SpeciesProgrammingProject();
		spTest1.readInput();
		spTest1.writeoutput();
		
		System.out.println("Test 2: Set Constructors.");
		SpeciesProgrammingProject spTest2;
		spTest2 = new SpeciesProgrammingProject("pie2");
		spTest2 = new SpeciesProgrammingProject(200);
		spTest2 = new SpeciesProgrammingProject(30);
		spTest2.writeoutput();
		
		System.out.println("Test 3: Set All Constructor.");
		SpeciesProgrammingProject spTest3 = new SpeciesProgrammingProject("pie3", 300, 60);
		spTest3.writeoutput();
	}
}
