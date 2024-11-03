/*
•	Dikdörtgenin alanını hesaplamak için bir metod yazınız. Metodun ismi area olmalı.
•	İki tane double parametre almalı ve bu parametreleri kullanıcıdan almalı.
•	Eğer parametrelerden herhangi biri negatif değer alırsa, alan negatif olamayacağından metod -1 değer dönerek yanlış bir işlem yapıldığını belirtmeli.
•	Metod iki değeri birbiriyle çarpmalı ve değeri return etmeli.
area(5.0, 4.0); => 20.0 değerini dönmeli.
area(-1.0, 4.0); => -1 değerini dönmeli.
•	Bir tane daha area isimli bir metod tanımla. Amacımız dairenin alanını hesaplamak.
•	bu sefer tek bir double parametresi almalı. İsmi radius olabilir. Bu parametrede kullanıcıdan alınmalı.
•	parametre negatif bir dğer alırsa metod yine -1 dönmeli.
•	Diğer şartlarda metod radius*radius*Math.PI değerini dönmeli
•	Math.PI kullandığında math kütüphanesini import etmen gerekicek.
•	Intellij kendisi otomatik import yapmazsa nasıl yapabileceğini araştır. Otomatik yaparsa Java'da başka kütüphaneleri nasıl import edebileceğimizi görmüş olucaksın.
area(5.0); => 78.53975 değerini dönmeli
area(-1); => -1 değerini dönmeli.
 */
package method.mains;

import java.util.Scanner;

public class Main15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dikdörtgenin genişliğini girin: ");
        double width = scanner.nextDouble();
        System.out.print("Dikdörtgenin yüksekliğini girin: ");
        double height = scanner.nextDouble();
        System.out.println("Dikdörtgenin alanı: " + area(width, height));
        System.out.print("Dairenin yarıçapını girin: ");
        double radius = scanner.nextDouble();
        System.out.println("Dairenin alanı: " + area(radius));
        scanner.close();
    }

    public static double area(double width, double height) {
        if (width < 0 || height < 0) {
            return -1;
        }
        return width * height;
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        return radius * radius * Math.PI;
    }
}
// Dikdörtgenin genişliğini girin: 5
// Dikdörtgenin yüksekliğini girin: 4
// Dikdörtgenin alanı: 20.0
// Dairenin yarıçapını girin: 3
// Dairenin alanı: 28.274333882308138
/*
                       Main15
------------------------------------------------------

------------------------------------------------------
main(String[] args)
area(double width, double height) : double
area(double radius) : double
------------------------------------------------------
 */
