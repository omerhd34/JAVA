package arrayy;

import java.util.Arrays;

public class Main10 {

    public static void main(String[] args) {
        String[] cars1 = {"TOGG", "BMW", "Tesla"};
        String[] cars2 = {"TOGG", "BMW", "Tesla"};
        // Diziler eşit olduğundan true döner.
        System.out.println(Arrays.equals(cars1, cars2));    //true
    }
}
