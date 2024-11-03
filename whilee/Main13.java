package whilee;

import java.util.Scanner;

public class Main13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");          // Bir sayı girin: 1354
        int num = scanner.nextInt();
        int originalNum = num;
        int result = 0;
        while (originalNum != 0) {
            int digit = originalNum % 10;
            result += Math.pow(digit, 3);
            originalNum /= 10;
        }
        if (result == num) {
            System.out.println(num + " bir Armstrong sayısıdır.");
        } else {
            System.out.println(num + " bir Armstrong sayısı değildir.");
        }
        scanner.close();
    }
}      // 1354 bir Armstrong sayısı değildir.
