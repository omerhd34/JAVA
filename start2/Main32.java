package start;

import java.util.Scanner;

public class Main32 {

    public static void main(String[] args) {                         // ax^2 + bx + c
        Scanner scanner = new Scanner(System.in);
        System.out.print("a katsayısını girin: ");                // 1  
        double a = scanner.nextDouble();
        System.out.print("b katsayısını girin: ");               // -3
        double b = scanner.nextDouble();
        System.out.print("c katsayısını girin: ");              // 2
        double c = scanner.nextDouble();
        double delta = Math.pow(b, 2) - (4 * a * c);       // Diskriminant = b^2-4ac   =  1
        if (delta > 0) {         // Diskriminanta göre kökleri bul.
            // İki gerçek kök var
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);           // (-(-3)+1)/(2*1) = 2         (-b+delta^(-1/2)) / 2a
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);            // (-(-3)-1)/(2*1) = 1
            System.out.println("İki gerçek kök vardır: ");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0) {           // Çift kök var.          
            double x = -b / (2 * a);
            System.out.println("Çift kök vardır: x = " + x);
        } else {              // Gerçek kök yok, kompleks kökler var.       
            double reelKisim = -b / (2 * a);
            double imajinerKisim = Math.sqrt(-delta) / (2 * a);
            System.out.println("Gerçek kök yoktur, kompleks kökler vardır: ");
            System.out.println("x1 = " + reelKisim + " + " + imajinerKisim + "i");
            System.out.println("x2 = " + reelKisim + " - " + imajinerKisim + "i");
        }
        scanner.close();
    }
}
/*
a katsayısını girin: 1
b katsayısını girin: -3
c katsayısını girin: 2

İki gerçek kök vardır: 
x1 = 2.0
x2 = 1.0
 */
