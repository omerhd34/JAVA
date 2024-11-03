package method.mains2.project1;

public class GradeBook {

    public void displayMessage() {
        System.out.println("OHD");
    }
}

/*
Yöntem, yalnızca çağrıldığında çalışan bir kod bloğudur.
Parametre olarak bilinen verileri bir yönteme aktarabilirsiniz.
Yöntemler belirli eylemleri gerçekleştirmek için kullanılır ve bunlara işlevler olarak da bilinir.
Yöntemleri neden kullanmalı? Kodu yeniden kullanmak için: Kodu bir kez tanımlayın ve birçok kez kullanın.
Bir yöntem bir sınıf içinde bildirilmelidir. Yöntemin adı ve ardından parantez () ile tanımlanır. Java, System.out.println() gibi bazı önceden tanımlanmış yöntemler sağlar, ancak belirli eylemleri gerçekleştirmek için kendi yöntemlerinizi de oluşturabilirsiniz.
 */
 /*
GradeBook ve GradeBookTest adında sınıflar tanımlanmıştır.
GradeBook sınıfı içinde tanımlanan bir metottur. void geri dönüş tipi, bu metodun hiçbir değer döndürmeyeceğini belirtir. Eğer public void displayMessage() metodunu static void displayMessage() olarak değiştirirseniz, metodu bir nesne oluşturmadan doğrudan sınıf üzerinden çağırabilirsiniz. Statik metodlar sınıfa bağlıdır ve sınıfın herhangi bir örneği (instance) olmadan çalıştırılabilir. Yani kodda GradeBook myGradeBook = new GradeBook(); ‘a gerek kalmazdı.
Bu satır, GradeBook sınıfından bir myGradeBook adında nesne oluşturur.
Bu satırda, myGradeBook nesnesi kullanılarak displayMessage() metodu çağrılır ve ekrana "OHD" yazdırılır.

UML diyagramında + displayMessage(): "+" işareti, bu metodun public (genel erişim) olduğunu belirtir. Bu, displayMessage() metodunun GradeBook sınıfında yer aldığını ve dışarıdan çağrılabilir olduğunu ifade eder.

          GradeBook
-----------------------------

-----------------------------
+ displayMessage()
-----------------------------
 */
