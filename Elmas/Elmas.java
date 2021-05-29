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
