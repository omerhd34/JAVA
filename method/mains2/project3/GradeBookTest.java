package method.mains2.project3;

import java.util.Scanner;

public class GradeBookTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // GradeBook nesnesi oluştur ve myGradeBook'a ata
        GradeBook myGradeBook = new GradeBook();
        // courseName'in başlangıç değerini göster
        System.out.printf("Başlangıç ders ismi: %s\n\n",
                myGradeBook.getCourseName());
        // ders ismini istemek için kullanıcıya uyarı ver ve oku
        System.out.print("Lütfen ders ismini girin: ");
        String theName = input.nextLine();    // bir satır metin oku
        myGradeBook.setCourseName(theName); // ders ismini ayarla

        System.out.println();
        myGradeBook.displayMessage();
        input.close();
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
