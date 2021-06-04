package kodluyoruzilkrepo.HarmonikOrtalama;

import java.util.Scanner;

public class HarmonikOrtalama {
    static float harmonicMean(float arr[], int n) {
        // Declare sum variables and
        // initialize with zero
        float sum = 0;
        for (int i = 0; i < n; i++)
            sum = sum + (float) 1 / arr[i];

        return (float) n / sum;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n;
        System.out.print("N sayisini giriniz: ");
        n = scn.nextInt();
        float[] arr = new float[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextFloat();
        }
        float harmonicMean = harmonicMean(arr, n);
        System.out.printf("Harmonik ortalama = %.2f", harmonicMean);
        scn.close();
    }
}
