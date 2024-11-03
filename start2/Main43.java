package start;

import java.util.Scanner;

public class Main43 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir metin girin: ");
        String str = input.nextLine();
        String reversedStr = new StringBuilder(str).reverse().toString();
        System.out.println("Ters çevrilmiş metin: " + reversedStr);
        input.close();

    }
}
// Omer Halis Demir
// Ters çevrilmiş metin: rimeD silaH remO
