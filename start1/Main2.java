package start;

public class Main2 {

    static void myMethod() {
        System.out.println("OHD");
    }

    public static void main(String[] args) {
        myMethod();    // OHD
        myMethod();    // OHD
        myMethod();    // OHD
    }
}
/*
public class First : Java'da sınıf tanımlaması bu şekilde yapılır. Sınıfın adı First olarak belirlenmiş ve public olarak tanımlandığı için diğer sınıflardan erişilebilir.
static void myMethod() : Bu satırda myMethod adında bir metot tanımlanıyor. static olduğu için bu metot, sınıf ismi üzerinden çağrılabilir. void, metotun geri dönüş değeri olmadığını belirtir.
myMethod(); : myMethod() metodunu çağırır. Java'da metod isimleri genellikle küçük harf ile başlar. myMethod statik olduğundan, sınıfın bir nesnesi olmadan doğrudan bu metod çağrılabiliyor. Görüldüğü gibi bir yöntem birden çok kez de çağrılabilir.


           Main2
-----------------------------

-----------------------------
static myMethod() : void
main(args : String[]) : void
-----------------------------

 */
