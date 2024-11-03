package arrayy;

import java.util.Scanner;

public class Main17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] isimler = new String[3];
        String[] soyisimler = new String[3];
        System.out.println("Lütfen 3 adet isim girin:");
        for (int i = 0; i < isimler.length; i++) {
            System.out.print((i + 1) + ". ismi girin: ");
            isimler[i] = scanner.nextLine();
        }
        System.out.println("Lütfen 3 adet soyisim girin:");
        for (int i = 0; i < soyisimler.length; i++) {
            System.out.print((i + 1) + ". soyismi girin: ");
            soyisimler[i] = scanner.nextLine();
        }
        System.out.println("\nİsim ve Soyisimler:");
        for (int i = 0; i < isimler.length; i++) {
            System.out.println(isimler[i] + " " + soyisimler[i]);
        }
        scanner.close();
    }
}
/*
Lütfen 3 adet isim girin:
1. ismi girin: Ömer
2. ismi girin: Halis
3. ismi girin: Nisa
Lütfen 3 adet soyisim girin:
1. soyismi girin: Demir
2. soyismi girin: Yazıcı
3. soyismi girin: Demir

İsim ve Soyisimler:
Ömer Demir
Halis Yazıcı
Nisa Demir


           Main17
-----------------------------
scanner : Scanner
isimler : String[]
soyisimler : String[]
-----------------------------
main(args : String[]) : void
-----------------------------
 */
