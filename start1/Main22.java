package start;

import java.util.Scanner;

public class Main22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Dönüşüm tipi seçimi
        System.out.println("Sıcaklık dönüşüm tipini seçin:");
        System.out.println("1: Celsius'tan Fahrenheit'e çevir");
        System.out.println("2: Fahrenheit'ten Celsius'a çevir");
        int secim = scanner.nextInt();
        if (secim == 1) {               // Celsius'tan Fahrenheit'e dönüşüm
            System.out.print("Lütfen Celsius (°C) cinsinden sıcaklık değeri girin: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println(celsius + " °C = " + fahrenheit + " °F");
        } else if (secim == 2) {     // Fahrenheit'ten Celsius'a dönüşüm
            System.out.print("Lütfen Fahrenheit (°F) cinsinden sıcaklık değeri girin: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println(fahrenheit + " °F = " + celsius + " °C");
        } else {
            System.out.println("Geçersiz seçim. Lütfen 1 veya 2'yi seçin.");
        }
        scanner.close();      // Scanner'ı kapat
    }
}
/*
Sıcaklık dönüşüm tipini seçin:
1: Celsius'tan Fahrenheit'e çevir
2: Fahrenheit'ten Celsius'a çevir
1
Lütfen Celsius (°C) cinsinden sıcaklık değeri girin: 50
50.0 °C = 122.0 °F


Ve;


Sıcaklık dönüşüm tipini seçin:
1: Celsius'tan Fahrenheit'e çevir
2: Fahrenheit'ten Celsius'a çevir
2
Lütfen Fahrenheit (°F) cinsinden sıcaklık değeri girin: 24
24.0 °F = -4.444444444444445 °C


           Main22
-----------------------------
secim : int
celcius : double
fahrenheit : double
-----------------------------
main(args : String[]) : void
-----------------------------

 */
