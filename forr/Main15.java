package forr;

import java.util.Scanner;

public class Main15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");      // Bir sayı girin: 5
        int num = scanner.nextInt();
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        scanner.close();
        if (isPrime) {
            System.out.println(num + " bir asal sayıdır.");
        } else {
            System.out.println(num + " asal bir sayı değildir.");
        }        // 5 bir asal sayıdır.
    }
}
