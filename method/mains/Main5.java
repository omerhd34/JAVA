package method.mains;

public class Main5 {

    static void checkAge(int age) {
        // Age adlı bir tamsayı parametresine sahip bir checkAge() yöntemi:
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        checkAge(20);     // Access granted - You are old enough!
    }
}
