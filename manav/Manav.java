package kodluyoruzilkrepo.manav;

import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        float armut,elma,domates,muz,patlican;

        armut = 2.14F;
        elma = 3.67F;
        domates = 1.11F;
        muz = 0.95F;
        patlican = 5.00F;


        float armut_kg,elma_kg,domat_kg,muz_kg,patlican_kg;
        System.out.print("Armut kaç kilo ?: ");
        armut_kg = scn.nextFloat();
        System.out.print("Elma kaç kilo ?: ");
        elma_kg = scn.nextFloat();
        System.out.print("Domates kaç kilo?: ");
        domat_kg = scn.nextFloat();
        System.out.print("Muz kaç kilo?: ");
        muz_kg = scn.nextFloat();
        System.out.print("Patlican kaç kilo?: ");
        patlican_kg = scn.nextFloat();

        float ucret = (armut * armut_kg) + (elma * elma_kg) + (domates * domat_kg) + (muz * muz_kg) + (patlican * patlican_kg);

        System.out.println("Toplam tutar = " + ucret + " TL");

        scn.close();

    }
}
