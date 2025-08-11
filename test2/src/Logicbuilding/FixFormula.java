package Logicbuilding;

public class FixFormula {

    public static int fixTheFormula(String input1) {
        // Lists for numbers and operators
        StringBuilder numbers = new StringBuilder();
        StringBuilder operators = new StringBuilder();

        // Separate digits and operators
        for (char ch : input1.toCharArray()) {
            if (Character.isDigit(ch)) {
                numbers.append(ch);
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                operators.append(ch);
            }
        }

        // Convert first number to integer
        int result = numbers.charAt(0) - '0';

        // Apply operators in sequence
        for (int i = 0; i < operators.length(); i++) {
            int nextNum = numbers.charAt(i + 1) - '0';
            char op = operators.charAt(i);

            switch (op) {
                case '+': result += nextNum; break;
                case '-': result -= nextNum; break;
                case '*': result *= nextNum; break;
                case '/': result /= nextNum; break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(fixTheFormula("Fo+23the3*like2+")); 
        System.out.println(fixTheFormula("we8+you2-7to/*32")); 
        System.out.println(fixTheFormula("i*-t5s-t8h1e4birds")); 
    }
}


