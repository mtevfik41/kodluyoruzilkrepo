package kodluyoruzilkrepo.PerfectNumber;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n;
        System.out.print("Sayiyi giriniz: ");
        n = scn.nextInt();

        int toplam = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                toplam += i;
            }
        }
        if (toplam == n) {
            System.out.println("Mükemmel sayıdır.");
        } else {
            System.out.println("Mükemmel sayi değildir.");
        }
        scn.close();
    }
}
