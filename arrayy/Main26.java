package arrayy;

public class Main26 {

    public static void main(String[] args) {
        int[] array = {10, 15, 75};
        int total = 0;

        for (int counter = 0; counter < array.length; counter++) {
            total = total + array[counter];
        }

        System.out.printf("Total of array elements: %d%n", total);
    }
}
// Total of array elements: 100
