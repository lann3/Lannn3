package ClassDay;

public class MainMethod {
	public static void main(String[] args) {
		// Using for loop to create 10 circle with random radius
		for (int i = 1; i <= 10; i++) {
			Circle C = new Circle (2.0f);
			System.out.println( i + " circle" + " ,radius =" + C.getRadius());
		}
		
		// Using while loop to create 10 circle with random radius
		int j = 1;
		while (j <= 10) {
			Circle C = new Circle (3.5f);
			System.out.println(j + " circle" + " ,radius =" + C.getRadius());
			j++;
		}
		// Using do...while loop to create 10 circle with random radius
		int x = 1;
		do {
			Circle C = new Circle (4.0f);
			System.out.println(x + " circle" + " ,radius =" + C.getRadius());
			x++;
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
			Rectangle R = new Rectangle (4.5f, 2.0f, "green");
			System.out.println(i + " rectangle" + " height= " + R.getHeight() + " width = "+ R.getWidth());
		}
			
		// Using while loop to create 10 rectangles with random height and width
		j = 1;
		while (j <= 10) {
			Rectangle R = new Rectangle (2f, 1f, "green");
			System.out.println(j + " rectangle" + " height= " + R.getHeight() + " width = "+ R.getWidth());
			j++;
		}
			
		// Using do ... while loop to create 10 rectangles with random height and width
		x = 1;
		do {
			Rectangle R = new Rectangle (3f, 1f, "green");
			System.out.println(x + " rectangle" + " height= " + R.getHeight() + " width = "+ R.getWidth());
			x++;
		} while (x <=10);
	}

}
