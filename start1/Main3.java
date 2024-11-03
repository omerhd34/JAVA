package start;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");    // 5
        int number1 = input.nextInt();
        System.out.print("Enter second integer: ");   // 6
        int number2 = input.nextInt();

        int sum = number1 + number2;
        System.out.printf("Sum is %d ", sum);    // 11

        input.close();

    }
}
