package JavaProgram;
import java.util.*;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {4,5,2,25};
        Stack<Integer> st = new Stack<>();
        int[] res = new int[arr.length];
        Arrays.fill(res, -1);

        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                res[st.pop()] = arr[i];
            }
            st.push(i);
        }
        System.out.println(Arrays.toString(res));
    }
}
