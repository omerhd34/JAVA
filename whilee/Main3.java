package whilee;

public class Main3 {

    public static void main(String[] args) {
        int dice = 1;
        while (dice <= 3) {
            if (dice < 2) {
                System.out.println("OHD");
            } else {
                System.out.println("HD");
            }
            dice = dice + 1;
        }
    }
}
// OHD
// HD
// HD

