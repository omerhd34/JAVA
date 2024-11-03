package arrayy;

public class Main13 {

    public static void main(String[] args) {
        int[] numbers = {1, 2};
        System.out.println("Dizinin elemanları:");
        for (int number : numbers) {
            System.out.println(number);
        }
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}
// Dizinin elemanları:
// 1
// 2
// Dizinin elemanlarının toplamı: 3
/* 
           Main13
-----------------------------
numbers : int[]
sum : int
-----------------------------
main(args : String[]) : void
-----------------------------
*/
