package Logicbuilding;

public class JumbledWords {

    public static String jumbleWord(String word, int method) {
        StringBuilder part1 = new StringBuilder();
        StringBuilder part2 = new StringBuilder();

        // Pick odd-indexed positions first (index 0, 2, 4...)
        for (int i = 0; i < word.length(); i += 2) {
            part1.append(word.charAt(i));
        }

        if (method == 1) {
            // Backward picking of even-indexed letters
            int start = (word.length() % 2 == 0) ? word.length() - 1 : word.length() - 2;
            for (int i = start; i >= 0; i -= 2) {
                part2.append(word.charAt(i));
            }
        } else if (method == 2) {
            // Forward picking of even-indexed letters
            for (int i = 1; i < word.length(); i += 2) {
                part2.append(word.charAt(i));
            }
        }

        return part1.toString() + part2.toString();
    }

    public static String jumbleSentence(String input1, int input2) {
        String[] words = input1.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            result.append(jumbleWord(words[i], input2));
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String sentence = "PROJECT BASED LEARNING";
        int method = 1; // Try changing to 2

        String output = jumbleSentence(sentence, method);
        System.out.println(output);
    }
}


