package arrayy;

import java.util.Arrays;

public class Main12 {

    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "TOGG", "Audi"};
        Arrays.sort(cars);
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
// Audi
// BMW
// TOGG
// Volvo
/*
           Main12
-----------------------------
cars : String[]
-----------------------------
main(args : String[]) : void
-----------------------------
 */