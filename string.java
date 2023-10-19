// Java program to Illustrate Usage of Array class
// vs Arrays Class

// Importing both classes from resprective packages
import java.lang.reflect.Array;
import java.util.Arrays;

// Main class
public class string{

	// Main driver method
	public static void main(String[] args)
	{

		// Getting the size of the array
		int[] intArray = new int[5];

		// Adding elements into the array
		// using setInt() method of Array class
		Array.setInt(intArray, 0, 10);

		// Printing the Array content
		// using util.Arrays class
		System.out.println(Arrays.toString(intArray));
	}
}

