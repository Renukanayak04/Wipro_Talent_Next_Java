package JavaProgram;
public class KadanesAlgorithm {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int max = arr[0], curr = arr[0];

        for (int i = 1; i < arr.length; i++) {
            curr = Math.max(arr[i], curr + arr[i]);
            max = Math.max(max, curr);
        }
        System.out.println("Maximum Subarray Sum: " + max);
    }
}
