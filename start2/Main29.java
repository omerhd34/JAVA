package start;

import java.util.Scanner;

public class Main29 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dönüşüm tipi seçin:");
        System.out.println("1: İnç'i santimetreye çevir");
        System.out.println("2: Santimetreyi inç'e çevir");
        int secim = scanner.nextInt();

        if (secim == 1) {
            // İnç'ten sm dönüşüm
            System.out.print("İnç cinsinden uzunluğu girin: ");
            double inc = scanner.nextDouble();
            double sm = inc * 2.54;             // 1 inç = 2.54 sm
            System.out.println(inc + " inç = " + sm + " sm");
        } else if (secim == 2) {
            // Sm inç'e dönüşüm
            System.out.print("Santimetre cinsinden uzunluğu girin: ");
            double sm = scanner.nextDouble();
            double inc = sm / 2.54;      // 1 sm = 1 / 2.54 inç
            System.out.println(sm + " sm = " + inc + " inç");
        } else {
            System.out.println("Geçersiz seçim. Lütfen 1 veya 2'yi seçin.");
        }
        scanner.close();
    }
}
/*
Dönüşüm tipi seçin:
1: İnç'i santimetreye çevir
2: Santimetreyi inç'e çevir
1
İnç cinsinden uzunluğu girin: 44
44.0 inç = 111.76 santimetre


Dönüşüm tipi seçin:
1: İnç'i santimetreye çevir
2: Santimetreyi inç'e çevir
2
Santimetre cinsinden uzunluğu girin: 34
34.0 santimetre = 13.385826771653543 inç
 */ 