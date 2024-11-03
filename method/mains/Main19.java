package method.mains;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main19 {

    public static int calismaYiliHesapla(LocalDate baslangicTarihi) {
        LocalDate mevcutTarih = LocalDate.now();
        if (baslangicTarihi.isAfter(mevcutTarih)) {
            throw new IllegalArgumentException("Başlangıç tarihi bugünden ileri olamaz.");
        }
        Period fark = Period.between(baslangicTarihi, mevcutTarih);
        return fark.getYears();
    }

    public static int izinHakkiHesapla(int calismaYili) {
        if (calismaYili < 1) {
            return 0;
        } else if (calismaYili < 5) {
            return 14;
        } else if (calismaYili <= 15) {
            return 20;
        } else {
            return 26;
        }
    }

    public static float izinYardimiHesapla(float maas, int izinGunSayisi) {
        return (maas / 30) * izinGunSayisi;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Maaşınızı giriniz: ");
        float maas = scanner.nextFloat();
        System.out.print("İşe başlama tarihini gün, ay, yıl olarak giriniz: ");
        int gun = scanner.nextInt();
        int ay = scanner.nextInt();
        int yil = scanner.nextInt();
        LocalDate baslangicTarihi = LocalDate.of(yil, ay, gun);
        int calismaYili = calismaYiliHesapla(baslangicTarihi);

        int izinHakki = izinHakkiHesapla(calismaYili);
        System.out.println("Toplam çalışma yılı: " + calismaYili);
        System.out.println("Hak ettiğiniz yıllık ücretli izin süresi: " + izinHakki + " gün");

        System.out.print("Kaç gün izin almak istiyorsunuz? ");
        int izinGunSayisi = scanner.nextInt();

        float izinYardimi = izinYardimiHesapla(maas, izinGunSayisi);
        System.out.println("İzin yardımı (maaş karşılığı): " + izinYardimi + " TL");
        scanner.close();
    }
}
/*
Maaşınızı giriniz: 15000
İşe başlama tarihini gün, ay, yıl olarak giriniz: 29 03 2022
Toplam çalışma yılı: 2
Hak ettiğiniz yıllık ücretli izin süresi: 14 gün
Kaç gün izin almak istiyorsunuz? 7
İzin yardımı (maaş karşılığı): 3500.0 TL
 */
