package start;

import java.util.Scanner;

public class Main34 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayıyı girin: ");
        double a = scanner.nextDouble();
        System.out.print("İkinci sayıyı girin: ");
        double b = scanner.nextDouble();
        if (a <= 0 || b <= 0) {
            System.out.println("Lütfen pozitif sayılar girin.");
        } else {
            double harmonikOrtalama = (2 * a * b) / (a + b);
            System.out.println("Harmonik Ortalama: " + harmonikOrtalama);
        }
        scanner.close();
    }
}
/*
H=(2ab)/(a+b)

Birinci sayıyı girin: 55
İkinci sayıyı girin: 66

Harmonik Ortalama: 60.0

 */
