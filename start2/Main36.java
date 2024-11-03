package start;

import java.util.Scanner;

public class Main36 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kilonuzu (kg cinsinden) girin: ");
        double kilo = scanner.nextDouble();
        System.out.print("Boyunuzu (metre cinsinden) girin: ");
        double boy = scanner.nextDouble();

        double vki = kilo / (boy * boy);
        System.out.printf("Vücut Kitle İndeksiniz: %.2f\n", vki);
        if (vki < 18.5) {
            System.out.println("Durum: Zayıf");
        } else if (vki >= 18.5 && vki < 24.9) {
            System.out.println("Durum: Normal kilolu");
        } else if (vki >= 25 && vki < 29.9) {
            System.out.println("Durum: Fazla kilolu");
        } else {
            System.out.println("Durum: Obez");
        }
        scanner.close();
    }
}
/*
Kilonuzu (kg cinsinden) girin: 82
Boyunuzu (metre cinsinden) girin: 1,72
Vücut Kitle İndeksiniz: 27,72
Durum: Fazla kilolu
 */
