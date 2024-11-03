package start;

import java.util.Scanner;

public class Main21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // İlk noktanın koordinantları:
        System.out.print("Birinci noktanın x koordinatını girin: ");
        double x1 = scanner.nextDouble();
        System.out.print("Birinci noktanın y koordinatını girin: ");
        double y1 = scanner.nextDouble();
        // İkinci noktanın koordinantları:
        System.out.print("İkinci noktanın x koordinatını girin: ");
        double x2 = scanner.nextDouble();
        System.out.print("İkinci noktanın y koordinatını girin: ");
        double y2 = scanner.nextDouble();
        // Ortak nokta koordinantlarını bul.
        double ortaNoktaX = (x1 + x2) / 2;
        double ortaNoktaY = (y1 + y2) / 2;
        System.out.println("Birinci ve ikinci noktanın orta noktası: (" + ortaNoktaX + ", " + ortaNoktaY + ")");
        scanner.close();
    }
}
/*
Birinci noktanın x koordinatını girin: 5
Birinci noktanın y koordinatını girin: 4
İkinci noktanın x koordinatını girin: 1
İkinci noktanın y koordinatını girin: 2

Birinci ve ikinci noktanın orta noktası: (3.0, 3.0)

           Main21
-----------------------------
x1 : double
x2 : double
y1 : double
y1 : double
ortaNoktaX : double
ortaNoktaY : double
-----------------------------
main(args : String[]) : void
-----------------------------
 */
