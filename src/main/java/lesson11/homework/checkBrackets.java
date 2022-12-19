package lesson11.homework;

import java.util.Stack;

public class checkBrackets {
    public static void main(String[] args) {

        String brackets = "[(({[[]]}))]";
        String brackets1 = "[(({[[)]]}))]";

        System.out.println(checkBalanceBrackets(brackets));
        System.out.println(checkBalanceBrackets(brackets1));
    }

    public static boolean checkBalanceBrackets(String brackets){
        Stack<Character> stack = new Stack<>();
        for (char ch: brackets.toCharArray()) {
            if (ch == '[' || ch == '(' || ch == '{'){
                stack.add(ch);
            }
            else {
                switch (ch) {
                    case ']' -> {
                        if (stack.pop() != '[')
                            return false;
                    }
                    case '}' -> {
                        if (stack.pop() != '{')
                            return false;
                    }
                    case ')' -> {
                        if (stack.pop() != '(')
                            return false;
                    }
                }
            }

        }
        return true;
    }
}
