package kodluyoruzilkrepo.UcVeDort;

import java.util.Scanner;

public class UcVeDort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n1;
        System.out.print("Sayıyı giriniz: ");
        n1 = scn.nextInt();

        int sayac = 0;
        int toplam = 0;
        for (int i = 1; i < n1; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                sayac++;
                toplam += i;
            }
        }

        toplam /= sayac;
        System.out.println("Ortalama = " + toplam);
    }
}