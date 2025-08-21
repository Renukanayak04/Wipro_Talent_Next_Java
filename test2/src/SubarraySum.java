package JavaProgram;
public class SubarraySum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int sum = 12;
        int curr = 0, start = 0;

        for (int end = 0; end < arr.length; end++) {
            curr += arr[end];
            while (curr > sum) curr -= arr[start++];
            if (curr == sum) {
                System.out.println("Subarray found from index " + start + " to " + end);
                return;
            }
        }
        System.out.println("No subarray found");
    }
}


