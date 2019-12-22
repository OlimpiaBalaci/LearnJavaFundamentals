package algorithmsAndDataStructure.algorithms;
/*
Display the Fibonacci sequence with n numbers
 */

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 1, b = 1, aux, n, count = 1;
        Scanner myNumber = new Scanner(System.in);
        n = myNumber.nextInt();

        while (count <= n) {
            System.out.println(a + " ");
            count++;
            aux = b;
            b = a + b;
            a = aux;
        }
    }
}
