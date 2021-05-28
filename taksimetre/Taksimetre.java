package kodluyoruzilkrepo.taksimetre;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        float km_ucret,mesafe;
        Scanner scn = new Scanner(System.in);
        System.out.print("Mesafeyi giriniz: ");
        mesafe = scn.nextFloat();
        km_ucret = 2.20F;
        float taksi_ucret = 10 + mesafe*km_ucret;
        float son;
        son = (taksi_ucret < 20) ? 20 : taksi_ucret;
        System.out.println("Taksi ucreti = " + son);
        scn.close();

    }
}
