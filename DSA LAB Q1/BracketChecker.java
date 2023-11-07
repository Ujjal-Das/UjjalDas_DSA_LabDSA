public class BracketChecker {
    public static void main(String[] args) {
        String input1 = "( [ [ { } ] ] )";
        String input2 = "( [ [ { } ] ] ) )";

        if (BalancedBrackets.isBalanced(input1)) {
            System.out.println("The entered String has Balanced Brackets");
        } else {
            System.out.println("The entered String does not contain Balanced Brackets");
        }

        if (BalancedBrackets.isBalanced(input2)) {
            System.out.println("The entered String has Balanced Brackets");
        } else {
            System.out.println("The entered String does not contain Balanced Brackets");
        }
    }
}
