package Lan1;

public class Puppy_age {
	 int puppyAge;
	public Puppy_age (String name) {
		System.out.println("his name is: " + name);
	}
	
	public void setAge (int age) {
		puppyAge = age;
		System.out.println("Set age is:" + age);
	}
	
	public int getAge () {
		System.out.println("His age is: " + puppyAge);
		return puppyAge;
		
	}
	
	public static void main(String[] args) {
		//create object
		Puppy_age myPuppy = new Puppy_age("Nicky");
		
		Puppy_age myPuppy1 = new Puppy_age("Nick");
		// Call class method to set age
		myPuppy.setAge(3);
		//Call another class method to get age
		myPuppy1.getAge();
		//instance variables 
		System.out.println(myPuppy1.puppyAge);
		System.out.println(myPuppy.puppyAge);
	}

}
