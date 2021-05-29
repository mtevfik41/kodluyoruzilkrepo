package kodluyoruzilkrepo.Sicaklik;

import java.util.Scanner;

public class Sicaklik {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float sicaklik;

        System.out.print("Sıcaklığı giriniz: ");
        sicaklik = scn.nextFloat();

        if(sicaklik < 5) System.out.println("Kayak yapabilirsiniz.");
        if(sicaklik >= 5 && sicaklik < 15) System.out.println("Sinemaya gidebilirsiniz.");
        if(sicaklik >= 15 && sicaklik < 25) System.out.println("Piknik yapabilirsiniz.");
        if(sicaklik >= 25) System.out.println("Yüzmeye gidebilirsiniz.");

        scn.close();

    } 
}
