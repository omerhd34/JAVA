package method.mains2.Project6;

import java.util.Scanner;

public class GradeBook {

    private String courseName;  // bu GradeBook'un temsil ettiği dersin ismi

    public GradeBook(String name) {        // yapıcı metod courseName'i başlatır
        courseName = name; // courseName'i başlat
    }

    public void setCourseName(String name) {  // ders ismini ayarlamak için metot 
        courseName = name; // courseName'i sakla
    }

    public String getCourseName() {   // ders ismini geri döndürmek için metot
        return courseName; // courseName'i geri döndür
    }

    // GradeBook kullanıcısına bir karşılama mesajı göster
    public void displayMessage() {
        // getCourseName metodunu çağırarak ders ismini al
        System.out.printf("Not defteri için hoş geldiniz\n%s!\n", getCourseName());
    }

    // kullanıcıdan girilen 3 notun ortalamasını hesapla
    public void determineClassAverage() {
        Scanner input = new Scanner(System.in);
        int total; // kullanıcı tarafından girilen notların toplamı
        int gradeCounter; // sıradaki notun numarası
        int grade; // girilen not
        int average; // notların ortalaması
        // başlatma aşaması
        total = 0; // toplamı başlat
        gradeCounter = 1; // döngü sayacını başlat

        // işlem aşaması, sayaç kontrollü döngü kullanır
        while (gradeCounter <= 3) {   // 3 defa döngü yap
            System.out.print("Not girin: "); // iste
            grade = input.nextInt(); // sonraki notu al
            total = total + grade; // notu toplamaya ekle
            gradeCounter = gradeCounter + 1; // sayacı 1 artır
        } // while döngüsünün sonu
        // bitirme aşaması
        average = total / 3; // tam sayı bölme sonucunda tam sayı değer döner
        // toplam ve notların ortalamasını göster
        System.out.printf("\nGirilen tüm 3 notun toplamı %d\n", total);
        System.out.printf("Sınıf ortalaması %d\n", average);

        input.close();
    } // determineClassAverage metodunun sonu
} // GradeBook sınıfının sonu
/*
Not defteri için hoş geldiniz
Java'ya Giriş!
Not girin: 67
Not girin: 35
Not girin: 98

Girilen tüm 3 notun toplamı 200
Sınıf ortalaması 66

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
