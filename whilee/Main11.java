package whilee;

import java.util.Scanner;

public class Main11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        int toplam = 0;
        int carpim = 1;
        int temp = sayi;

        while (temp > 0) {
            int rakam = temp % 10;
            toplam += rakam;
            carpim *= rakam;
            temp /= 10;
        }
        if (toplam == carpim) {
            System.out.println(sayi + " bir dört dörtlük sayıdır.");
        } else {
            System.out.println(sayi + " bir dört dörtlük sayı değildir.");
        }
        scanner.close();
    }
}
/*
Bir sayı girin: 123
123 bir dört dörtlük sayıdır.

Bir sayı girin: 241
241 bir dört dörtlük sayı değildir.

NOT:
123 sayısı için 1+2+3=6  =  1+2+3=6   ve 
1×2×3=6 = 1×2×3=6                     olduğu için 123 bir dört dörtlük sayıdır.

 */
