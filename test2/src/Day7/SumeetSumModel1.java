package Day7;
import java.util.*;

public class SumeetSumModel1 {

    // Method to find the smallest 2-digit number from a given number
    public static int getSmallestTwoDigit(String numStr) {
        int min = 99; // Start with the largest 2-digit number

        // Try every combination of 2 digits
        for (int i = 0; i < numStr.length(); i++) {
            for (int j = 0; j < numStr.length(); j++) {
                if (i != j) {
                    String twoDigitStr = "" + numStr.charAt(i) + numStr.charAt(j);
                    int value = Integer.parseInt(twoDigitStr);
                    if (value < min) {
                        min = value;
                    }
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] inputs = new String[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            inputs[i] = sc.next();
        }

        int totalSum = 0;
        for (String num : inputs) {
            int smallest = getSmallestTwoDigit(num);
            System.out.println("Smallest 2-digit from " + num + " is: " + String.format("%02d", smallest));
            totalSum += smallest;
        }

        System.out.println("Total Sum: " + totalSum);
        sc.close();
    }
}

