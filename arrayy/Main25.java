package arrayy;

public class Main25 {

    public static void main(String[] args) {
        int[] array = {10, 15, 75};
        int total = 0;

        for (int number : array) {
            total = total + number;
        }

        System.out.printf("Total of array elements: %d%n", total);
    }
}  // Total of array elements: 100
