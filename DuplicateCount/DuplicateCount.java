package kodluyoruzilkrepo.DuplicateCount;

import java.util.Scanner;

public class DuplicateCount {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n;
        System.out.print("Eleman sayısını giriniz: ");
        n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int counter = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    if (j > i) {
                        counter = 0;
                        break;
                    }
                    counter++;
                }
            }
            if (counter >= 1) {
                System.out.printf("%d toplamda %d kez tekrarlandı\n", arr[i], counter);
            }
            counter = 0;
        }
        scn.close();
    }
}
