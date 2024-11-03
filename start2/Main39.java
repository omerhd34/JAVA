package start;

import java.util.Scanner;

public class Main39 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Türkçe sınavından doğru ve yanlış sayınızı giriniz: ");
        int trDogru = scan.nextInt(), trYanlis = scan.nextInt();
        System.out.print("Matematik sınavından doğru ve yanlış sayınızı giriniz: ");
        int matDogru = scan.nextInt(), matYanlis = scan.nextInt();
        if (trDogru >= 0 && trYanlis >= 0 && matDogru >= 0 && matYanlis >= 0) {
            if ((trDogru + trYanlis) <= 50 && (matDogru + matYanlis) <= 50) {
                float trNet = trDogru - trYanlis * 0.25f;
                float matNet = matDogru - matYanlis * 0.25f;
                System.out.printf("Türkçe netiniz: %.2f%n", trNet);
                System.out.printf("Matematik netiniz: %.2f%n", matNet);
                System.out.printf("SAYISAL PUAN: 140 + %.2f * 6 + %.2f * 1.2 = %.2f puan%n", trNet, matNet, (140 + trNet * 6 + matNet * 1.2f));
                System.out.printf("SÖZEL PUAN: 140 + %.2f * 1.2 + %.2f * 6 = %.2f puan%n", trNet, matNet, (140 + trNet * 1.2 + matNet * 6));
                System.out.printf("EŞİT AĞIRLIK PUAN: 140 + %.2f * 3.6 + %.2f * 3.6 = %.2f puan%n", trNet, matNet, (140 + trNet * 3.6f + matNet * 3.6f));
            } else {
                System.out.println("TR ve MAT sorularında doğru ve yanlış sayısı 50'den büyük olamaz.");
            }
        } else {
            System.out.println("TR ve MAT sorularında doğru ve yanlış sayısı 0'dan az olamaz.");
        }
        scan.close();
    }
}
/*
Türkçe sınavından doğru ve yanlış sayınızı giriniz: 40 10
Matematik sınavından doğru ve yanlış sayınızı giriniz: 45 5
Türkçe netiniz: 37,50
Matematik netiniz: 43,75
SAYISAL PUAN: 140 + 37,50 * 6 + 43,75 * 1.2 = 417,50 puan
SÖZEL PUAN: 140 + 37,50 * 1.2 + 43,75 * 6 = 447,50 puan
EŞİT AĞIRLIK PUAN: 140 + 37,50 * 3.6 + 43,75 * 3.6 = 432,50 puan
 */
