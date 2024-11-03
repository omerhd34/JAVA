package method.mains2.Project6;

public class GradeBookTest {

    public static void main(String[] args) {
        // GradeBook nesnesi myGradeBook'u oluştur ve ders ismini geç
        GradeBook myGradeBook = new GradeBook("Java'ya Giriş");

        myGradeBook.displayMessage(); // karşılama mesajını göster
        myGradeBook.determineClassAverage();
        // 3 notun ortalamasını hesapla
    }
} // GradeBookTest sınıfının sonu
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
