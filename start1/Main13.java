package start;

import java.util.Scanner;

public class Main13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weightInKilograms, heightInMeters, bmi;

        System.out.print("Enter your weight (in kg): ");
        weightInKilograms = scanner.nextDouble();
        System.out.print("Enter your height (in meters): ");
        heightInMeters = scanner.nextDouble();
        scanner.close();

        bmi = weightInKilograms / (heightInMeters * heightInMeters);
        System.out.printf("%nYour BMI is %,.2f%n%n", bmi);

        System.out.println("BMI Categories:\r\n" + "Underweight =< 18.5\r\n" + "Normal weight = 18.5--24.9\r\n" + "Overweight = 25--29.9\r\n" + "Obesity = BMI of 30 or greater");
    }
}
/*
Enter your weight (in kg): 58
Enter your height (in meters): 1,62

Your BMI is 22,10

BMI Categories:
Underweight =< 18.5
Normal weight = 18.5--24.9
Overweight = 25--29.9
Obesity = BMI of 30 or greater
 */
