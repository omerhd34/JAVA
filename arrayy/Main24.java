//Bu Java programı, bir zarın (6 yüzlü) 100 kez atılmasını simüle eder ve her yüzün kaç kez geldiğini sayar. 
package arrayy;

import java.security.SecureRandom;

public class Main24 {

    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();   // Rastgele sayı üretici
        int[] frequency = new int[7]; // Zar yüzleri için frekans dizisi (7 elemanlı; 0. eleman kullanılmıyor)

        for (int roll = 1; roll <= 20; roll++) {    // Zar atışları
            ++frequency[1 + randomNumbers.nextInt(6)];
        }

        System.out.printf("%s%10s%n", "Face", "Frequency");

        for (int face = 1; face < frequency.length; face++) {
            System.out.printf("%4d%10d%n", face, frequency[face]);
        }
    }
}/*
Face Frequency
   1         3
   2         6
   3         5
   4         3
   5         1
   6         2
 */
