package start;

import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x, y, bol;

        System.out.print("Bir sayı gir: ");   // Bir sayı gir: 5
        x = input.nextInt();
        System.out.print("Bir sayı daha gir: ");  // Bir sayı daha gir: 6
        y = input.nextInt();

        double toplam = x + y;
        double cikar = x - y;
        double carp = x * y;
        System.out.println("Toplam: " + toplam);     // Toplam: 11.0
        System.out.println("Çıkar: " + cikar);       // Çıkar: -1.0
        System.out.println("Çarp: " + carp);         // Çarp: 30.0

        if (y == 0) {
            System.out.println("Bölüm yapılamaz.");
        } else {
            bol = (double) x / (double) y;
            System.out.println("Böl: " + bol);       // Böl: 0.8333333333333334
        }
        input.close();
    }
}
/*
Bir sayı gir: 5
Bir sayı daha gir: 6
Toplam: 11.0
Çıkar: -1.0
Çarp: 30.0
Böl: 0.8333333333333334
 */
