package kodluyoruzilkrepo.Kombinasyon;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n, r;
        System.out.print("N'yi giriniz: ");
        n = scn.nextInt();
        System.out.print("R'yi giriniz: ");
        r = scn.nextInt();
        int komb = (faktoriyel(n) / (faktoriyel(r) * faktoriyel(n - r)));

        System.out.println("Sonuc = " + komb);
        scn.close();
    }

    public static int faktoriyel(int n) {
        int fak = 1;
        for (int i = 1; i <= n; i++) {
            fak *= i;
        }
        return fak;
    }
}
