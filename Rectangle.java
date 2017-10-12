package ClassDay;
import java.util.Random;
public class Rectangle {
	/*
	 * instance variables: height, width and color are declared with private modifier
	 */
	private float height;
	private float width;
	private String color;
	private static Random rng = new Random ();
	
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
		return " has height " + height + " width " + width + " and color " + color;
	}
		
}
