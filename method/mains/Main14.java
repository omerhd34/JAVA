/*
Oyun oynamayı çok seven bir kedimiz var. Kedimizin oyun oynadığı zamanları tespit etmek için bir metod yazacağız.
Kedimiz sıcaklık 25 ile 35 arasındaysa oyun oynuyor olucak. Eğer mevsim yaz değilse. Mevsim yaz ise üst limit 35 yerine 45 olmalı.
isCatPlaying isimli 2 tane parametre alan bir metod yazmak istiyoruz. Eğer kedi oyun oynuyorsa metodumuz true değer dönecek. Oyun oynamıyorsa false değer dönecek.
İlk parametre boolean değer tutmalı ve mevsimin yaz olup olmadığını kontrol etmeli
İkinci parametre int olamlı ve sıcaklık değerini tutmalı.
isCatPlaying(true, 10); => false dönmeli(sıcaklık 25-45 arasında olmalıydı)
isCatPlaying(false, 36); => false dönmeli(sıcaklık 25-35 arasında olmalıydı)
isCatPlaying(false, 35); => true dönmeli(sıcaklık 25-35 arasında.)
 */
package method.mains;

public class Main14 {

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));        // false
        System.out.println(isCatPlaying(false, 36));       // false
        System.out.println(isCatPlaying(false, 35));       // true 
        System.out.println(isCatPlaying(true, 40));        // true
    }

    public static boolean isCatPlaying(boolean isSummer, int temperature) {
        int upperLimit = isSummer ? 45 : 35;
        return (temperature >= 25 && temperature <= upperLimit);
    }
}
/*
false
false
true
true
 */
