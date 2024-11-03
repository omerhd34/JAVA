/*
THE TORTOISE AND THE HARE(KAPLUMBAĞA VE TAVŞAN):
Yarışmacılarımız yarışa 70 karenin 1. karesinden başlar.
Her kare yarış parkuru boyunca bir pozisyonu temsil eder.
Bitiş çizgisi 70. karededir.
70. kareye ulaşan veya geçen ilk yarışmacı bir kova taze havuç ve marulla ödüllendirilir.
Parkur kaygan bir dağın yamacından yukarı doğru kıvrılır, bu yüzden yarışmacılar ara sıra zemin kaybederler.
Bir saat saniyede bir kez tıklar.
Saatin her tıkında, uygulamanız hayvanların pozisyonunu aşağıdaki tabloda yer alan kurallara göre ayarlamalıdır.
Hayvanların pozisyonlarını takip etmek için değişkenler kullanın (yani, pozisyon numaraları 1-70'tir).
Her hayvanı 1. pozisyondan ("başlangıç kapısı") başlatın.
Bir hayvan 1. kareden önce sola kayarsa, onu 1. kareye geri taşıyın.

Animal	                          Move Type	             Percentage 	     Actual move
Tortoise(Kaplumbağa)  --->   Fast plod(Hızlı ilerleme)	    50%	   3 squares to the right(Sağa doğru 3 kare)
Tortoise(Kaplumbağa)  --->   Slip(Kayma)	                20%	   6 squares to the left(Sola doğru 6 kare)
Tortoise(Kaplumbağa)  --->   Slow plod(Yavaş ilerleme)	    30%	   1 squares to the right(Sağa doğru 1 kare)

Hare(tavşan)          --->   Sleep(Uyuma)	                20%	   No move at all(Hiçbir hareket yok)
Hare(tavşan)          --->   Big hop(Büyük sıçrama)	        20%	   9 squares to the right(Sağa doğru 9 kare)
Hare(tavşan)          --->   Big slip(Büyük kayma)	        10%	   12 squares to the left(Sola doğru 12 kare)
Hare(tavşan)          --->   Small hop(Küçük atlama)        30%	   1 squares to the right(Sağa doğru 1 kare)
Hare(tavşan)          --->   Small slip(Küçük kayma)        20%	   2 squares to the left(Sola doğru 2 kare)
 */
package homework_and_lab_and_quiz.tortoise_and_hare;

import java.util.Random;

public class TortoiseAndHare2 {

    private static final int FINISH_LINE = 70;
    private int tortoisePos = 1;
    private int harePos = 1;
    private final Random random = new Random();

    public void startRace() {
        System.out.println("HEY, HERE WE GO!");

        while (tortoisePos < FINISH_LINE && harePos < FINISH_LINE) {
            moveTortoise();
            moveHare();
            printPositions();

            if (tortoisePos >= FINISH_LINE && harePos >= FINISH_LINE) {
                System.out.println("It's a tie!");
                break;
            } else if (tortoisePos >= FINISH_LINE) {
                System.out.println("TORTOISE WINS!!! YAY!!!");
                break;
            } else if (harePos >= FINISH_LINE) {
                System.out.println("HARE WINS. YUCH.");
                break;
            }
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void moveTortoise() {
        int move = random.nextInt(10) + 1;

        if (move <= 5) {
            tortoisePos += 3;
        } else if (move <= 7) {
            tortoisePos -= 6;
        } else {
            tortoisePos += 1;
        }

        if (tortoisePos < 1) {
            tortoisePos = 1;
        }
    }

    private void moveHare() {
        int move = random.nextInt(10) + 1;
        if (move <= 2) {
        } else if (move <= 4) {
            harePos += 9;
        } else if (move == 5) {
            harePos -= 12;
        } else if (move <= 7) {
            harePos += 1;
        } else {
            harePos -= 2;
        }

        if (harePos < 1) {
            harePos = 1;
        }
    }

    private void printPositions() {
        StringBuilder track = new StringBuilder();
        for (int i = 1; i <= FINISH_LINE; i++) {
            if (i == tortoisePos && i == harePos) {
                track.append("O");
            } else if (i == tortoisePos) {
                track.append("T");
            } else if (i == harePos) {
                track.append("H");
            } else {
                track.append("-");
            }
        }
        System.out.println(track);
    }

    public static void main(String[] args) {
        TortoiseAndHare2 race = new TortoiseAndHare2();
        race.startRace();
    }
}
/*
HEY, HERE WE GO!
H--T------------------------------------------------------------------
-H----T---------------------------------------------------------------
H------T--------------------------------------------------------------
-H--------T-----------------------------------------------------------
----------H--T--------------------------------------------------------
.
.
.
------------------------------------------------H--T------------------
----------------------------------------------H-------T---------------
----------------------------------------------H----------T------------
-------------------------------------------------------H--T-----------
-------------------------------------------------------------T--H-----
--------------------------------------------------------------T-------
HARE WINS. YUCH.

+------------------------------------------------------+
|                  TortoiseAndHare2                    |
+------------------------------------------------------+
| - FINISH_LINE: int = 70                              |
| - tortoisePos: int = 1                               |
| - harePos: int = 1                                   |
| - random: Random                                     |
+------------------------------------------------------+
| + startRace(): void                                  |
| - moveTortoise(): void                               |
| - moveHare(): void                                   |
| - printPositions(): void                             |
+------------------------------------------------------+
| + main(args: String[]): void                         |
+------------------------------------------------------+

 */
