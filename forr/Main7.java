package forr;

public class Main7 {

    public static void main(String[] args) {
        System.out.println("number\tsquare\tcube");

        for (int number = 0; number <= 10; number++) {
            int square = number * number;
            int cube = number * number * number;

            System.out.printf("%d\t%d\t%d%n", number, square, cube);
        }
    }
}
/*
number  square  cube
0       0       0
1       1       1
2       4       8
3       9       27
4       16      64
5       25      125
6       36      216
7       49      343
8       64      512
9       81      729
10      100     1000
 */
