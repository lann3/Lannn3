package ClassDay;
import java.lang.*;
import java.util.Random;
public class Main {
	public static void main(String[] args) {
	Random rng = new Random ();
	
	for (int i = 1; i <= 10; i++) {
		Circle C = new Circle ((float)rng.nextInt(7), Circle.colArray() );
		System.out.println("randomcolor " + C);
		
	}
	
	for (int i = 1; i <= 10; i++) {
		Rectangle R = new Rectangle ((float)rng.nextInt(7), (float)rng.nextInt(6), Rectangle.colRectangle());
		System.out.println("random Rectangle " + R);
	}
	Circle circle = new Circle (10,Circle.colArray() );
	float x = circle.getRadius();
	System.out.println("Circle List " + Circle.circleList(x));
	}

}
