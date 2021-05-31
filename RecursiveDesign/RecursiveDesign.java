package kodluyoruzilkrepo.RecursiveDesign;

import java.util.Scanner;

public class RecursiveDesign {
    public static int copy;

    static void rec(int n) {
        if (n > copy) {
            return;
        } else if (n <= 0) {
            System.out.printf("%d ", n);
            up(n + 5);
        }
        System.out.printf("%d ", n);
        rec(n - 5);
    }

    static void up(int n) {
        if (n > copy) {
            System.exit(0);
        } else if (n >= 0) {
            System.out.printf("%d ", n);
            up(n + 5);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n;
        System.out.print("N Sayısı: ");
        n = scn.nextInt();
        copy = n;
        rec(n);
        scn.close();
    }
}
