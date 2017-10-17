package ClassDay;
import java.util.*;
public class Circle {
	 //this part is used to declare variables
	/**
	 * there are 2 properties of Circle: radius with datatype float, color with datatype String
	 * declare constant PI = 3.14f
	 */
	private float radius;
	private String color;
	private final float PI = 3.14f;
	private static Random rng = new Random ();
	

	//Create default constructor
	/**
	 * Create default constructor which inclules radius and color with its default values
	 *  default constructor does not have any parameters 
	 *  set radius is 3.22 and color is red
	 */
	public Circle () {
		radius = 3.22f;
		color = "Red";
	}
	
	//using array to create random color 
	public static  String colArray () {
		
		String[] colorArray = { "Green", "Red", "Purple", "Yellow", "Pink", "Brown", "White", "Black", "Blue", "Orange", "Grey", "Coral" };
	
		
		return colorArray [rng.nextInt(12)];
	}
	// practices of Array List
	public static ArrayList<Circle> circleList (float radius) {
		ArrayList <Circle> al = new ArrayList <Circle> ();
		
		int[] circleArray = {2, 3, 4, 5, 6, 7, 8 };
		int x = circleArray [rng.nextInt(7)];
		for (int i = 1; i <= x; i++) {	
			Circle C = new Circle(radius / 2, Circle.colArray());
		al.add(C);
		}
		return al;
	}
	
	
	//Create parameterized constructor
	/**
	 * @param r is linked with radius 
	 * color is defaut with white
	 */
	
	public Circle (float r, String col) {
		radius = r;
		color = col;
		
	}
	
	public Circle (float radius,String [] color) {
		this.radius = radius;
		

	}
	//this method is used to calculate area of circle
	public float getArea () {
		return radius*radius*PI;

	}
	
	//Option 2: Using getter and setter to take radius out
	/**
	 * @param radius 
	 */
	public void setRadius (float radius) {
		this.radius = radius;
		/*System.out.println("radius is " + radius);*/
	}
	/** 
	 * @return radius
	 */
	public float getRadius () {
		/*System.out.println("getting radius" + radius);*/
		return this.radius;
	}

	
	public static String randomColor ( String characters, int length)
	{
	    char[] text = new char[length];
	    for (int i = 0; i < length; i++)
	    {
	        text[i] = characters.charAt(rng.nextInt(characters.length()));
	    }
	    return new String(text);
	}
	public String toString () {
		return " has radius " + radius + " and color " + color;
	}
	
	
	
	
	
	
	
}