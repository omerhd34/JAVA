package method.mains2.project4;

public class GradeBook {

    private String courseName;      // bu GradeBook için ders ismi
    // String argümanı ile courseName'i başlatan yapıcı metot

    public GradeBook(String name) {  // yapıcı metod
        courseName = name;   // courseName'i başlatır.
    }
    // ders ismini ayarlamak için metot

    public void setCourseName(String name) {
        courseName = name; // ders ismini sakla
    }
    // ders ismini geri döndürmek için metot

    public String getCourseName() {
        return courseName; // courseName'i geri döndür
    }
    // GradeBook kullanıcısına bir karşılama mesajı göster

    public void displayMessage() {
        // getCourseName'i çağırarak bu GradeBook'un temsil ettiği dersin ismini al.
        System.out.printf("Not defteri için hoş geldiniz\n%s!\n", getCourseName());
    }
}
/*
gradeBook1 ders ismi: CS101
gradeBook2 ders ismi: CS102

GradeBook
---------------------------------
- courseName : String
---------------------------------
<<constructor>> GradeBook(Name : String)
+setCourseName(name: String)
+getCourseName() : String
+displayMessage()
 */
