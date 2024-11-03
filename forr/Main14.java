package forr;

import java.util.Random;
import java.util.Scanner;

public class Main14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Sayı aralığının alt sınırını girin: ");
        int altSinir = scanner.nextInt();
        System.out.print("Sayı aralığının üst sınırını girin: ");
        int ustSinir = scanner.nextInt();
        System.out.println("5 adet tam sayı:");
        for (int i = 0; i < 5; i++) {
            int tamSayi = random.nextInt((ustSinir - altSinir) + 1) + altSinir;
            System.out.println(tamSayi);
        }
        System.out.println("5 adet kesirli (ondalıklı) sayı:");
        for (int i = 0; i < 5; i++) {
            double kesirliSayi = altSinir + (ustSinir - altSinir) * random.nextDouble();
            System.out.println(kesirliSayi);
        }
        scanner.close();
    }
}
/*
Sayı aralığının alt sınırını girin: 0
Sayı aralığının üst sınırını girin: 10
5 adet tam sayı:
2
5
5
2
4
5 adet kesirli (ondalıklı) sayı:
0.7727663151615305
5.451746774257159
2.120220286701733
8.059521568607765
3.221642341920342
 */
