package start;

import java.util.Scanner;

public class Main10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayıyı girin: ");       // Birinci sayıyı girin: 5
        double a = scanner.nextDouble();
        System.out.print("İkinci sayıyı girin: ");        // Birinci sayıyı girin: 6
        double b = scanner.nextDouble();
        double geometrikOrtalama = Math.sqrt(a * b);
        System.out.println("Geometrik Ortalama: " + geometrikOrtalama);
        // Geometrik Ortalama: 5.477225575051661
        scanner.close();
    }
}
