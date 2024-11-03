package start;

import java.util.Scanner;

public class Main11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2, number3, largest, smallest;
        System.out.print("Enter first integer: ");
        number1 = input.nextInt();
        System.out.print("Enter second integer: ");
        number2 = input.nextInt();
        System.out.print("Enter third integer: ");
        number3 = input.nextInt();

        largest = number1;
        if (number2 > largest) {
            largest = number2;
        }
        if (number3 > largest) {
            largest = number3;
        }

        smallest = number1;
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number3 < smallest) {
            smallest = number3;
        }

        System.out.printf("Largest is %d%n", largest);
        System.out.printf("Smallest is %d%n", smallest);
        input.close();
    }
}
/*
Enter first integer: 6
Enter second integer: 8
Enter third integer: 2
Largest is 8
Smallest is 2
 */
