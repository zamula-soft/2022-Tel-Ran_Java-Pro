package lesson11.homework;

import java.util.Stack;

public class checkBrackets {
    public static void main(String[] args) {

        System.out.println(checkBalanceBrackets("{}()"));
        System.out.println(checkBalanceBrackets("{()[]}"));
        System.out.println(checkBalanceBrackets("[}"));
        System.out.println(checkBalanceBrackets("{{{{])"));
    }

    public static boolean checkBalanceBrackets(String brackets){
        Stack<Character> stack = new Stack<>();
        for (char ch: brackets.toCharArray()) {
            if (ch == '[' || ch == '(' || ch == '{'){
                stack.push(ch);
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
