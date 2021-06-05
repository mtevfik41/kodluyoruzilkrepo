package kodluyoruzilkrepo.MineSweeper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row, column;
        System.out.print("Satırı giriniz: ");
        row = scn.nextInt();
        System.out.print("Sutünü giriniz: ");
        column = scn.nextInt();

        MineSweeper mn = new MineSweeper(row, column);
        mn.run();
    }
}
