package kodluyoruzilkrepo.ArtikYil;

import java.util.Scanner;

public class ArtikYil {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Yıl Giriniz : ");
        int year = scn.nextInt();

        if (isLeapYear(year))
            System.out.println(year + " bir artık yıldır !");
        else
            System.out.println(year + " bir artık yıl değildir !");

        scn.close();

    }

    public static boolean isLeapYear(int year) {
        if (year % 4 != 0)
            return false;

        if (year % 100 == 0 && year % 400 != 0)
            return false;

        return true;
    }
}