package kodluyoruzilkrepo.Transpoz;

import java.util.Scanner;

public class Transpoz {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row, column;
        System.out.print("Satır sayısı: ");
        row = scn.nextInt();
        System.out.print("Sutün sayısı: ");
        column = scn.nextInt();

        int[][] matrix = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = scn.nextInt();
            }
        }
        int[][] transpoz = new int[column][row];
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                transpoz[i][j] = matrix[j][i];
            }
        }

        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.printf("%d ", transpoz[i][j]);
            }
            System.out.println("");
        }
    }
}
