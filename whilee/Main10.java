package whilee;

import java.util.Scanner;

public class Main10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("5 basamaklı bir sayı girin: ");
        int sayi = scanner.nextInt();
        if (sayi < 10000 || sayi > 99999) {
            System.out.println("Lütfen geçerli bir 5 basamaklı sayı girin.");
            // 5 basamaklı bir sayı girin: 13553                  5 basamaklı bir sayı girin: 12321
        } else {
            int orijinalSayi = sayi;
            int tersSayi = 0;
            while (sayi > 0) {
                int basamak = sayi % 10;
                tersSayi = tersSayi * 10 + basamak;
                sayi /= 10;
            }
            if (orijinalSayi == tersSayi) {
                System.out.println(orijinalSayi + " bir palindrom sayıdır.");
                // 13553 bir palindrom sayı değildir.
            } else {
                System.out.println(orijinalSayi + " bir palindrom sayı değildir.");
                // 12321 bir palindrom sayıdır.
            }
        }
        scanner.close();
    }
}
