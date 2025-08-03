package Day7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filteringnegativenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> al = new ArrayList<Integer>();
	        al.add(-2);
	        al.add(3);
	        al.add(-5);

	        // Filtering even numbers
	        List<Integer> li = al.stream()
	                             .filter(x -> x < 0)
	                             .collect(Collectors.toList());

	        System.out.println("Original List: " + al);
	        System.out.println("Filtered List (Even Numbers): " + li);
	   

	}

}
