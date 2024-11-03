package start;

import java.util.Scanner;

public class Main38 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Turkce yanlis ve bos sayilarini giriniz: ");
        int trYanlis = scanner.nextInt(), trBos = scanner.nextInt();
        System.out.print("Matematik yanlis ve bos sayilarini giriniz: ");
        int matYanlis = scanner.nextInt(), matBos = scanner.nextInt();
        System.out.print("Sosyal yanlis ve bos sayilarini giriniz: ");
        int sosyalYanlis = scanner.nextInt(), sosyalBos = scanner.nextInt();
        System.out.print("Fen yanlis ve bos sayilarini giriniz: ");
        int fenYanlis = scanner.nextInt(), fenBos = scanner.nextInt();
        if (trYanlis >= 0 && trBos >= 0 && matYanlis >= 0 && matBos >= 0 && fenYanlis >= 0 && fenBos >= 0 && sosyalYanlis >= 0 && sosyalBos >= 0) {
            float trDogru = 40 - (trYanlis + trBos);
            float matDogru = 40 - (matYanlis + matBos);
            float sosyalDogru = 20 - (sosyalYanlis + sosyalBos);
            float fenDogru = 20 - (fenYanlis + fenBos);
            if (trDogru >= 0 && matDogru >= 0 && sosyalDogru >= 0 && fenDogru >= 0) {
                float trNet = trDogru - (trYanlis * 0.25f);
                float matNet = matDogru - (matYanlis * 0.25f);
                float sosyalNet = sosyalDogru - (sosyalYanlis * 0.25f);
                float fenNet = fenDogru - (fenYanlis * 0.25f);

                System.out.println("\nBolum bolum netleriniz: ");
                float toplamNet = trNet + matNet + fenNet + sosyalNet;
                System.out.printf("Turkce = %s\n", trNet);
                System.out.printf("Matematik = %s\n", matNet);
                System.out.printf("Sosyal = %s\n", sosyalNet);
                System.out.printf("Fen = %s\n", fenNet);
                System.out.printf("Toplam net = %s ", toplamNet);
            } else {
                System.out.println("TR ve MAT dersi için yanlış ve boş sayıları toplamı 40 üzeri olmamalıdır.");
                System.out.println("FEN ve SOSYAL dersi için yanlış ve boş sayıları toplamı 20 üzeri olmamalıdır.");
            }
        } else {
            System.out.println("Herhangi bir dersin yanlış ve boş sayısı 0'dan küçük olmamalıdır.");
        }
        scanner.close();
    }
}
/*
Turkce yanlis ve bos sayilarini giriniz: 50 50
Matematik yanlis ve bos sayilarini giriniz: 1 1
Sosyal yanlis ve bos sayilarini giriniz:  1 1
Fen yanlis ve bos sayilarini giriniz: 1 1
TR ve MAT dersi için yanlış ve boş sayıları toplamı 40 üzeri olmamalıdır.
FEN ve SOSYAL dersi için yanlış ve boş sayıları toplamı 20 üzeri olmamalıdır.


Turkce yanlis ve bos sayilarini giriniz: -5 30
Matematik yanlis ve bos sayilarini giriniz: 5 5
Sosyal yanlis ve bos sayilarini giriniz: 5 5
Fen yanlis ve bos sayilarini giriniz: 5 5
Herhangi bir dersin yanlış ve boş sayısı 0'dan küçük olmamalıdır.


Turkce yanlis ve bos sayilarini giriniz: 5 4
Matematik yanlis ve bos sayilarini giriniz: 1 5
Sosyal yanlis ve bos sayilarini giriniz: 6 2
Fen yanlis ve bos sayilarini giriniz: 4 3

Bolum bolum netleriniz: 
Turkce = 29.75
Matematik = 33.75
Sosyal = 10.5
Fen = 12.0
Toplam net = 86.0


           Main38
-----------------------------
trDogru : float
trYanlis : int
trBos : int
matDogru : float
matYanlis : int
matBos : int
sosyalDogru : float
sosyalYanlis : int
sosyalBos : int
fenDogru : float
fenYanlis : int
fenBos : int
trNet : float
matNet : float
sosyalNet : float
fenNet : float
toplamNet : float
-----------------------------
main(args : String[]) : void
-----------------------------
 */
