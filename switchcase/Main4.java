package switchcase;

import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hesap Makinesi");
        System.out.println("Yapmak istediğiniz işlemi seçin:");
        System.out.println("1. Toplama");
        System.out.println("2. Çıkarma");
        System.out.println("3. Çarpma");
        System.out.println("4. Bölme");
        System.out.print("Seçiminizi yapın (1-4): ");
        int secim = scanner.nextInt();
        System.out.print("Birinci sayıyı girin: ");
        double sayi1 = scanner.nextDouble();
        System.out.print("İkinci sayıyı girin: ");
        double sayi2 = scanner.nextDouble();
        double sonuc = 0;
        switch (secim) {
            case 1:
                sonuc = sayi1 + sayi2;
                System.out.println("Sonuç: " + sonuc);
                break;
            case 2:
                sonuc = sayi1 - sayi2;
                System.out.println("Sonuç: " + sonuc);
                break;
            case 3:
                sonuc = sayi1 * sayi2;
                System.out.println("Sonuç: " + sonuc);
                break;
            case 4:
                if (sayi2 != 0) {
                    sonuc = sayi1 / sayi2;
                    System.out.println("Sonuç: " + sonuc);
                } else {
                    System.out.println("Hata: Bir sayıyı sıfıra bölemezsiniz.");
                }
                break;
            default:
                System.out.println("Geçersiz seçim. Lütfen 1-4 arasında bir değer girin.");
        }
        scanner.close();
    }
}
/*
Hesap Makinesi
Yapmak istediğiniz işlemi seçin:
1. Toplama
2. Çıkarma
3. Çarpma
4. Bölme
Seçiminizi yapın (1-4): 3
Birinci sayıyı girin: 2
İkinci sayıyı girin: 5
Sonuç: 10.0
 */
