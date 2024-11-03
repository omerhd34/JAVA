package method.mains2.project7;

// GradeBook nesnesi oluştur ve determineClassAverage metodunu çağır.
public class GradeBookTest {

    public static void main(String[] args) {
        // GradeBook nesnesi oluştur myGradeBook ve
        // kurucuya ders adını ilet
        GradeBook myGradeBook = new GradeBook("Java'ya Giriş");

        myGradeBook.displayMessage(); // hoş geldiniz mesajını görüntüle
        myGradeBook.determineClassAverage(); // notların ortalamasını bul
    } // main metodu sonu
} // GradeBookTest sınıfı sonu
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
