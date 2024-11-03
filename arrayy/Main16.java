package arrayy;

import java.util.Scanner;

public class Main16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] sayilar = new double[4];
        double toplam = 0;

        System.out.println("Lütfen 4 adet kesirli sayı girin:");
        for (int i = 0; i < sayilar.length; i++) {
            System.out.print((i + 1) + ". sayıyı girin: ");
            sayilar[i] = input.nextDouble();
        }
        for (double sayi : sayilar) {
            toplam += sayi;
        }
        double ortalama = toplam / sayilar.length;

        System.out.printf("Girilen sayıların ortalaması: %.2f%n", ortalama);
        input.close();
    }

}
/*
Lütfen 4 adet kesirli sayı girin:
1. sayıyı girin: 0,29
2. sayıyı girin: 0,75
3. sayıyı girin: 0,44
4. sayıyı girin: 0,24

Girilen sayıların ortalaması: 0,43


           Main16
-----------------------------
scanner : Scanner
toplam : double
sayılar : double[]
-----------------------------
main(args : String[]) : void
-----------------------------
 */
