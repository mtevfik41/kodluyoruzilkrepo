package kodluyoruzilkrepo.RecursivePow;

import java.util.Scanner;

public class RecursivePow {
    static int recursivePower(int base, int exponent) {
        if (exponent == 0)
            return 1;

        return recursivePower(base, exponent - 1) * base;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int base, exponent;
        System.out.print("Tabanı giriniz: ");
        base = scn.nextInt();
        System.out.print("Üssü giriniz: ");
        exponent = scn.nextInt();
        System.out.printf("Sonuç = %d\n", recursivePower(base, exponent));
        scn.close();
    }
}
