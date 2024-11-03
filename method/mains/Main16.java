package method.mains;

public class Main16 {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number) {
        if (number < 0) {
            return false;
        }
        int originalNumber = number;
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return originalNumber == reversedNumber;
    }
}
// false
// true
// false
/*
                       Main16
------------------------------------------------------

------------------------------------------------------
main(String[] args)
isPalindrome(int number) : boolean
------------------------------------------------------
 */
