package kodluyoruzilkrepo.MineSweeper;

import java.util.Scanner;

class MineSweeper {
    private int row;
    private int column;
    private char[][] table = new char[row][column];
    private char[][] mines = new char[row][column];

    public MineSweeper(int row, int column) {
        this.row = row;
        this.column = column;
        this.table = new char[row][column];
        this.mines = new char[row][column];
    }

    public void run() {
        int mayinAdet = (row * column) / 4;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                table[i][j] = '-';
                mines[i][j] = '-';
            }
        }
        while (mayinAdet > 0) {
            int randomRow = (int) Math.ceil(Math.random() * row) - 1;
            int randomColumn = (int) Math.ceil(Math.random() * column) - 1;
            mines[randomRow][randomColumn] = '*';
            mayinAdet--;
        }
        int select1, select2;
        while (!isFinished()) {
            Scanner scn = new Scanner(System.in);
            do {
                System.out.print("Tahmin satırını giriniz: ");
                select1 = scn.nextInt();
            } while (select1 < 0 || select1 >= row);
            do {
                System.out.print("Tahmin sutünunu giriniz: ");
                select2 = scn.nextInt();
            } while (select2 < 0 || select2 >= column);
            if (mines[select1][select2] == '*') {
                System.out.println("Mayına bastınız, maalesef kaybettiniz.");
                printMineTable();
                break;
            } else if (table[select1][select2] == '0') {
                System.out.println("Lütfen daha önce girmediğiniz bir konum giriniz");
            } else if (table[select1][select2] == '-') {
                table[select1][select2] = '0';
                mines[select1][select2] = '0';
                if (isFinished()) {
                    System.out.println("Tebrikler");
                    printMineTable();
                    break;
                }
                System.out.println("Diğer tura geçebilirsiniz");
            }

            if (isFinished()) {
                System.out.println("Tebrikler");
                printMineTable();
                break;
            }
            printTable();
        }
    }

    public void printTable() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (table[i][j] == '*') {

                }
                System.out.printf("%c ", table[i][j]);
            }
            System.out.println();
        }
        System.out.println("======================");
    }

    public boolean isFinished() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (mines[i][j] == '-')
                    return false;
            }
        }
        return true;
    }

    public void printMineTable() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("%c ", mines[i][j]);
            }
            System.out.println("");
        }
        System.out.println("======================");
    }
}