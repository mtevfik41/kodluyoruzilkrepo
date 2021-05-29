package kodluyoruzilkrepo.Siralama;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Siralama {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n;
        System.out.print("Kac sayı gireceksiniz: ");
        n = scn.nextInt();

        Integer[] arr = new Integer[n];
        for(int i = 0;i < n;i++) {
            arr[i] = scn.nextInt();
        }
        Arrays.sort(arr,Collections.reverseOrder());
        for(int i = 0;i < arr.length;i++) {
            System.out.print(arr[i]);
            if(i != arr.length-1) {
                System.out.print(" > ");
            }
        }
        scn.close();
    }
}
