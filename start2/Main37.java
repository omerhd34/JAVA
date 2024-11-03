package start;

import java.util.Scanner;

public class Main37 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cinsiyetinizi girin (Erkek/Kadın): ");
        String cinsiyet = scanner.nextLine().trim().toLowerCase();
        System.out.print("Kilonuzu (kg cinsinden) girin: ");
        double kilo = scanner.nextDouble();
        System.out.print("Boyunuzu (metre cinsinden) girin: ");
        double boy = scanner.nextDouble();
        double vki = kilo / (boy * boy);
        System.out.printf("Vücut Kitle İndeksiniz: %.2f\n", vki);
        boolean muayeneGerekli = false;

        if (cinsiyet.equals("erkek")) {
            if (vki < 20 || vki > 25) {
                muayeneGerekli = true;
            }
        } else if (cinsiyet.equals("kadın")) {
            if (vki < 18 || vki > 24) {
                muayeneGerekli = true;
            }
        } else {
            System.out.println("Geçersiz cinsiyet girişi. Lütfen 'Erkek' veya 'Kadın' girin.");
            scanner.close();
            return;
        }
        if (muayeneGerekli) {
            System.out.println("Ön sağlık muayenesi gereklidir.");
        } else {
            System.out.println("Ön sağlık muayenesi gerekmemektedir.");
        }
        scanner.close();
    }
}
/*
Cinsiyetinizi girin (Erkek/Kadın): Erkek
Kilonuzu (kg cinsinden) girin: 82
Boyunuzu (metre cinsinden) girin: 1,72
Vücut Kitle İndeksiniz: 27,72
Ön sağlık muayenesi gereklidir.

           Main37
-----------------------------
cinsiyet : String
kilo : double
boy : double
vki : double
muayeneGerekli : boolean
-----------------------------
main(args : String[]) : void
-----------------------------
 */
