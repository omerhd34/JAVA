package switchcase;

import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir gün girin (Pazartesi, Salı, Çarşamba, Perşembe, Cuma, Cumartesi, Pazar): ");
        String gun = scanner.nextLine().trim().toLowerCase();
        switch (gun) {
            case "pazartesi":
            case "salı":
            case "çarşamba":
            case "perşembe":
            case "cuma":
                System.out.println("Girdiğiniz gün hafta içidir.");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("Girdiğiniz gün hafta sonudur.");
                break;
            default:
                System.out.println("Geçersiz gün girişi. Lütfen geçerli bir gün girin.");
        }
        scanner.close();
    }
}
/*
Bir gün girin (Pazartesi, Salı, Çarşamba, Perşembe, Cuma, Cumartesi, Pazar): SALI
Girdiğiniz gün hafta içidir.
 */
