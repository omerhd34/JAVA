/*
Havlamayı seven bir köpeğimiz var. Eğer köpeğimiz geceleri havlarsa uyanacağız ama gündüzleri havlarsa tepki vermeyeceğimiz bir metod yazmaya çalışacağız.
shouldWakeUp isimli metodumuz 2 tane parametre almalı. İlk parametre boolean olmalı ve köpeğin şu an havlayıp havlamadığını tutmalı.
İkinci parametremiz int değer almalı. 0-23 arasında değer alabilir. Köpeğimiz akşam 8 ile sabah 8 arasında havlıyorsa metod true değer dönmeli.
Diğer şartlar altında metodumuz false değer dönmeli.
İkinci parametre 0'dan küçükse ya da 23'den büyükse metodumuz yine false değer dönmeli.
shouldWakeUp (true, 1); => true dönmeli(Gece 1'de köpeğimiz havlıyor)
shouldWakeUp (false, 2); => false dönmeli.(köpek havlamıyor.)
shouldWakeUp (true, 8); => false dönmeli.(8'den sonra ise tepki vermeliyiz.)
shouldWakeUp (true, -1); => false dönmeli(-1 geçersiz değer)
 */
package method.mains;

public class Main8 {

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        if (barking && (hourOfDay < 8 || hourOfDay >= 20)) {
            return true;
        }
        return false;
    }
}
//true
//false
//false
//false
/*
                           Main8
------------------------------------------------------

------------------------------------------------------
main(String[] args)
shouldWakeUp(boolean barking,int hourOfDay) : boolean
------------------------------------------------------
 */
