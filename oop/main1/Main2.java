package oop.main1;

// Bir sınıftan birden fazla nesne oluşturabilirsiniz.
public class Main2 {

    int x = 5;

    public static void main(String[] args) {
        Main2 myObj1 = new Main2();
        Main2 myObj2 = new Main2();
        System.out.println(myObj1.x);   // 5
        System.out.println(myObj2.x);   // 5
    }
}
