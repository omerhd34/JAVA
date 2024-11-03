package whilee;

import java.util.Scanner;

public class Main9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("5 basamaklı bir sayı girin: ");
        int sayi = scanner.nextInt();

        if (sayi < 10000 || sayi > 99999) {
            System.out.println("Lütfen geçerli bir 5 basamaklı sayı girin.");   // 5 basamaklı bir sayı girin: 99999
        } else {
            int toplam = 0;

            while (sayi > 0) {
                toplam += sayi % 10;
                sayi /= 10;
            }
            System.out.println("Rakamların toplamı: " + toplam);     // Rakamların toplamı: 45
        }
        scanner.close();
    }
}
