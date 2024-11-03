package forr;

public class Main18 {

    public static void main(String[] args) {
        int count;

        for (count = 1; count <= 10; count++) {
            if (count == 5) {
                break;
            }
            System.out.printf("%d ", count);
        }

        System.out.printf("\nBroke out of loop at count = %d\n", count);
    }
}
/*
1 2 3 4
Broke out of loop at count = 5
 */
