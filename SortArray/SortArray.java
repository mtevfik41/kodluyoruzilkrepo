package kodluyoruzilkrepo.SortArray;

import java.util.Scanner;

public class SortArray {

    static void mergeSort(int[] arr, int left, int right) {
        if (right <= left)
            return;
        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int leftLength = mid - left + 1;
        int rightLength = right - mid;

        int[] leftArray = new int[leftLength];
        int[] rightArray = new int[rightLength];

        for (int i = 0; i < leftLength; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int i = 0; i < rightLength; i++) {
            rightArray[i] = arr[mid + i + 1];
        }

        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = left; i < right + 1; i++) {
            if (leftIndex < leftLength && rightIndex < rightLength) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    arr[i] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    arr[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            } else if (leftIndex < leftLength) {
                arr[i] = leftArray[leftIndex];
                leftIndex++;
            } else if (rightIndex < rightLength) {
                arr[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n;
        System.out.print("Eleman sayısını giriniz: ");
        n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        mergeSort(arr, 0, n - 1);
        for (int i : arr)
            System.out.printf("%d ", i);

        scn.close();
    }
}
