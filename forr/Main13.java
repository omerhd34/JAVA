package forr;

import java.util.Scanner;

public class Main13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] sayilar = new double[4];
        double toplam = 0.0;
        System.out.println("4 adet sayı girin:");
        for (int i = 0; i < 4; i++) {
            System.out.print((i + 1) + ". sayıyı girin: ");
            sayilar[i] = scanner.nextDouble();
            toplam += sayilar[i];
        }
        double ortalama = toplam / 4;
        double toplamFarkKare = 0.0;
        for (int i = 0; i < 4; i++) {
            toplamFarkKare += Math.pow(sayilar[i] - ortalama, 2);
        }
        double standartSapma = Math.sqrt(toplamFarkKare / 4);
        System.out.printf("Standart Sapma: %.2f%n", standartSapma);
        scanner.close();
    }
}
/*
4 adet sayı girin:
1. sayıyı girin: 5
2. sayıyı girin: 6
3. sayıyı girin: 7
4. sayıyı girin: 4

Standart Sapma: 1,12
 */
