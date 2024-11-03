package oop.main1;

public class Main8 {        // Create a Main class

    static void myStaticMethod() {    // Static method
        System.out.println("Static yöntemler nesne oluşturulmadan çağrılabilir.");
    }

    public void myPublicMethod() {    // Public method
        System.out.println("Public yöntemler nesneler oluşturularak çağrılmalıdır.");
    }

    public static void main(String[] args) {   // Main method
        myStaticMethod();                 // Call the static method
        Main8 myObj = new Main8(); // Create an object of MyClass
        myObj.myPublicMethod(); // Call the public method
    }
}
/*
Static yöntemler nesne oluşturulmadan çağrılabilir.
Public yöntemler nesneler oluşturularak çağrılmalıdır.
 */
