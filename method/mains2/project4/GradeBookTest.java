package method.mains2.project4;

public class GradeBookTest {

    public static void main(String[] args) {
        // GradeBook nesnesi oluştur
        GradeBook gradeBook1 = new GradeBook("CS101");
        GradeBook gradeBook2 = new GradeBook("CS102");

        // her bir GradeBook nesnesi için courseName'in başlangıç değerini göster
        System.out.printf("gradeBook1 ders ismi: %s\n", gradeBook1.getCourseName());
        System.out.printf("gradeBook2 ders ismi: %s\n", gradeBook2.getCourseName());
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
