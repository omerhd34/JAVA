package method.mains2.project8;

// GradeBook nesnesi oluşturur, notları girer ve not raporunu görüntüler.
public class GradeBookTest {

    public static void main(String[] args) {
// GradeBook nesnesi oluştur myGradeBook ve kurucuya ders adını ilet.
        GradeBook myGradeBook = new GradeBook("CS101'e Giriş");

        myGradeBook.displayMessage();  // mesajı görüntüle
        myGradeBook.inputGrades();        // kullanıcıdan notları al
        myGradeBook.displayGradeReport(); // not raporunu göster
    }
}
/*
Ders notu defterine hoş geldiniz
CS101 Java Programlamaya Giriş!

0-100 arası tam sayı notları girin.
Girişin sonlandırılması için ctrl+ z yazın ve Enter'a basın.
44
33
11
64
56
^D

Not Raporu:
Girilen 5 notun toplamı 208
Sınıf ortalaması 41,60

Her notu alan öğrenci sayısı:
A: 0
B: 0
C: 0
D: 1
F: 4

                         GradeBook 
      -------------------------------------------------
      - courseName : String
      - total : int
      - gradeCounter : int
      - aCount : int
      - bCount : int
      - cCount : int
      - dCount : int
      - fCount : int
      -------------------------------------------------
      <<constructor>> GradeBook(courseName : String)
      + setCourseName (courseName : String) : void
      + getCourseName () : String
      + displayMessage () : void
      + inputGrades() : void
      + displayGradeReport() : void
      + incrementLetterGradeCounter(grade : int) : Void
       -------------------------------------------------
 */
