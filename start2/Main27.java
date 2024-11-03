package start;

import java.util.Scanner;

public class Main27 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Saat (0-23) girin: ");
        int saat = scanner.nextInt();
        System.out.print("Dakika (0-59) girin: ");
        int dakika = scanner.nextInt();
        System.out.print("Saniye (0-59) girin: ");
        int saniye = scanner.nextInt();

        if (saat < 0 || saat > 23 || dakika < 0 || dakika > 59 || saniye < 0 || saniye > 59) {
            System.out.println("Geçersiz saat, dakika veya saniye değeri girdiniz.");
        } else {

            int toplamSaniye = (saat * 3600) + (dakika * 60) + saniye;      // toplam saniye hesabı
            System.out.println("Toplam süre: " + toplamSaniye + " saniye");
        }
        scanner.close();
    }
}
/*
Saat (0-23) girin: 22
Dakika (0-59) girin: 58
Saniye (0-59) girin: 55

Toplam süre: 82735 saniye.

 */
