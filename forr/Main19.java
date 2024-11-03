package forr;

public class Main19 {

    public static void main(String[] args) {
        for (int count = 1; count <= 10; count++) {
            if (count == 5) {
                continue;
            }
            System.out.printf("%d ", count);
        }

        System.out.println("\nUsed continue to skip printing 5");
    }
}
/*
1 2 3 4 6 7 8 9 10 
Used continue to skip printing 5
 */
