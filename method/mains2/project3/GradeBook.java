package method.mains2.project3;

public class GradeBook {

    private String courseName;   // ders ismini ayarlamak için metot

    public void setCourseName(String name) {
        courseName = name;    // ders ismini sakla
    }
    // ders ismini geri döndürmek için metot

    public String getCourseName() {
        return courseName;     // ders ismini geri döndür
    }

    public void displayMessage() {
        System.out.printf("Not defteri için hoş geldiniz: %s!\n", getCourseName());
    }
}
/*
Başlangıç ders ismi: null

Lütfen ders ismini girin: JAVA

Not defteri için hoş geldiniz JAVA

GradeBook
---------------------------------
- courseName : String
---------------------------------
+setCourseName(name: String)
+getCourseName() : String
+displayMessage()
 */
