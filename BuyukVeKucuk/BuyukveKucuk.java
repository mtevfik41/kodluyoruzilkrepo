package kodluyoruzilkrepo.BuyukVeKucuk;

import java.util.Scanner;

public class BuyukveKucuk {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n;
        System.out.print("Kaç sayi gireceksiniz?: ");
        n = scn.nextInt();

        int tmp;
        System.out.print("1. sayiyi giriniz: ");
        tmp = scn.nextInt();
        int max, min;
        max = tmp;
        min = tmp;
        for (int i = 1; i < n; i++) {
            System.out.printf("%d. sayiyi giriniz: ", i + 1);
            tmp = scn.nextInt();

            if (tmp > max)
                max = tmp;
            if (tmp < min)
                min = tmp;
        }
        System.out.printf("MAX = %d\nMİN = %d", max, min);
        scn.close();
    }
}
