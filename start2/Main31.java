package start;

import java.util.Scanner;

public class Main31 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Silindirin yarıçapını girin: ");
        double yaricap = scanner.nextDouble();
        System.out.print("Silindirin yüksekliğini girin: ");
        double yukseklik = scanner.nextDouble();
        double silindirHacmi = Math.PI * Math.pow(yaricap, 2) * yukseklik;
        System.out.print("Küpün kenar uzunluğunu girin: ");
        double kenar = scanner.nextDouble();
        double kupHacmi = Math.pow(kenar, 3);

        System.out.println("Silindirin hacmi: " + silindirHacmi);
        System.out.println("Küpün hacmi: " + kupHacmi);
        scanner.close();
    }
}
/*
Silindirin yarıçapını girin: 6
Silindirin yüksekliğini girin: 4
Küpün kenar uzunluğunu girin: 3

Silindirin hacmi: 452.3893421169302
Küpün hacmi: 27.0

Silindirin hacmi  = V=π×r^2×h 
Küpün hacmi = V=a^3
 */
