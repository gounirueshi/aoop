package lambdasort;

import java.util.Arrays;
import java.util.List;

public class LambdaSortDescending {
	 public static void main(String[] args) {
	        List<String> stringList = Arrays.asList("Banana", "Apple", "Mango", "Peach");
	        
	        // Sorting the list in descending order using lambda expression
	        stringList.sort((s1, s2) -> s2.compareTo(s1));

	        // Output the sorted list
	        System.out.println("Sorted list in descending order: " + stringList);
	    }
}
