package kodluyoruzilkrepo.Elmas;

import java.util.Scanner;

public class Elmas {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int n = scn.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        // int c = 2 * n - 4 + 1;
        // int t = 1;
        // for (int i = 0; i < n - 1; i++) {
        // for (int j = 0; j < t; j++) {
        // System.out.print(" ");
        // }
        // for (int k = 0; k < c; k++) {
        // System.out.print("*");
        // }
        // c -= 2;
        // t += 2;
        // System.out.println(" ");
        // }
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        scn.close();
    }
}
