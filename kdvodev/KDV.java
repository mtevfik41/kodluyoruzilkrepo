package kodluyoruzilkrepo.kdvodev;

import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float kdvli_fiyat = 0,kdvsiz_fiyat,kdv_tutari;
        System.out.print("KDV'siz fiyati giriniz: ");
        kdvsiz_fiyat = scn.nextFloat();
        float kdv_oran;
        if(kdvsiz_fiyat <= 1000) kdv_oran = 18;
        else kdv_oran = 8;

        kdv_tutari = kdvsiz_fiyat*(kdv_oran/100);
        kdvli_fiyat = kdvsiz_fiyat + kdv_tutari;

        System.out.println("KDV'siz fiyat: " + kdvsiz_fiyat);
        System.out.println("KDV'li fiyat: " + kdvli_fiyat);
        System.out.println("KDV tutarı: " + kdv_tutari);


        scn.close();
    }
}
