package kodluyoruzilkrepo.BasamakToplama;

import java.util.Scanner;

public class BasamakToplama {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n;
        System.out.print("Bir sayi giriniz: ");
        n = scn.nextInt();
        int toplam = 0;
        while (n > 0) {
            toplam += n % 10;
            n /= 10;
        }
        System.out.println("Basamakların toplamı = " + toplam);
        scn.close();
    }
}
