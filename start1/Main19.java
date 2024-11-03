package start;

import java.util.Scanner;

public class Main19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ürün fiyatını girin(TL): ");
        float urunFiyati = scanner.nextFloat();                    // double urunFiyati = scanner.nextDouble();
        System.out.print("KDV oranını giriniz(0,..): ");
        float kdvOrani = scanner.nextFloat();                     // double kdvOrani = scanner.nextDouble();
        float kdvTutarı = urunFiyati * kdvOrani;
        float toplamFiyat = urunFiyati + kdvTutarı;

        System.out.printf("%.2f değerinin KDV tutarı: %.2f TL%n", urunFiyati, kdvTutarı);
        System.out.printf("%.2f TL + %.2f TL(KDV) = %.2f TL%n", urunFiyati, kdvTutarı, toplamFiyat);
        scanner.close();

    }
}
/*
Ürün fiyatını girin(TL): 1250
KDV oranını giriniz(0,..): 0,85
1250,00 değerinin KDV tutarı: 1062,50 TL
1250,00 TL + 1062,50 TL(KDV) = 2312,50 TL

           Main19
-----------------------------
urunFiyati : float
kdvFiyati : float
kdvOrani : float
toplamFiyat : float
-----------------------------
main(args : String[]) : void
-----------------------------
 */
