package kodluyoruzilkrepo.dikucgenodev;

import java.util.Scanner;

public class DikUcgen {
    public static void main(String[] args) {
        float kenar1,kenar2,kenar3;
        Scanner scn = new Scanner(System.in);
        System.out.print("Kenar 1'i giriniz: ");
        kenar1 = scn.nextFloat();
        System.out.print("Kenar 2'yi giriniz: ");
        kenar2 = scn.nextFloat();
        System.out.print("Kenar 3'ü giriniz: ");
        kenar3 = scn.nextFloat();
        float u = (kenar1 + kenar2 + kenar3) / 2;

        float alankare = u * (u - kenar1) * (u- kenar2) * (u - kenar3);
        System.out.println("Alan = " + Math.sqrt(alankare));
        scn.close();
    }
}
