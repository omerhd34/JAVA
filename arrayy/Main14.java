package arrayy;

import java.util.Scanner;

public class Main14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Eleman sayısını girin: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.print("Elemanları girin: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("Sıralı dizi: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        input.close();
    }
}
/*
Eleman sayısını girin: 5
Elemanları girin: 42 34 55 66 11
Sıralı dizi: 11 34 42 55 66


           Main14
-----------------------------
scanner : Scanner
n : int
arr : int[]
-----------------------------
main(args : String[]) : void
-----------------------------
 */
