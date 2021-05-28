package kodluyoruzilkrepo.daire;

import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float yari_cap,açı;
        System.out.print("Yarıçapı giriniz: ");
        yari_cap = scn.nextFloat();
        System.out.print("Açıyı giriniz: ");
        açı = scn.nextFloat();


        float alan = (float) (Math.PI * yari_cap * yari_cap);

        float cevre = (float) (2 * Math.PI * yari_cap);

        float dilim_alan = (float) (Math.PI * (yari_cap * yari_cap) * açı) / 360;

        System.out.println("Daire alanı = " + alan);
        System.out.println("Daire çevresi = " + cevre);
        System.out.println("Daire diliminin alanı = " + dilim_alan);

        scn.close();
        
    }
}
