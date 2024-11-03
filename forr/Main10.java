package forr;

public class Main10 {                    // for döngüsü ile bileşik faiz hesaplamaları.

    public static void main(String[] args) {
        double amount;                     // her yılın sonunda mevduat miktarı
        double principal = 1000.0;         // faiz öncesi ilk yatırım miktarı
        double rate = 0.05;                // faiz oranı

        System.out.printf("%s%20s\n", "Yıl", "Mevduat Miktarı");

        for (int year = 1; year <= 5; year++) {                   // her bir yıl için mevduat miktarını hesapla (5 yıl)
            amount = principal * Math.pow(1.0 + rate, year);      // yeni mevduat miktarını hesapla
            System.out.printf("%4d%,20.2f\n", year, amount);
        }
    }
}
/* 
Yıl     Mevduat Miktarı
1              1.050,00
2              1.102,50
3              1.157,63
4              1.215,51
5              1.276,28    */
