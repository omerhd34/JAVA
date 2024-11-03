package oop.main1;

public class Main9 {        // Create a Main class

    public void fullThrottle() {     // Create a fullThrottle() method
        System.out.println("The car is going as fast as it can!");
    }

    public void speed(int maxSpeed) {   // Create a speed() method and add a parameter
        System.out.println("Max speed is: " + maxSpeed);
    }

    public static void main(String[] args) {  // Inside main, call the methods on the myCar object
        Main9 myCar = new Main9();     // Create a myCar object
        myCar.fullThrottle();      // Call the fullThrottle() method
        myCar.speed(200);          // Call the speed() method
    }
}
// The car is going as fast as it can!
// Max speed is: 200

