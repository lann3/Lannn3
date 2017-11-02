package ClassDay;
import java.util.*;

public class Town {
	private Family [] families = new Family [10];
	public static Random rng = new Random ();
	public static String randomName ( String characters, int length)
	{
	    char[] text = new char[length];
	    for (int i = 0; i < length; i++)
	    {
	        text[i] = characters.charAt(rng.nextInt(characters.length()));
	    }
	    return new String(text);
	}
	
	
}

