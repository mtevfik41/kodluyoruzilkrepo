package kodluyoruzilkrepo.MinMax;

import java.util.Arrays;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n;
        System.out.print("Liste boyutunu giriniz: ");
        n = scn.nextInt();
        int k;
        System.out.print("İstenen elemanı giriniz: ");
        k = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            if (arr[i] > k) {
                System.out.printf("Küçük eleman = %d\nBüyük eleman = %d", arr[i - 1], arr[i]);
                break;
            }
        }
        scn.close();
    }
}
