package oop.main1;

/* Main adlı sınıfı zaten oluşturduk, artık bunu nesneler oluşturmak için kullanabiliriz. 
'myObj' adında bir nesne oluşturun ve x'in değerini yazdırın. */
public class Main1 {

    int x = 5;

    public static void main(String[] args) {
        Main1 myObj = new Main1();
        System.out.println(myObj.x);           // 5
    }
}
