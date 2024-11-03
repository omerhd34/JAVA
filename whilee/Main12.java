package whilee;

import java.util.Scanner;

public class Main12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");       // Bir sayı girin: 56
        int num = scanner.nextInt();
        int sum = 0;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Basamakların toplamı: " + sum);   // Basamakların toplamı: 11
        scanner.close();
    }
}
