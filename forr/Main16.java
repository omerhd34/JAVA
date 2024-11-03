package forr;

import java.util.Scanner;

public class Main16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Terim sayısını girin: "); // Terim sayısını girin: 5
        int n = scanner.nextInt();
        int a = 0, b = 1;
        System.out.print("Fibonacci Serisi: " + a + " " + b);
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
        scanner.close();
    }
}   // Fibonacci Serisi: 0 1 1 2 3

