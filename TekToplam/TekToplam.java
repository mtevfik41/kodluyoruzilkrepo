package kodluyoruzilkrepo.TekToplam;

import java.util.Scanner;

public class TekToplam {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n1 = 0;
        int toplam = 0;
        while (n1 % 2 != 1) {
            System.out.print("Cift sayi giriniz: ");
            n1 = scn.nextInt();
            if (n1 % 4 == 0 && n1 % 2 == 0) {
                toplam += n1;
            }
        }
        System.out.println("Toplam = " + toplam);
        scn.close();
    }
}
