package method.mains;

public class Main11 {

    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1);          // int: 13
        System.out.println("double: " + myNum2);   // double: 10.55999999...
    }
}
