package arrayy;

import java.util.Arrays;

public class Main2 {

    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Audi"};
        cars[0] = "TOGG";
        System.out.println(Arrays.toString(cars));    // {TOGG, BMW, Audi}
        System.out.println(cars[0]);   // TOGG
    }
}
/*
            Main2
-----------------------------
cars : String[]
-----------------------------
main(args : String[]) : void
-----------------------------

 */
