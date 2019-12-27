package problems;

/*
Write pieces of code that count from 0 to 1000, with increments of 5.
It prints to the console only the numbers composed of the same digit. Use all 3 loop operators.
The code shall be placed in a new method, called from main. Also print the last number (1000).
You should print the same thing three times.

 */
public class PrintNumbers {
    public static void main(String[] args) {
        countWhile(1000);
//        countDoWhile(n);
        //      countFor(n);
    }

    public static void countWhile(int n) {
        n = 0;
        int result1 = 0, result2 = 0;
        while (n < 1000) {

            if (result1 == 5 && n % 10 == 5) {
                System.out.println(n);
            } else if (result1 % 10 == 5 && result2 % 10 == 5 && n % 10 == 5) {
                System.out.println(n);
            }

            n = n + 5;
            result1 = n / 10;
            result2 = n / 100;
        }
        System.out.println(n);
    }
}


