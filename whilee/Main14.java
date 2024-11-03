package whilee;

// İç içe geçmiş kontrol ifadelerini kullanarak sınav sonuçlarının analizi.
import java.util.Scanner;

public class Main14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);        // komut penceresinden giriş almak için Scanner oluştur

        int passes = 0; // geçenlerin sayısı
        int failures = 0; // kalanların sayısı
        int studentCounter = 1; // öğrenci sayacı
        int result;   // bir sınav sonucu (kullanıcıdan değer alır)

        while (studentCounter <= 5) {        // sayaç kontrollü döngü kullanarak 5 öğrenciyi işleme al
            System.out.print("Sonucu girin (1 = geçti, 2 = kaldı): ");    // kullanıcıdan giriş almak için değeri al
            result = input.nextInt();
            if (result == 1) { // eğer sonuç 1 ise          
                passes = passes + 1; // geçenleri artır
            } else { // değilse sonuç 1 değilse, o zaman kaldı
                failures = failures + 1; // kalanları artır
            }
            studentCounter = studentCounter + 1;      // studentCounter'ı artır, böylece döngü bir noktada sona erer
            input.close();
        } // while sonu

        System.out.printf("Geçti: %d\nKaldı: %d\n", passes, failures); // bitiş aşaması; sonuçları hazırla ve görüntüle

        if (passes > 3) {          // 3'den fazla öğrenci geçtiyse bunu belirle
            System.out.println("Eğitmene bonus!");
        }
    } // main metodu sonu
} // Analysis sınıfı sonu
/*
Sonucu girin (1 = geçti, 2 = kaldı): 1
Sonucu girin (1 = geçti, 2 = kaldı): 2
Sonucu girin (1 = geçti, 2 = kaldı): 1
Sonucu girin (1 = geçti, 2 = kaldı): 1
Sonucu girin (1 = geçti, 2 = kaldı): 2
Geçti: 3
Kaldı: 2


Veya;


Sonucu girin (1 = geçti, 2 = kaldı): 1
Sonucu girin (1 = geçti, 2 = kaldı): 1
Sonucu girin (1 = geçti, 2 = kaldı): 2
Sonucu girin (1 = geçti, 2 = kaldı): 1
Sonucu girin (1 = geçti, 2 = kaldı): 1
Geçti: 4
Kaldı: 1
Eğitmene bonus!

           Main14
-----------------------------
passes : int
failures : int
studentCounter  : int
result : int
-----------------------------
main(args : String[]) : void
-----------------------------
 */
