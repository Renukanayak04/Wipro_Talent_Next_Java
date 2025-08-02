package Day6;
public class AlternateAddSum {

	public static int AddSub(int N, int opt) {
	    int result = 0;

	    if (opt == 1) {
	        // +, -, +, -, ...
	        for (int i = 0; i < N; i++) {
	            int term = N - i;
	            if (i % 2 == 0) {
	                result += term;
	            } else {
	                result -= term;
	            }
	        }
	    } else if (opt == 2) {
	        // Pattern: + + - + - + ...
	        // Subtract every 3rd term starting from i=2
	        for (int i = 0; i < N; i++) {
	            int term = N - i;
	            if (i % 3 == 2) {
	                result -= term;
	            } else {
	                result += term;
	            }
	        }
	    } else {
	        System.out.println("Invalid option");
	        return -1;
	    }

	    return result;
	}

	public static void main(String[] args) {
	    System.out.println("N=6, opt=1, Result=" + AddSub(6, 1));  // Expected: 3
	    System.out.println("N=6, opt=2, Result=" + AddSub(6, 2));  // Expected: 9
	}
}
