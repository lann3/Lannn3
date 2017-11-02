package ClassDay;

import java.util.Random;
import java.util.Arrays;

public class Family {
	private String name;
	private  int age;
	private String role;
	public static Random rng = new Random();

	public Family(String name, int age,  String role) {
		this.name = name;
		this.age = age;
		this.role = role;
	}

	public String toString() {
		return "info of person: " + name + " " +  age + " " + role;
	}

	public static void main(String[] args) {
		String[] arrRole = { "younger sister", "older brother", "Mother", "Father"};
		
		
		for (int i = 1; i <= 10; i++) {
			
			int [] arrAge = {rng.nextInt(100), rng.nextInt(100), rng.nextInt(100), rng.nextInt(100)};
			for (int no : arrAge) {
				System.out.println("number before sort " + no);
			}
			
			Arrays.sort(arrAge);
			for (int x : arrAge) {
				System.out.println("number after sort " + x);
			}
			
			System.out.println("family " + i);
			for (int x = 0; x < 4; x++) {
				String ranName = Town.randomName("MICHELL", 7);
				Family F = new Family(ranName, arrAge[x] , arrRole[x]);
				System.out.println(F);
			}
			
		}

	}

	
}
