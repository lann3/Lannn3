package ClassDay;

public class Circle {
	float radius = 2;
	String color = "White";
	final float PI = 3.14f;

//Create default constructor
	public Circle () {
		System.out.println("radius and color of the circle respectively are: " + radius + " " + color);
	}
//Create parameterized constructor
	
	public Circle (float r) {
		radius = r;
		
	}
	
	
	public float area () {
		return radius*radius*PI;
	}
	
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle(2.5f);
		
		
		System.out.println("area of circle 2 is: " + c2.area()) ;
		System.out.println("area of circle 1 is: " + c1.area()) ;
	}

	
}