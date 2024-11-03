package start;

import java.util.Scanner;

public class Main7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r, alan, cevre, cap;
        System.out.print("Yarıçap gir: ");
        r = input.nextDouble();

        cap = 2 * r;
        alan = Math.PI * Math.pow(r, 2);
        cevre = 2 * Math.PI * r;

        System.out.println("ÇAP: " + cap);
        System.out.println("ALAN: " + alan);
        System.out.println("CEVRE: " + cevre);
        System.out.printf("ÇAP: %.2f%n", cap);
        System.out.printf("ALAN: %.2f%n", alan);
        System.out.printf("CEVRE: %.2f%n", cevre);

        input.close();

    }
}
/*
Yarıçap gir: 6
ÇAP: 12.0
ALAN: 113.09733552923255
CEVRE: 37.69911184307752
ÇAP: 12,00
ALAN: 113,10
CEVRE: 37,70
 */
