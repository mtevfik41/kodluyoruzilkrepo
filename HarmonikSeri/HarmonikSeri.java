package kodluyoruzilkrepo.HarmonikSeri;

import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("N sayısını giriniz: ");
        double n = scn.nextInt();
        double result = 0;
        while (n > 0) {
            result += (1 / n);
            n--;
        }

        System.out.println(result);

        scn.close();
    }
}
