package chapter6;

/*
	Revised class for basic pet data: name, age, and weight.
	Author: Josias JJ Oberholster.
	Chapter 6 Listing 6.3.
	Last Changed: 11 July 2017.
*/

public class Pet2 {

		private String name;
		private int age;        //in years
		private double weight;  //in pounds
		
		public Pet2(String initialName, int initialAge, double initialWeight){
			set(initialName, initialAge, initialWeight);
		}
		
		public Pet2(String initialName){
			set(initialName, 0, 0);
		}
		
		public Pet2(int initialAge){
			set("No name yet.", initialAge, 0);
		}
		
		public Pet2(double initialWeight){
			set("No name yet.", 0, initialWeight);
		}
		
		public Pet2(){
			set("No name yet.", 0, 0);
		}
		
		public void setName(String newName){
			set(newName, age, weight);
		}
		
		public void setAge(int newAge){
			set(name, newAge, weight);
		}
		
		public void setWeight(double newWeight){
			set(name, age, newWeight);
		}
		
		
		private void set(String newName, int newAge, double newWeight){
			name = newName;
			if((newAge < 0 ) || (newWeight < 0)){
				System.out.println("ERROR: Negative age or weight");
				System.exit(0);
			}else{
				age = newAge;
				weight = newWeight;
			}
		}
		
		public String getName(){
			return name;
		}
		
		public int getAge(){
			return age;
		}
		
		public double getWeight(){
			return weight;
		}
		
		public void writeOutput(){
			System.out.println("Name: " + name);
			System.out.println("Age: " + age);
			System.out.println("Weight: " + weight + " pounds");
		}
}