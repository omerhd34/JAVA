package forr;

import java.util.Scanner;

public class Main12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int negatives = 0, positives = 0, zeros = 0;
        int i, number;
        for (i = 1; i <= 3; i++) {
            System.out.print("Enter integer " + i + ":  ");
            number = input.nextInt();

            if (number > 0) {
                positives++;
            } else if (number < 0) {
                negatives++;
            } else {
                zeros++;
            }
            input.close();
        }

        System.out.println("Number of positives: " + positives);
        System.out.println("Number of negatives: " + negatives);
        System.out.println("Number of zeros: " + zeros);

    }
}
/*
Enter integer 1:  6  
Enter integer 2:  -5
Enter integer 3:  3
Number of positives: 2
Number of negatives: 1
Number of zeros: 0 
 */
