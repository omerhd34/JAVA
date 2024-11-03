package method.mains;

public class Main18 {

    public static void main(String[] args) {
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));
    }

    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }
        StringBuilder words = new StringBuilder();
        String[] numberWords = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        while (number > 0) {
            int digit = number % 10;
            words.insert(0, numberWords[digit] + " ");
            number /= 10;
        }
        if (words.length() == 0) {
            return numberWords[0];
        }
        return words.toString().trim();
    }
}
/*
One Two Three
One Zero One Zero
Invalid Value


                       Main16
------------------------------------------------------

------------------------------------------------------
main(String[] args : void)
numberToWords(int number) : String
------------------------------------------------------
 */
