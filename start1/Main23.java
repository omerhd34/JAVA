package start;

import java.util.Scanner;

public class Main23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir kelime girin: ");
        String kelime = scanner.nextLine();

        int uzunluk = kelime.length();
        int ortaNokta = uzunluk / 2;         // Kelimenin ortası
        // Kelimeyi 2 parçaya ayır
        String birinciKelime = kelime.substring(0, ortaNokta);
        String ikinciKelime = kelime.substring(ortaNokta);

        System.out.println("Birinci kelime: " + birinciKelime);
        System.out.println("İkinci kelime: " + ikinciKelime);

        scanner.close();
    }
}
/*
Bir kelime girin: GALATASARAY
Birinci kelime: GALATA
İkinci kelime: SARAY

Bir kelime girin: FENERBAHÇE
Birinci kelime: FENER
İkinci kelime: BAHÇE
 */
