package arrayy;

import java.util.Scanner;

public class Main15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] sayilar = new int[5];
        int toplam = 0;

        System.out.println("Lütfen 5 adet tam sayı girin:");
        for (int i = 0; i < sayilar.length; i++) {
            System.out.print((i + 1) + ". sayıyı girin: ");
            sayilar[i] = input.nextInt();
        }
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        System.out.println("Girilen sayıların toplamı: " + toplam);
        input.close();
    }
}
/*
Lütfen 5 adet tam sayı girin:
1. sayıyı girin: 5
2. sayıyı girin: 6
3. sayıyı girin: 7
4. sayıyı girin: 8
5. sayıyı girin: 5

Girilen sayıların toplamı: 31

           Main15
-----------------------------
scanner : Scanner
toplam : int
sayılar : int[]
-----------------------------
main(args : String[]) : void
-----------------------------
 */
