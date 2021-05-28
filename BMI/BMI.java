package kodluyoruzilkrepo.BMI;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        float kg,boy;

        System.out.print("Kilonuzu giriniz: ");
        kg = scn.nextFloat();
        System.out.print("Boyunuzu(metre) giriniz: ");
        boy = scn.nextFloat();

        float bmi = kg / (boy * boy);

        System.out.println("Vücut kitle endeksiniz: " + bmi);

        scn.close();
    }
}
