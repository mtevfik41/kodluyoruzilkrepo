package kodluyoruzilkrepo.GCDveLCM;

import java.util.Scanner;

public class GCDveLCM {

    public static int gcd(int a, int b) {

        if (b == 0)
            return a;

        else
            return gcd(b, a % b);
    }

    public static int lcm(int a, int b, int gcdValue) {
        return Math.abs(a * b) / gcdValue;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a, b, gcdValue;
        System.out.print("Birinci sayiyi giriniz: ");
        a = scn.nextInt();
        System.out.print("İkinci sayiyi giriniz: ");
        b = scn.nextInt();
        gcdValue = gcd(a, b);

        System.out.println("GCD = " + gcdValue);

        System.out.println("LCM = " + lcm(a, b, gcdValue));
        scn.close();
    }
}