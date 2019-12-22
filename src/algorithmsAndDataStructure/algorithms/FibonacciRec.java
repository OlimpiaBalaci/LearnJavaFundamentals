package algorithmsAndDataStructure.algorithms;

import java.util.Scanner;

public class FibonacciRec {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int valueFibonacci = recursiveFibonacci(n);
        System.out.println("Fibonacci number at position n= " + n + " is: " + valueFibonacci);

        System.out.println("The first " + n + " numbers from Fibonacci sequence are:");
        for (int i = 1; i <= n; i++) {
            System.out.print(recursiveFibonacci(i) + " ");
        }
    }

    public static int recursiveFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
        }
    }
}
