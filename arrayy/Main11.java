package arrayy;

import java.util.Arrays;

public class Main11 {

    public static void main(String[] args) {
        String[] fruits = {"Banana", "Orange"};
        Arrays.fill(fruits, "Kiwi");     // fruits dizisindeki tüm elemanları "Kiwi" değeriyle değiştiriyor.
        for (String i : fruits) {
            System.out.println(i);
        }
    }
}
/*
Kiwi
Kiwi

           Main11
-----------------------------
fruits : String[]
-----------------------------
main(args : String[]) : void
-----------------------------
 */

