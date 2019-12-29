package problems;

/*
Write pieces of code that count from 0 to 1000, with increments of 5.
It prints to the console only the numbers composed of the same digit. Use all 3 loop operators.
The code shall be placed in a new method, called from main. Also print the last number (1000).
You should print the same thing three times.

 */
public class PrintNumbers2 {
    public static void main(String[] args) {
        System.out.println("Solution: using while");
        printSameDigit1(1000);
        System.out.println("Solution: using do while");
        printSameDigit2(1000);
        System.out.println("Solution: using for");
        printSameDigit3(1000);
    }

    public static void printSameDigit1(int n) {
        n = 0;
        while (n < 1000) {
            if (n < 9) {
                System.out.println(n);
            } else if (n == 55 || n == 555) {
                System.out.println(n);
            }
            n += 5;
        }
        System.out.println(n);
    }

    public static void printSameDigit2(int n) {
        n = 0;
        do {
            if (n < 9) {
                System.out.println(n);
            } else if (n == 55 | n == 555) {
                System.out.println(n);
            }
            n += 5;

        } while (n < 1000);
        System.out.println(n);
    }

    public static void printSameDigit3(int n){
        int i;
        for(i=0;i<n;i+=5){
            if(i<9){
                System.out.println(i);
            }
            else if(i==55||i==555){
                System.out.println(i);
            }
        }
        System.out.println(i);
    }
}
