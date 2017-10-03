package ClassDay;

public class Rectangle {
	/*
	 * instance variables: height, width and color are declared with private modifier
	 */
	private float height;
	private float width;
	private String color;
	// Create parameterized constructor
	
	public Rectangle (float height, float width, String color) {
		this.height = height;
		this.width = width;
		this.color = color;
	}
	
	// Using getter and setter for height
	public void setHeight (float height) {
		this.height = height;
	}
	
	public float getHeight () {
		return this.height;
	}
	//Using getter and setter for width
	public void setWidth(float width) {
		this.width = width;
	}
	
	public float getWidth() {
		return this.width;
	}
	//using getter and setter for color
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
	// Calculate perimeter and area of rectangle
	
	public float getPeri() {
		return (height + width) *2;
	}
	
	public float getArea() {
		return height * width;
	}
	
	
	/**
	 * Using main method to return results
	 * 1st: create the object Rec1 with its height is 6.0, width is 2.5, and color is green
	 * create variables to get Perimeter, area and color of Object Rec1
	 * Print out  Perimeter of thr Rectangle Rec1
	 * Print out Area of thr Rectangle Rec1
	 * Print out Color of rectangle
	 */
		public static void main(String[] args) {
			Rectangle Rec1 = new Rectangle (6.0f, 2.5f, "green");
			float recPerimeter = Rec1.getPeri();
			float recArea = Rec1.getArea();
			String recColor = Rec1.getColor();
			System.out.println("Perimeter of thr Rectangle Rec1: " + recPerimeter);
			System.out.println("Area of thr Rectangle Rec1: " + recArea);
			System.out.println("Color of rectangle is: " + recColor);
		}
		
}
