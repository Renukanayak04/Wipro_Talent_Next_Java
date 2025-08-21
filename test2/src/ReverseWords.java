package JavaProgram;
public class ReverseWords {
    public static void main(String[] args) {
        String str = "Hello World";
        String[] words = str.split(" ");
        for (String word : words) {
            System.out.print(new StringBuilder(word).reverse().toString() + " ");
        }
    }
}


