package lesson12;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class PalindromeChecker {
    public static void main(String[] args) {
        //anna
        // a lot of foto la

        System.out.println(checkPalidrome("alla"));
        System.out.println(checkPalidrome("alla lala"));

    }

    public static boolean checkPalidrome(String p){
        Deque<Character> deque = new ArrayDeque<>();

        p = p.replaceAll(" ", "").toLowerCase();
        for (Character ch: p.toCharArray()) {
            deque.add(ch);
        }

        while (deque.size() > 1)
        {
            if (!deque.removeFirst().equals(deque.removeLast()))
                return false;
        }

        return true;
    }

}
