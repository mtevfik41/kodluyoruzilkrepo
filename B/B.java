package kodluyoruzilkrepo.B;

public class B {
    public static void main(String[] args) {
        char[][] arr = new char[7][4];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = ' ';
            }
        }
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == 0 || j == 3) {
                    arr[i][j] = '*';
                }
                if (i == 0 || i == arr.length - 1 || i == arr.length / 2) {
                    arr[i][j] = '*';
                }
            }
        }
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.printf("\n");
        }
    }
}
