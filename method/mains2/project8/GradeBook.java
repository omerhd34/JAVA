package method.mains2.project8;

// Harf notlarını saymak için switch ifadesini kullanan GradeBook sınıfı.
import java.util.Scanner; // program Scanner sınıfını kullanır

public class GradeBook {

    private String courseName; // bu GradeBook'un temsil ettiği dersin adı
    private int total; // girilen notların toplamı
    private int gradeCounter; // girilen notların sayısı
    private int aCount; // A notlarının sayısı
    private int bCount; // B notlarının sayısı
    private int cCount; // C notlarının sayısı
    private int dCount; // D notlarının sayısı
    private int fCount; // F notlarının sayısı

    public GradeBook(String name) {   // kurucu courseName'i başlatır.
        courseName = name; // courseName başlatılır
    }

    public void setCourseName(String name) {  // ders adını ayarlayan metot
        courseName = name; // ders adı saklanır
    }

    public String getCourseName() {  // ders adını döndüren metot
        return courseName;
    }

    public void displayMessage() { // GradeBook kullanıcısına hoş geldiniz mesajı görüntüler.
        System.out.printf("Ders notu defterine hoş geldiniz%n%s!%n%n", getCourseName());
    }

    public void inputGrades() {  // kullanıcıdan girilen rastgele sayıda not al.
        Scanner input = new Scanner(System.in);
        int grade; // kullanıcının girdiği not
        System.out.printf("%s%n%s%n", "0-100 arası tam sayı notları girin.",
                "Girişin sonlandırılması için ctrl+z yazın ve Enter'a basın.");
        while (input.hasNext()) {  // kullanıcı EOF simgesi girene kadar döngü
            grade = input.nextInt(); // notu oku
            total += grade; // notu toplama ekle
            ++gradeCounter; // not sayacını artır
            incrementLetterGradeCounter(grade); // doğru sayaç artışı için metodu çağır.
        }
        input.close();
    }

    private void incrementLetterGradeCounter(int grade) {    // not için uygun sayacı 1 artır.
        switch (grade / 10) {
            case 9: // not 90-100 arasında
            case 10: // ve dahil
                ++aCount;
                break;
            case 8: // not 80-89 arasında
                ++bCount;
                break;
            case 7: // not 70-79 arasında
                ++cCount;
                break;
            case 6: // not 60-69 arasında
                ++dCount;
                break;
            default: // not 60'ın altında
                ++fCount;
                break;
        }
    }

    // kullanıcı tarafından girilen notlara dayalı rapor görüntüler.
    public void displayGradeReport() {
        System.out.println("\nNot Raporu:");
        if (gradeCounter != 0) { // eğer kullanıcı en az bir not girdiyse;
            double average = (double) total / gradeCounter; // girilen tüm notların ortalamasını hesapla
            // sonuç özetini çıktı olarak ver
            System.out.printf("Girilen %d notun toplamı %d%n", gradeCounter, total);
            System.out.printf("Sınıf ortalaması %.2f%n", average);
            System.out.printf("%nHer notu alan öğrenci sayısı:%n%s: %d%n%s: %d%n%s: %d%n%s: %d%n%s: %d%n",
                    "A", aCount, // A notlarının sayısı
                    "B", bCount, // B notlarının sayısı
                    "C", cCount, // C notlarının sayısı
                    "D", dCount, // D notlarının sayısı
                    "F", fCount); // F notlarının sayısı
        } else { // hiç not girilmediyse
            System.out.println("Hiç not girilmedi");
        } // else sonu
    } // displayGradeReport metodu sonu
} // GradeBook sınıfı sonu
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
