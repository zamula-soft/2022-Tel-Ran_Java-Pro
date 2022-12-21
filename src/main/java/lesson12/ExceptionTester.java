package lesson12;

public class ExceptionTester {
    public static void main(String[] args) throws MyException {
        System.out.println(divide(3, 2));
        System.out.println(divide(14,8));
        System.out.println(divide(10, 0));

        //Exception - error in program
        // JVM or code
        // Error - JVM - cannot continue

        //Runtime exceptions - error in code - errors of programmer!
        // Need to review code
        //unchecked - no need to catch

        // Exception self classes from Exception (need to catch) and RuntimeException
        //compalsory checked (try .. catch ..) or throws in main
        // throws in main - stop program
    }

    public static int divide (int a, int b) throws MyException {
        if (b == 0)
            throw new MyException("Division by zero in My exception");
        return a/b;
    }

    public static class MyException extends Exception {
        public MyException() {
            super();
        }

        public MyException(String message) {
            super(message);
        }
    }
}


