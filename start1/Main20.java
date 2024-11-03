package start;

import java.util.Scanner;

public class Main20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dönüştürmek istediğiniz birimi seçin (1: Mil'den Km'ye, 2: Km'den Mil'e): ");
        int secim = scanner.nextInt();
        if (secim == 1) {                   // Mil to km
            System.out.print("Mil cinsinden mesafeyi girin: ");
            double mil = scanner.nextDouble();
            double km = mil * 1.60934;         // 1 mil = 1.60934 km                       
            System.out.println(mil + " mil, " + km + " kilometreye eşittir.");
        } else if (secim == 2) {        //  km to mil            
            System.out.print("Km cinsinden mesafeyi girin: ");
            double km = scanner.nextDouble();
            double mil = km / 1.60934;        // 1 km = 1.0.621371 mil                                           
            System.out.println(km + " kilometre, " + mil + " mile eşittir.");
        } else {
            System.out.println("Geçersiz seçim! Lütfen 1 veya 2 girin.");
        }
        scanner.close();
    }
}
/*

Dönüştürmek istediğiniz birimi seçin (1: Mil'den Km'ye, 2: Km'den Mil'e): 1
Mil cinsinden mesafeyi girin: 50
50.0 mil, 80.467 kilometreye eşittir.

Dönüştürmek istediğiniz birimi seçin (1: Mil'den Km'ye, 2: Km'den Mil'e): 2
Km cinsinden mesafeyi girin: 50
50.0 kilometre, 31.068636832490338 mile eşittir.


           Main20
-----------------------------
secim : int
mil : double
kilometre : double
-----------------------------
main(args : String[]) : void
-----------------------------
 */
