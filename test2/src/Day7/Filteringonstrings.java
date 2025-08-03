package Day7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filteringonstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> al = new ArrayList<String>();
        al.add("admin");
        al.add("user");
        al.add("customer");
        List<String> li = al.stream()
                             .filter(s -> s.contains("e"))
                             .collect(Collectors.toList());

        System.out.println(li);
   
	}

}
