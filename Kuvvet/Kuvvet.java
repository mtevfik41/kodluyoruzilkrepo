package kodluyoruzilkrepo.Kuvvet;

import java.util.Scanner;

public class Kuvvet {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n1;
        System.out.print("Bir sayi giriniz: ");
        n1 = scn.nextInt();
        double kuvvet = 0;
        for (int i = 0; i < n1; i++) {
            if (Math.pow(4, kuvvet) <= n1)
                System.out.printf("4'ün %d'ci kuvveti = %.2f\n", i, Math.pow(4.0, kuvvet));
            if (Math.pow(5, kuvvet) <= n1)
                System.out.printf("5'in %d'ci kuvveti = %.2f\n", i, Math.pow(5.0, kuvvet));
            if (Math.pow(4, kuvvet) > n1 && (Math.pow(5, kuvvet) > n1))
                break;
            kuvvet++;
        }
        scn.close();
    }
}
