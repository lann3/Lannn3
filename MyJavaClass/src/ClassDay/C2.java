package ClassDay;

public class C2 {
	public static void main(String[] args) {
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
	
	}

}
