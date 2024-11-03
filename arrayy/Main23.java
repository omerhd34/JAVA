package arrayy;

public class Main23 {

    public static void main(String[] args) {
        int[] array = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};

        System.out.println("Grade distribution:");

        for (int counter = 0; counter < array.length; counter++) {
            if (counter == 10) {
                System.out.printf("%5d: ", 100);
            } else {
                System.out.printf("%02d-%02d: ", counter * 10, counter * 10 + 9);
            }

            for (int stars = 0; stars < array[counter]; stars++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
/*
Grade distribution:
00-09: 
10-19: 
20-29: 
30-39: 
40-49: 
50-59: 
60-69: *
70-79: **
80-89: ****
90-99: **
  100: *
 */
