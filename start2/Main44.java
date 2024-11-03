package start;

import java.util.Scanner;

public class Main44 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir metin girin: ");
        String str = scanner.nextLine();
        String reversedStr = new StringBuilder(str).reverse().toString();
        if (str.equals(reversedStr)) {
            System.out.println(str + " bir palindromdur.");
        } else {
            System.out.println(str + " bir palindrom değildir.");
        }
        scanner.close();
    }
}
// Palindrom, tersten okunuşu da aynı olan cümle, sözcük ve sayılara denilmektedir.
// Bir metin girin: OHD
// OHD bir palindrom değildir.
