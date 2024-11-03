/*
•	hasTeen isimli 3 tane parametre alan bir metod yazmak istiyoruz.
•	3 parametreden herhangi biri eğer 13-19 arasındaysa metod true değer dönmeli
•	Diğer şartlarda false değer dönmeli.
hasTeen(9, 99, 19); => true dönmeli.(19 değerinden dolayı)
hasTeen(23, 15, 42); => true dönmeli.(15 değerinden dolayı)
hasTeen(22, 23, 34); => false dönemli(Hiçbir değer 13-19 arasında değil.)
 */
package method.mains;

public class Main13 {

    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
    }

    public static boolean hasTeen(int num1, int num2, int num3) {
        return (isTeen(num1) || isTeen(num2) || isTeen(num3));
    }

    private static boolean isTeen(int num) {
        return num >= 13 && num <= 19;
    }
}
/*
true
true
false


                       Main13
------------------------------------------------------

------------------------------------------------------
main(String[] args)
hasTeen(int num1, int num2, int num3) : boolean
isTeen(int num) : boolean
------------------------------------------------------
 */
