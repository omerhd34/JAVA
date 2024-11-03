package start;

import java.util.Scanner;

public class Main40 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1 gün içerisinde programlama için kaç saat ayırdığınızı giriniz: ");
        double toplamSaat = scanner.nextDouble();
        System.out.print("1 gün içerisinde 'Tavsiye 1' için ayırdığınız saat giriniz: ");
        double tavsiye1Saat = scanner.nextDouble();
        System.out.print("1 gün içerisinde 'Tavsiye 2' için ayırdığınız saat giriniz: ");
        double tavsiye2Saat = scanner.nextDouble();
        System.out.print("1 gün içerisinde 'Tavsiye 3' için ayırdığınız saat giriniz: ");
        double tavsiye3Saat = scanner.nextDouble();
        // Tavsiyelere göre ayrılması gereken süreleri hesapla
        double tavsiye1Gerekli = toplamSaat * 0.40;
        double tavsiye2Gerekli = toplamSaat * 0.35;
        double tavsiye3Gerekli = toplamSaat * 0.25;
        double fark1 = tavsiye1Saat - tavsiye1Gerekli;
        String sonuc1;
        if (fark1 > 0) {
            sonuc1 = Math.abs(fark1 * 60) + " dakika fazla zaman ayırdınız.";
        } else if (fark1 < 0) {
            sonuc1 = Math.abs(fark1 * 60) + " dakika eksik zaman ayırdınız.";
        } else {
            sonuc1 = "Zamanı tam ayırdınız.";
        }
        double fark2 = tavsiye2Saat - tavsiye2Gerekli;
        String sonuc2;
        if (fark2 > 0) {
            sonuc2 = Math.abs(fark2 * 60) + " dakika fazla zaman ayırdınız.";
        } else if (fark2 < 0) {
            sonuc2 = Math.abs(fark2 * 60) + " dakika eksik zaman ayırdınız.";
        } else {
            sonuc2 = "Zamanı tam ayırdınız.";
        }
        double fark3 = tavsiye3Saat - tavsiye3Gerekli;
        String sonuc3;
        if (fark3 > 0) {
            sonuc3 = Math.abs(fark3 * 60) + " dakika fazla zaman ayırdınız.";
        } else if (fark3 < 0) {
            sonuc3 = Math.abs(fark3 * 60) + " dakika eksik zaman ayırdınız.";
        } else {
            sonuc3 = "Zamanı tam ayırdınız.";
        }
        System.out.println("'Tavsiye 1' için ayrılması gereken süre: " + (int) tavsiye1Gerekli + " saat " + (int) ((tavsiye1Gerekli - (int) tavsiye1Gerekli) * 60) + " dakika. " + sonuc1);
        System.out.println("'Tavsiye 2' için ayrılması gereken süre: " + (int) tavsiye2Gerekli + " saat " + (int) ((tavsiye2Gerekli - (int) tavsiye2Gerekli) * 60) + " dakika. " + sonuc2);
        System.out.println("'Tavsiye 3' için ayrılması gereken süre: " + (int) tavsiye3Gerekli + " saat " + (int) ((tavsiye3Gerekli - (int) tavsiye3Gerekli) * 60) + " dakika. " + sonuc3);

        scanner.close();
    }
}
/*
1 gün içerisinde programlama için kaç saat ayırdığınızı giriniz: 5
1 gün içerisinde 'Tavsiye 1' için ayırdığınız saat giriniz: 2,5
1 gün içerisinde 'Tavsiye 2' için ayırdığınız saat giriniz: 1,5
1 gün içerisinde 'Tavsiye 3' için ayırdığınız saat giriniz: 1
'Tavsiye 1' için ayrılması gereken süre: 2 saat 0 dakika. 30.0 dakika fazla zaman ayırdınız.
'Tavsiye 2' için ayrılması gereken süre: 1 saat 45 dakika. 15.0 dakika eksik zaman ayırdınız.
'Tavsiye 3' için ayrılması gereken süre: 1 saat 15 dakika. 15.0 dakika eksik zaman ayırdınız.
 */
