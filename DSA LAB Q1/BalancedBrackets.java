import java.util.Stack;

public class BalancedBrackets {
    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false; // Unbalanced, no matching opening bracket
                } else {
                    char openBracket = stack.pop();
                    if (!isMatching(openBracket, ch)) {
                        return false; // Unbalanced, brackets do not match
                    }
                }
            }
        }

        return stack.isEmpty(); // Stack is empty, all brackets are balanced
    }

    public static boolean isMatching(char open, char close) {
        return (open == '(' && close == ')') || (open == '[' && close == ']') || (open == '{' && close == '}');
    }
}
