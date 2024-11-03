package start;

import java.util.Scanner;

public class Main28 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci kronometre:");
        System.out.print("Saat girin: ");
        int saat1 = scanner.nextInt();
        System.out.print("Dakika girin: ");
        int dakika1 = scanner.nextInt();
        System.out.print("Saniye girin: ");
        int saniye1 = scanner.nextInt();

        System.out.println("İkinci kronometre:");
        System.out.print("Saat girin: ");
        int saat2 = scanner.nextInt();
        System.out.print("Dakika girin: ");
        int dakika2 = scanner.nextInt();
        System.out.print("Saniye girin: ");
        int saniye2 = scanner.nextInt();

        int toplamSaniye1 = (saat1 * 3600) + (dakika1 * 60) + saniye1;
        int toplamSaniye2 = (saat2 * 3600) + (dakika2 * 60) + saniye2;

        int toplamSaniye = toplamSaniye1 + toplamSaniye2;

        int toplamSaat = toplamSaniye / 3600;
        toplamSaniye = toplamSaniye % 3600;
        int toplamDakika = toplamSaniye / 60;
        int toplamSaniyeSon = toplamSaniye % 60;

        System.out.println("İki kronometrenin toplam süresi: " + toplamSaat + " s, " + toplamDakika + " dk, " + toplamSaniyeSon + " sn.");
        scanner.close();
    }
}
/*
Birinci kronometre:
Saat girin: 25
Dakika girin: 88
Saniye girin: 66

İkinci kronometre:
Saat girin: 55
Dakika girin: 44
Saniye girin: 88

İki kronometrenin toplam süresi: 82 s, 14 dk, 34 sn
 */
