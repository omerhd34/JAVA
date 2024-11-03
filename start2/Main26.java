package start;

import java.util.Scanner;

public class Main26 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Galibiyet sayısını girin: ");
        int galibiyetSayisi = scan.nextInt();

        System.out.print("Beraberlik sayısını girin: ");
        int beraberlikSayisi = scan.nextInt();

        int toplamPuan = (galibiyetSayisi * 3) + (beraberlikSayisi * 1);

        System.out.println("Toplam puan: " + toplamPuan);
        scan.close();
    }
}
/*
Galibiyet sayısını girin: 5
Beraberlik sayısını girin: 3
Toplam puan: 18
 */
