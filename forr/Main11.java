package forr;

import java.util.Scanner;

public class Main11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");         // Bir sayı girin: 5
        int num = input.nextInt();
        long fact = 1;

        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        System.out.println(fact);      // 120
        input.close();
    }
}
