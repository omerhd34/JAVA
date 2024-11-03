package start;

import java.util.Scanner;

public class Main9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int number2 = input.nextInt();
        input.close();

        if (number1 % number2 == 0) {
            System.out.printf("%d is a multiple of %d%n", number1, number2);
        }

        if (number1 % number2 != 0) {
            System.out.printf("%d is not a multiple of %d%n", number1, number2);
        }
    }
}
/*
Enter first integer: 6 
Enter second integer: 9
6 is not a multiple of 9

Enter first integer: 15
Enter second integer: 3
15 is a multiple of 3
 */
