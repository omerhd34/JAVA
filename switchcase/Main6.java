package switchcase;

import java.util.Scanner;

public class Main6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sözleşme süresini (ay cinsinden) giriniz: ");
        int sozlesmeSuresi = scanner.nextInt();
        System.out.print("Fesih nedeni (1: İhtiyaç, 2: Performans, 3: Diğer): ");
        int fesihNedeni = scanner.nextInt();
        double tazminat = 0.0;
        switch (fesihNedeni) {
            case 1:
                tazminat = sozlesmeSuresi * 0.5;
                break;
            case 2:
                tazminat = sozlesmeSuresi * 1.0;
                break;
            case 3:
                tazminat = sozlesmeSuresi * 0.75;
                break;
            default:
                System.out.println("Geçersiz fesih nedeni.");
                scanner.close();
                return;
        }
        System.out.printf("Toplam tazminat: %.2f TL%n", tazminat);
        scanner.close();
    }
}
/*
Sözleşme süresini (ay cinsinden) giriniz:  10
Fesih nedeni (1: İhtiyaç, 2: Performans, 3: Diğer):  3
Toplam tazminat: 7,50 TL
 */
