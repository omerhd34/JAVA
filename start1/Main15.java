package start;

public class Main15 {

    public static void main(String[] args) {
        int myInt1 = 9;
        double myDouble1 = myInt1;

        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble2;

        int maxScore = 500, userScore = 423;
        float percentage = (float) userScore / maxScore * 100.0f;

        System.out.println(myInt1);           // 9
        System.out.println(myDouble1);        // 9.0

        System.out.println(myInt2);           // 9
        System.out.println(myDouble2);        // 9.78

        System.out.println(percentage);       // 84.6
    }
}
/*
           Main15
-----------------------------
myInt1 : int
myInt2 : int
myDouble1 : double
myDouble2 : double
maxScore : int
minScore : int
percentage : float
-----------------------------
main(args : String[]) : void
-----------------------------
 */
