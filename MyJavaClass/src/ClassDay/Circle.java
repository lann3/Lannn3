package ClassDay;

public class Circle {
	 //this part is used to declare variables
	/**
	 * there are 2 properties of Circle: radius with datatype float, color with datatype String
	 * declare constant PI = 3.14f
	 */
	private float radius;
	private String color;
	private final float PI = 3.14f;

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
	
	//Create parameterized constructor
	/**
	 * @param r is linked with radius 
	 * color is defaut with white
	 */
	
	public Circle (float r) {
		radius = r;
		color = "White";
		
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

}