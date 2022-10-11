// Java Program to Traverse through HashMap
// Using Iterator

// Importing required classes
import java.util.*;

// Main class
class GFG {

	// Main driver method
	public static void main(String[] args)
	{

		// Creating an Hashmap of string-integer pairs
		// It contains student name and their marks
		HashMap<String, Integer> hm
			= new HashMap<String, Integer>();

		// Adding mappings to above HashMap
		// using put() method
		hm.put("GeeksforGeeks", 54);
		hm.put("A computer portal", 80);
		hm.put("For geeks", 82);

		// Printing all elements of HashMap
		System.out.println("Created hashmap is" + hm);

		// Getting an iterator
		Iterator hmIterator = hm.entrySet().iterator();

		// Display message only
		System.out.println(
			"HashMap after adding bonus marks:");

		// Iterating through Hashmap and
		// adding some bonus marks for every student
		while (hmIterator.hasNext()) {

			Map.Entry mapElement
				= (Map.Entry)hmIterator.next();
			int marks = ((int)mapElement.getValue() + 10);

			// Printing mark corresponding to string entries
			System.out.println(mapElement.getKey() + " : "
							+ marks);
		}
	}
}
