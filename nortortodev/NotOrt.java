package kodluyoruzilkrepo.nortortodev;

import java.util.Scanner;

class NotOrt {
    public static void main(String[] args) {
        float mat,fiz,kim,tur,tarih,muzik;

        Scanner scn = new Scanner(System.in);
        System.out.print("Matematik notunuz: ");
        mat = scn.nextFloat();
        System.out.print("Fizik notunuz: ");
        fiz = scn.nextFloat();
        System.out.print("Kimya notunuz: ");
        kim = scn.nextFloat();
        System.out.print("Türkçe notunuz: ");
        tur = scn.nextFloat();
        System.out.print("Tarih notunuz: ");
        tarih = scn.nextFloat();
        System.out.print("Müzik notunuz: ");
        muzik = scn.nextFloat();

        float ort = (mat + fiz + kim + tur + tarih + muzik) / 6;
        String sonuc;
        sonuc = (ort >= 60) ? ("Geçtiniz") : "Kaldınız.";
        System.out.println("Ortalamanız: " + ort + "\n" + sonuc);

        scn.close();
    }
}