package ClassDay;
import java.lang.*;
import java.util.Random;

public class MainMethod {
	public static void main(String[] args) {
		
		
		Random rng = new Random ();
		
		
		// Using for loop to create 10 circles in which contain 5 small circles with radius = 1/2 radius of parent circles
		for (int i = 1; i <= 10; i++) {
			String ranColor = Circle.randomColor("ABCXXY", 6);
			
			Circle C = new Circle ((float)rng.nextInt(7), ranColor);
			System.out.println("Circle A " + i + C);
			
			for (int a = 1; a <= 5; a++) {
				Circle C1 = new Circle (C.getRadius() / 2, ranColor);
				System.out.println("Child Cicle A" + a + C1);
			}
		}
		
		// Using while loop to create 10 circles in which contain 5 small circles with radius = 1/2 radius of parent circles
		int j = 1;
		while (j <= 10) {
			String ranColor = Circle.randomColor("ABCXXY", 6);
			
			Circle C = new Circle ((float)Math.random(), ranColor);
			System.out.println("Circle B " + j + C);
			
			int b = 1;
			while (b <=5) {
				Circle C1 = new Circle (C.getRadius() / 2, ranColor);
				System.out.println("Child Cicle B" + b + C1);
				b++;
			}
			j++;
		}
		// Using do...while loop to create 10 circles in which contain 5 small circles with radius = 1/2 radius of parent circles
		int x = 1;
		do {
			String ranColor = Circle.randomColor("ABCXXY", 6);
			
			Circle C = new Circle ((float)Math.random(), ranColor);
			System.out.println("Circle C " + x + C);
			x++;
			
			int c = 1;
			do {
				Circle C1 = new Circle (C.getRadius() / 2, ranColor);
				System.out.println("Child Cicle C" + c + C1);
				c++;
			} while (c <=5);
		}while (x <= 10);
		
		/* Create Object named Ci1 using for parameterized constructor
		 * value is 3.45
		 */
		String ranColor = Circle.randomColor("ABCXXY", 6);
		
		Circle Ci1 = new Circle (3.45f, ranColor);
		
		// declare variable "circleArea" and print area of circle
		float circleArea = Ci1.getArea();
		System.out.println("Area of circle: " + circleArea);
		
		//Option2: print out radius by using setter and getter
		System.out.println("Ci1: " + Ci1);
		
		//Create object Ci2 using for default constructor
		 
		Circle Ci2 = new Circle ();
		System.out.println("Ci2: " + Ci2);
	
	
	/**
	 * Using main method to return results
	 * 1st: create the object Rec1 with its height is 6.0, width is 2.5, and color is green
	 * create variables to get Perimeter, area and color of Object Rec1
	 * Print out  Perimeter of thr Rectangle Rec1
	 * Print out Area of thr Rectangle Rec1
	 * Print out Color of rectangle
	 */
		
		Rectangle Rec1 = new Rectangle (6.0f, 2.5f, "green");
		
		float recPerimeter = Rec1.getPeri();
		float recArea = Rec1.getArea();
		String recColor = Rec1.getColor();
		
		System.out.println("Perimeter of thr Rectangle Rec1: " + recPerimeter);
		System.out.println("Area of thr Rectangle Rec1: " + recArea);
		System.out.println("Color of rectangle is: " + recColor);
			
		// Using for loop to create 10 rectangles with random height and width
		
		for (int i = 1; i <=10; i ++) {
			String rectangleColor = Rectangle.randomColor("XYZABC", 6);
			
			Rectangle R = new Rectangle ((float)Math.random(), (float)Math.random(), rectangleColor);
			System.out.println("Rectangle A"+ i + R);
			
			for (int a =1; a <= 5; a++) {
				Rectangle R1 = new Rectangle (R.getHeight() / 2, (R.getWidth()/2), "green");
				System.out.println("Child Rectangle A" + a + R1);
			}
		}
			
		// Using while loop to create 10 rectangles with random height and width
		j = 1;
		while (j <= 10) {
			String rectangleColor = Rectangle.randomColor("XYZABC", 6);
			
			Rectangle R = new Rectangle ((float)Math.random(), (float)Math.random(), rectangleColor);
			System.out.println("Rectangle B" + j + R);
			j++;
			
			int b = 1;
			while (b <= 5) {
				Rectangle R1 = new Rectangle (R.getHeight() / 2, (R.getWidth()/2), "green");
				System.out.println("Child Rectangle B" + b + R1);
				b++;
			}
		}
			
		// Using do ... while loop to create 10 rectangles with random height and width
		x = 1;
		do {
			String rectangleColor = Rectangle.randomColor("XYZABC", 6);
			
			Rectangle R = new Rectangle ((float)Math.random(), (float)Math.random(), rectangleColor);
			System.out.println("Rectangle C" + x + R);
			x++;
			
			int c = 1;
			do {
				Rectangle R1 = new Rectangle (R.getHeight() / 2, (R.getWidth()/2), "green");
				System.out.println("Child Rectangle C" + c + R1);
				c++;
			} while (c <= 5);
		} while (x <=10);
	
	}

}
