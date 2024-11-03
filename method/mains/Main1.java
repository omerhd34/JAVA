package method.mains;

public class Main1 {

    public static void myMethod() {
        System.out.println("OHD");
    }

    public static void main(String[] args) {
        myMethod();            // OHD
    }
}
/*
Java'da bir sınıfı bildirmek için class anahtar sözcüğü kullanılır.
public, yöntemin tanımlayıcı sınıfının dışından erişilebilir olduğunu belirtir. Java'daki en açık erişim seviyesidir.
Herhangi bir yöntemi static olarak bildirirsek buna static metod denir. Static metodun temel avantajı, static yöntemi çağırmak için bir nesne oluşturmaya gerek olmamasıdır. Main() yöntemi JVM tarafından yürütülür, dolayısıyla main() yöntemini çağırmak için bir nesne oluşturulması gerekmez. Yani hafızadan tasarruf sağlar.
void, metodun herhangi bir değer döndürmediğini belirten dönüş türüdür. Eğer metod bir şey döndürecek olsaydı, bu anahtar kelime uygun türle (örn. int, String) değiştirilirdi.
main, metodun adıdır ve Java çalışma zamanı tarafından uygulamanın giriş noktası olarak tanınan özel bir yöntemdir.
String[] args, main metod’a iletilen bir String argümanları dizisidir. Komut satırı argümanlarının programa aktarılmasına izin verir.

 */
