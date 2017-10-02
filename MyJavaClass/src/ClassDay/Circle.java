package ClassDay;

public class Circle {
	// this part is used to declare variables
	private float radius;
	private String color;
	private final float PI = 3.14f;

	//Create default constructor 
	public Circle () {
		radius = 3.22f;
		color = "Red";
	}
	//Create parameterized constructor
	
	public Circle (float r) {
		radius = r;
		
	}
	//this method is used to calculate area of circle
	public float getArea () {
		return radius*radius*PI;

	}
	
	//Option 2: Using getter and setter to take radius out
	public void setRadius (float radius) {
		this.radius = radius;
		/*System.out.println("radius is " + radius);*/
	}
	public float getRadius () {
		/*System.out.println("getting radius" + radius);*/
		return this.radius;
	}

}