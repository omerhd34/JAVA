package arrayy;

import java.util.Scanner;

public class Main19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] renkler = new String[3];
        System.out.println("Lütfen 3 adet renk ismi girin:");
        for (int i = 0; i < renkler.length; i++) {
            System.out.print((i + 1) + ". rengi girin: ");
            renkler[i] = scanner.nextLine();
        }
        System.out.println("\nGirilen Renkler:");
        for (int i = 0; i < renkler.length; i++) {
            System.out.println((i + 1) + ". " + renkler[i]);
        }
        System.out.print("\n2. rengi güncellemek için yeni rengi girin: ");
        String yeniRenk = scanner.nextLine();
        renkler[1] = yeniRenk;
        System.out.println("\nGüncellenmiş Renkler:");
        for (int i = 0; i < renkler.length; i++) {
            System.out.println((i + 1) + ". " + renkler[i]);
        }
        scanner.close();
    }
}
/*
Lütfen 3 adet renk ismi girin:
1. rengi girin: MAVİ
2. rengi girin: KIRMIZI
3. rengi girin: YEŞİL

Girilen Renkler:
1. MAVİ
2. KIRMIZI
3. YEŞİL

2. rengi güncellemek için yeni rengi girin: SİYAH

Güncellenmiş Renkler:
1. MAVİ
2. SİYAH
3. YEŞİL
 */
