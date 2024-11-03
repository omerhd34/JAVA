package oop.main1;

public class Main10 {   // Create a Main class

    int x;

    public Main10() {   // Ana sınıf için bir sınıf yapıcısı oluşturun
        x = 5;
    }

    public static void main(String[] args) {
        Main10 myObj = new Main10();
        System.out.println(myObj.x);    // 5
    }
}
