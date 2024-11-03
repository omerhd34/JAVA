package arrayy;

import java.util.Random;

public class Main18 {

    public static void main(String[] args) {
        String[] isimler = {"Ahmet", "Mehmet", "Ayşe", "Fatma", "Ali", "Zeynep", "Emre", "Elif"};
        String[] soyisimler = {"Yılmaz", "Demir", "Kaya", "Çelik", "Arslan", "Koç", "Öztürk", "Polat"};
        Random random = new Random();
        String rastgeleIsim = isimler[random.nextInt(isimler.length)];
        String rastgeleSoyisim = soyisimler[random.nextInt(soyisimler.length)];
        int rastgeleYas = 18 + random.nextInt(48);
        String rastgeleEmail = rastgeleIsim.toLowerCase() + "." + rastgeleSoyisim.toLowerCase() + "@example.com";
        System.out.println("Rastgele Kişi Bilgisi:");
        System.out.println("İsim: " + rastgeleIsim);
        System.out.println("Soyisim: " + rastgeleSoyisim);
        System.out.println("Yaş: " + rastgeleYas);
        System.out.println("E-posta: " + rastgeleEmail);
    }
}
/*
Rastgele Kişi Bilgisi:
İsim: Elif
Soyisim: Arslan
Yaş: 42
E-posta: elif.arslan@example.com


Rastgele Kişi Bilgisi:
İsim: Emre
Soyisim: Koç
Yaş: 31
E-posta: emre.koç@example.com
 */
