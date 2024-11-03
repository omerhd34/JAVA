package forr;

public class Main3 {

    public static void main(String[] args) {
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i);
            for (int j = 1; j <= 2; j++) {
                System.out.println(" Inner: " + j);
            }
        }
    }
}
//Outer: 1
// Inner: 1
// Inner: 2
//Outer: 2
// Inner: 1
// Inner: 2
