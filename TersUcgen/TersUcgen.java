package kodluyoruzilkrepo.TersUcgen;

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n;
        System.out.print("Basamak sayısı: ");
        n = scn.nextInt();
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 1; j < (n - i); j++) {
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
