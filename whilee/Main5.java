package whilee;

public class Main5 {

    public static void main(String[] args) {
        int i = 0;
        while (i < 4) {
            if (i == 2) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
// 0
// 1
// 3
