/*
Bu Java programı, bir dizi yanıt değerini (1-10 arası derecelendirmeleri) analiz ederek her bir derecelendirme için frekansları (sıklıkları) hesaplar ve geçersiz yanıtları tespit eder.
 */
package arrayy;

public class Main27 {

    public static void main(String[] args) {
        int[] responses = {1, 2, 5, 4, 3, 5, 2, 8, 3, 3, 9, 45, 3, 10, 33, 2, 3, 9, 2, 10, 6, 8, 7};   // Yanıtlar dizisi
        // 1-5 arası geçerli yanıtlar için frekans dizisi (6 elemanlı; çünkü indeksleri 1-5 arası kullanacağız.)
        int[] frequency = new int[11];

        for (int response : responses) {     // Yanıtları dolaşarak her biri için işlem yapıyoruz.
            if (response >= 1 && response <= 10) {
                frequency[response]++; // Geçerli bir cevapsa, frekans dizisindeki ilgili değeri 1 artır.
            } else {
                System.out.printf("Geçersiz yanıt: %d%n", response); // Geçersiz cevapları yazdır.
            }
        }

        // Her bir derecelendirmenin frekansını (kaç kez verildiğini) ekrana yazdırıyoruz
        System.out.printf("%s%20s%n", "Rating", "Frequency");
        for (int rating = 1; rating < frequency.length; rating++) {
            System.out.printf("%5d%17d%n", rating, frequency[rating]);
        }
    }
}
/*
Geçersiz yanıt: 45
Geçersiz yanıt: 33
Rating           Frequency
    1                1
    2                4
    3                5
    4                1
    5                2
    6                1
    7                1
    8                2
    9                2
   10                2

+-------------------+
|     Main29        |
+-------------------+
| - responses: int[]|
| - frequency: int[]|
+-------------------+
| + main(args: String[]): void |
+-------------------+

 */
