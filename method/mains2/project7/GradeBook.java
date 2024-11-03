package method.mains2.project7;

// Sınıf ortalaması problemini sentinel-kontrollü tekrar kullanarak çözen GradeBook sınıfı.
import java.util.Scanner;

public class GradeBook {

    private String courseName; // bu GradeBook'un temsil ettiği dersin adı

    public GradeBook(String name) {   // kurucu metot courseName'i başlatır
        courseName = name; // courseName başlatılır
    }

    public void setCourseName(String name) {  // ders adını ayarlayan metot
        courseName = name; // ders adı saklanır
    }

    public String getCourseName() {      // ders adını döndüren metot
        return courseName;
    }

    // GradeBook kullanıcısına hoş geldiniz mesajı görüntüler
    public void displayMessage() {
        // getCourseName, dersin adını alır
        System.out.printf("Ders notu defterine hoş geldiniz\n%s!\n\n", getCourseName());
    }

    // Kullanıcıdan girilen rastgele sayıda notun ortalamasını hesaplar
    public void determineClassAverage() {
        Scanner input = new Scanner(System.in);

        int total; // girilen notların toplamı
        int gradeCounter; // girilen not sayısı
        int grade; // not değeri
        double average; // ortalama için ondalıklı sayı

        // başlatma aşaması
        total = 0; // toplamı başlat
        gradeCounter = 0; // sayaç başlatılır

        // işlem aşaması
        // giriş almak için istem gönder ve kullanıcıdan not oku
        System.out.print("Not girin ya da çıkmak için -1: ");
        grade = input.nextInt();

        // kullanıcıdan çıkış değeri girilene kadar döngü
        while (grade != -1) {
            total = total + grade; // notu toplama ekle
            gradeCounter = gradeCounter + 1; // sayacı artır

            // giriş almak için istem gönder ve kullanıcıdan bir sonraki notu oku
            System.out.print("Not girin ya da çıkmak için -1: ");
            grade = input.nextInt();
        } // while döngüsü sonu

        // bitiş aşaması
        // kullanıcı en az bir not girmişse...
        if (gradeCounter != 0) {
            // girilen tüm notların ortalamasını hesapla
            average = (double) total / gradeCounter;

            // girilen notların toplamını ve ortalamasını görüntüle (2 ondalıklı hassasiyet ile)
            System.out.printf("\nGirilen %d notun toplamı %d\n", gradeCounter, total);
            System.out.printf("Sınıf ortalaması %.2f\n", average);
        } else {
            System.out.println("Hiç not girilmedi");
        } // else sonu
        input.close();

    } // determineClassAverage metodu sonu

} // GradeBook sınıfı sonu
/*
Ders notu defterine hoş geldiniz
Java'ya Giriş!

Not girin ya da çıkmak için -1: 58
Not girin ya da çıkmak için -1: 86
Not girin ya da çıkmak için -1: 59
Not girin ya da çıkmak için -1: 50
Not girin ya da çıkmak için -1: 45
Not girin ya da çıkmak için -1: -1

Girilen 5 notun toplamı 298
Sınıf ortalaması 59,60

                         GradeBook 
      -------------------------------------------------
      - courseName : String
      -------------------------------------------------
      <<constructor>> GradeBook(courseName : String)
      + setCourseName (courseName : String)
      + getCourseName () : String
      + displayMessage () : void
      + determineClassAverage() : Void
       -------------------------------------------------
 */
