package start;

import java.util.Scanner;

public class Main8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a five-digit integer: ");
        int number = input.nextInt();
        input.close();

        int digit1 = number % 10;
        number /= 10;
        int digit2 = number % 10;
        number /= 10;
        int digit3 = number % 10;
        number /= 10;
        int digit4 = number % 10;
        number /= 10;
        int digit5 = number % 10;
        number /= 10;

        System.out.printf("%d   %d   %d   %d   %d%n", digit5, digit4, digit3, digit2, digit1);
    }
}
/*
Enter a five-digit integer: 65326
6   5   3   2   6
 */
