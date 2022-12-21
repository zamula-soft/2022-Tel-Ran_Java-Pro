package lesson12;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ReversePolishNotation {
    public static void main(String[] args) {
        // (3 + 4 - 2) * 6
        // 3 4 + 2 - 6 *  RPN
        String toCalculate = "3 4 + 2 - 6 *";
        reversePolishCalculator(toCalculate);

    }

    public static int reversePolishCalculator(String s)
    {
        // need head and tail
        Queue<String> t = new LinkedList<>(
                Arrays.asList(
                        s.split(" ")
                )
        );
        int res =0;
        int op1 = 0;
        if (!t.isEmpty())
            op1 = Integer.parseInt(t.poll());

        while (t.size() >= 2)
        {

            int op2 = Integer.parseInt(t.poll());
            String operation = t.poll();
            switch (operation){
                case "+" -> res = op1 + op2;
                case "-" -> res = op1 - op2;
                case "*" -> res = op1 * op2;
                case "/" -> res = op1 / op2;
            }

            System.out.printf("%d %s %d = %d\n", op1, operation, op2, res);
            op1 = res;
        }

        return res;
    }
}
