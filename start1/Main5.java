package start;

import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number integer: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number % 2 == 0) {
            System.out.printf("%d is even", number);
        }
        if (number % 2 == 1) {
            System.out.printf("%d is odd", number);
        }
    }
}
/*
Enter a number integer: 5
5 is odd

Enter a number integer: 6
6 is even
 */
