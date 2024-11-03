package arrayy;

public class Main7 {

    public static void main(String[] args) {
        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
        float sum = 0;
        for (int age : ages) {
            sum += age;
        }
        float avg = sum / ages.length;
        System.out.println("The average age is: " + avg);
    }
}
// The average age is: 40.75
