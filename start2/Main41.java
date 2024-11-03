package start;

import java.util.Scanner;

public class Main41 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Firmanın brüt gelirini girin: ");
        double gelir = scanner.nextDouble();
        System.out.print("Firmanın giderlerini girin: ");
        double gider = scanner.nextDouble();
        double netGelir = gelir - gider;
        double vergiOrani = 0.20;
        double vergi = 0.0;
        double netKar = 0.0;

        if (netGelir > 0) {
            vergi = netGelir * vergiOrani;
            netKar = netGelir - vergi;
        } else {
            System.out.println("Firmanın net geliri negatif ya da sıfır, bu durumda vergi yok.");
            netKar = netGelir;
        }
        System.out.println("Vergilendirilecek Net Gelir: " + netGelir + " TL");
        System.out.println("Hesaplanan Vergi: " + vergi + " TL");
        System.out.println("Vergi Sonrası Net Kâr: " + netKar + " TL");
        scanner.close();

    }
}
/*
Firmanın brüt gelirini girin: 150000
Firmanın giderlerini girin: 100000
Vergilendirilecek Net Gelir: 50000.0 TL
Hesaplanan Vergi: 10000.0 TL
Vergi Sonrası Net Kâr: 40000.0 TL
 */
