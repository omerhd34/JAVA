package start;

import java.util.Scanner;

public class Main33 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sınav notunu girin (0-100 arası): ");
        double notu = scanner.nextDouble();
        double gecmeNotu = 40.0;
        if (notu < 0 || notu > 100) {
            System.out.println("Geçersiz not! Lütfen 0 ile 100 arasında bir değer girin.");
        } else {
            if (notu >= gecmeNotu) {
                System.out.println("Tebrikler! Sınavı geçtiniz.");
            } else {
                System.out.println("Üzgünüm, sınavı geçemediniz.");
            }
            if (notu >= 100) {
                System.out.println("Notunuz: " + notu + " - Harf Notu: AA");
            } else if (notu >= 90) {
                System.out.println("Notunuz: " + notu + " - Harf Notu: BA");
            } else if (notu >= 70) {
                System.out.println("Notunuz: " + notu + " - Harf Notu: CB");
            } else if (notu >= 60) {
                System.out.println("Notunuz: " + notu + " - Harf Notu: CC");
            } else if (notu >= 40) {
                System.out.println("Notunuz: " + notu + " - Harf Notu: DF");
            }
        }
        scanner.close();
    }
}
/*
Sınav notunu girin (0-100 arası): 39
Üzgünüm, sınavı geçemediniz.

Sınav notunu girin (0-100 arası): 41
Tebrikler! Sınavı geçtiniz.
Notunuz: 41.0 - Harf Notu: DF
 */
