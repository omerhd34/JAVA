package method.mains;

import java.util.Scanner;

public class Main20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Araç tipini seçin (1: Araba, 2: Motor): ");
        int aracTipi = scanner.nextInt();
        System.out.print("Kaç saat kaldığınızı girin: ");
        int saat = scanner.nextInt();
        scanner.close();
        double ucret = 0.0;
        if (aracTipi == 1) {
            ucret = arabaUcretHesapla(saat);
        } else if (aracTipi == 2) {
            ucret = motorUcretHesapla(saat);
        } else {
            System.out.println("Geçersiz araç tipi seçtiniz.");
            return;
        }
        System.out.println("Ödenecek ücret: " + ucret + " TL");
    }

    public static double arabaUcretHesapla(int saat) {
        if (saat <= 1) {
            return 15.00;
        } else if (saat <= 3) {
            return 26.00;
        } else if (saat <= 6) {
            return 36.00;
        } else if (saat <= 12) {
            return 45.00;
        } else if (saat <= 24) {
            return 64.00;
        } else {
            return 64.00 + (saat - 24) * 20.00;
        }
    }

    public static double motorUcretHesapla(int saat) {
        if (saat <= 1) {
            return 7.00;
        } else if (saat <= 3) {
            return 10.00;
        } else if (saat <= 6) {
            return 15.00;
        } else if (saat <= 12) {
            return 20.00;
        } else if (saat <= 24) {
            return 30.00;
        } else {
            return 30.00 + (saat - 24) * 10.00;
        }
    }
}
/*
Araç tipini seçin (1: Araba, 2: Motor): 1
Kaç saat kaldığınızı girin: 5
Ödenecek ücret: 36.0 TL
 */
