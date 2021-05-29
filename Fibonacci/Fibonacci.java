package kodluyoruzilkrepo.Fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static int fib(int n) {
        if (n == 0 || n == 1)
            return n;

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n;
        System.out.print("Sayiyi giriniz: ");
        n = scn.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.printf("%d ", fib(i));
        }

        scn.close();
    }
}
