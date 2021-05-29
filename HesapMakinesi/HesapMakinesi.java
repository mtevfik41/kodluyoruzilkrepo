package kodluyoruzilkrepo.HesapMakinesi;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float n1,n2;
        int select;

        System.out.print("Birinci sayiyi giriniz: ");
        n1 = scn.nextFloat();
        System.out.print("İkinci sayiyi giriniz: ");
        n2 = scn.nextFloat();

        System.out.println("Yapmak istediğiniz işlemi seçiniz.");
        System.out.print("Toplama için 1\nÇıkarma için 2\nBölme için 3\nÇarpma için 4'ü tuşlayınız. -> ");
        select = scn.nextInt();

        switch(select) {
            case 1: System.out.println("Sonuç = " + (n1 + n2));
                break;
            case 2: System.out.println("Sonuç = " + (n1 - n2));
                break;
            case 3: System.out.println("Sonuç = " + (n1 / n2));
                break;
            case 4: System.out.println("Sonuç = " + (n1 * n2));
                break;
            default: System.out.println("Geçersiz işlem");
        }
        scn.close();
    }
}
