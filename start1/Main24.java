package start;

import java.util.Scanner;

public class Main24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("5 kuruş adedi: ");
        int kurus5 = scanner.nextInt();
        System.out.print("10 kuruş adedi: ");
        int kurus10 = scanner.nextInt();
        System.out.print("25 kuruş adedi: ");
        int kurus25 = scanner.nextInt();
        System.out.print("50 kuruş adedi: ");
        int kurus50 = scanner.nextInt();
        System.out.print("1 lira adedi: ");
        int lira1 = scanner.nextInt();

        int toplamKurus = (kurus5 * 5) + (kurus10 * 10) + (kurus25 * 25) + (kurus50 * 50) + (lira1 * 100);
        double toplamLira = toplamKurus / 100.0;
        System.out.println("Bozuk paraların toplam değeri: " + toplamLira + " TL");
        scanner.close();
    }
}
/*
5 kuruş adedi: 10
10 kuruş adedi: 5
25 kuruş adedi: 55
50 kuruş adedi: 44
1 lira adedi: 23

Bozuk paraların toplam değeri: 59.75 TL
 */
