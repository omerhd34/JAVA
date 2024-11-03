package start;

import java.util.Scanner;

public class Main35 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();
        int kareKok = (int) Math.sqrt(sayi);
        if (kareKok * kareKok == sayi) {
            System.out.println(sayi + " bir tam kare sayıdır.");
        } else {
            System.out.println(sayi + " bir tam kare sayı değildir.");
        }
        scanner.close();
    }
}
/*
Bir sayı girin: 16
16 bir tam kare sayıdır.

Bir sayı girin: 5
5 bir tam kare sayı değildir.
 */
