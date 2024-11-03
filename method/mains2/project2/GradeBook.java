package method.mains2.project2;

public class GradeBook {

    public void displayMessage(String courseName) {
        System.out.printf("%s", courseName);
    }
}
/*
Kurs ismi gir: java
java

GradeBook ve GradeBookTest adında sınıflar tanımlanmıştır.
GradeBook sınıfı içinde tanımlanan bir metottur. void geri dönüş tipi, bu metodun hiçbir değer döndürmeyeceğini belirtir. Eğer public void displayMessage(String courseName) metodunu static void displayMessage(String courseName) olarak değiştirirseniz, metodu bir nesne oluşturmadan doğrudan sınıf üzerinden çağırabilirsiniz. Statik metodlar sınıfa bağlıdır ve sınıfın herhangi bir örneği (instance) olmadan çalıştırılabilir. Yani kodda GradeBook myGradeBook = new GradeBook(); ‘a gerek kalmazdı. Ayrıca, bu metod, bir parametre (courseName) alır ve bu parametreyi ekrana basar. Yani artık dışarıdan bir ders adı (courseName) alarak çalışır.
Bu satır, GradeBook sınıfından bir myGradeBook adında nesne oluşturur.
Kullanıcının girdiği veriyi alır ve nameOfCourse değişkenine atar. nextLine() metodu, kullanıcının tam satır girişi yapmasını sağlar.
GradeBook sınıfından oluşturulan myGradeBook nesnesi ile displayMessage() metodu çağrılır ve kullanıcıdan alınan kurs adı (nameOfCourse) ekrana yazdırılır.

Bu UML diyagramı, GradeBook sınıfının bir metodunun olduğunu gösteriyor. Metodun public olduğunu belirten + işareti, parametre olarak String courseName aldığını gösterir. Bu, metodun bir girdi alarak çalışacağını ifade eder.

          GradeBook
-----------------------------

-----------------------------
+ displayMessage(courseName : String)
-----------------------------
 */
