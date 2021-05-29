package kodluyoruzilkrepo.Us;

import java.util.Scanner;

public class Us {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        float taban, us;
        System.out.print("Taban giriniz: ");
        taban = scn.nextFloat();
        System.out.print("Üs giriniz: ");
        us = scn.nextFloat();
        int sonuc = 1;
        for (int i = 0; i < us; i++) {
            sonuc *= taban;
        }
        System.out.println("Sonuc = " + sonuc);
        scn.close();
    }
}
