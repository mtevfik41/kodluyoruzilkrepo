package kodluyoruzilkrepo.SinifGecme;

import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float matematik,fizik,turkce,kimya,muzik;
        System.out.print("Matematik notunuzu giriniz: ");
        matematik = scn.nextFloat();
        System.out.print("Fizik notunuzu giriniz: ");
        fizik = scn.nextFloat();
        System.out.print("Turkce notunuzu giriniz: ");
        turkce = scn.nextFloat();
        System.out.print("Kimya notunuzu giriniz: ");
        kimya = scn.nextFloat();
        System.out.print("Muzik notunuzu giriniz: ");
        muzik = scn.nextFloat();

        float ort = 0;
        ort += (matematik >= 0 && matematik <= 100) ? matematik : 0;
        ort += (fizik >= 0 && fizik <= 100) ? fizik : 0;
        ort += (turkce >= 0 && turkce <= 100) ? turkce : 0;
        ort += (kimya >= 0 && kimya <= 100) ? kimya : 0;
        ort += (muzik >= 0 && muzik <= 100) ? muzik : 0;

        ort /= 5;
        System.out.print("Ortalamaniz = " + ort + "\n");
        System.out.println((ort >= 55) ? "Gectiniz." : "Kaldınız.");

        scn.close();
    }
}