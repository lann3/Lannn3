package ClassDay;
import java.lang.*;

public class MainMethod {
	public static void main(String[] args) {
		// Using for loop to create 10 circles in which contain 5 small circles with radius = 1/2 radius of parent circles
		for (int i = 1; i <= 10; i++) {
			
			Circle C = new Circle ((float) Math.random());
			System.out.println("Details of Parent Circle A " + i + " is: " + "Circle " + i + " ," + "Radius: " + C.getRadius());
			for (int a = 1; a <= 5; a++) {
				Circle C1 = new Circle (C.getRadius() / 2);
				System.out.println(a + ". Radius of child circle is: " + (C.getRadius() / 2) );
			}
		}
		
		// Using while loop to create 10 circles in which contain 5 small circles with radius = 1/2 radius of parent circles
		int j = 1;
		while (j <= 10) {
			Circle C = new Circle ((float)Math.random());
			System.out.println("Details of Parent Circle B " + j + " is: " + "Circle " + j + " ," + "Radius: " + C.getRadius());
			
			int b = 1;
			while (b <=5) {
				Circle C1 = new Circle (C.getRadius() / 2);
				System.out.println(b + ". Radius of child circle is: " + (C.getRadius() / 2) );
				b++;
			}
			j++;
		}
		// Using do...while loop to create 10 circles in which contain 5 small circles with radius = 1/2 radius of parent circles
		int x = 1;
		do {
			Circle C = new Circle ((float)Math.random());
			System.out.println("Details of Parent Circle C" + x + " is: " + "Circle " + x + " ," + "Radius: " + C.getRadius());
			x++;
			
			int c = 1;
			do {
				Circle C1 = new Circle (C.getRadius() / 2);
				System.out.println(c + ". Radius of child circle is: " + (C.getRadius() / 2) );
				c++;
			} while (c <=5);
		}while (x <= 10);
		
		/* Create Object named Ci1 using for parameterized constructor
		 * value is 3.45
		 */
		Circle Ci1 = new Circle (3.45f);
		
		// declare variable "circleArea" and print area of circle
		float circleArea = Ci1.getArea();
		System.out.println("Area of circle: " + circleArea);
		
		//Option2: print out radius by using setter and getter
		System.out.println("Radius of circle Ci1: " + Ci1.getRadius());
		
		//Create object Ci2 using for default constructor
		 
		Circle Ci2 = new Circle ();
		System.out.println("Radius of circle Ci2: " + Ci2.getRadius());
	
	
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
			Rectangle R = new Rectangle ((float)Math.random(), (float)Math.random(), "green");
			System.out.println("Details of Parent Rectangle A" + i + " is: " + "Rectangle " + i + " ," + "Height: " + R.getHeight() +
					" Width " + R.getWidth());
			for (int a =1; a <= 5; a++) {
				Rectangle R1 = new Rectangle (R.getHeight() / 2, (R.getWidth()/2), "green");
				System.out.println(a + ". Height and width of child rectangle is: " + (R.getHeight() / 2) + " and " + (R.getWidth()/2));
			}
		}
			
		// Using while loop to create 10 rectangles with random height and width
		j = 1;
		while (j <= 10) {
			Rectangle R = new Rectangle ((float)Math.random(), (float)Math.random(), "green");
			System.out.println("Details of Parent Rectangle B" + j + " is: " + "Rectangle " + j + " ," + "Height: " + R.getHeight() +
					" Width " + R.getWidth());
			j++;
			int b = 1;
			while (b <= 5) {
				Rectangle R1 = new Rectangle (R.getHeight() / 2, (R.getWidth()/2), "green");
				System.out.println(b + ". Height and width of child rectangle is: " + (R.getHeight() / 2) + " and " + (R.getWidth()/2));
				b++;
			}
		}
			
		// Using do ... while loop to create 10 rectangles with random height and width
		x = 1;
		do {
			Rectangle R = new Rectangle ((float)Math.random(), (float)Math.random(), "green");
			System.out.println("Details of Parent Rectangle C" + x + " is: " + "Rectangle " + j + " ," + "Height: " + R.getHeight() +
					" Width " + R.getWidth());
			x++;
			int c = 1;
			do {
				Rectangle R1 = new Rectangle (R.getHeight() / 2, (R.getWidth()/2), "green");
				System.out.println(c + ". Height and width of child rectangle is: " + (R.getHeight() / 2) + " and " + (R.getWidth()/2));
				c++;
			} while (c <= 5);
		} while (x <=10);
	
	}

}
