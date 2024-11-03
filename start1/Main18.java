package start;

public class Main18 {

    public static void main(String[] args) {
        // mutlak değer
        System.out.println(Math.abs(-4.7));     // 4.7
        System.out.println(Math.abs(4.7));    // 4.7
        System.out.println(Math.abs(3));      // 3
        // x^(1/3)
        System.out.println(Math.cbrt(0));     // 0.0  
        System.out.println(Math.cbrt(1));     // 1.0
        System.out.println(Math.cbrt(27));    // 3.0
        System.out.println(Math.cbrt(-27));     // -3.0
        // toplam
        System.out.println(Math.addExact(12, 16));          // 28
        System.out.println(Math.addExact(1000, 2406));      // 3406
        // e^x
        System.out.println(Math.exp(0));      // 1.0
        System.out.println(Math.exp(1));     // 2.71828182...
        System.out.println(Math.exp(1.8));  // 6.04964746...
        // to Degree
        System.out.println(Math.toDegrees(Math.PI));        // 180.0
        System.out.println(Math.toDegrees(Math.PI / 4));  // 45.0
        System.out.println(Math.toDegrees(-0.5236));    // -30.00...
        // to Radians
        System.out.println(Math.toRadians(180));  // 3.141...
        System.out.println(Math.toRadians(-30));   // -0.523...
        // Min & Max
        System.out.println(Math.min(2.0, 0.25));       // 0.25
        System.out.println(Math.min(31.2f, 18.0f));  // 18.0
        System.out.println(Math.min(96L, 204L));    // 96
        System.out.println(Math.max(2.0, 0.25));       // 2.0
        System.out.println(Math.max(31.2f, 18.0f));  // 31.2
        System.out.println(Math.max(96L, 204L));  // 204
        // +1
        System.out.println(Math.incrementExact(18));    // 19
        System.out.println(Math.incrementExact(947));  // 948
        // double sayısını en yakın tam sayıya yuvarlamak için kullanılır.
        System.out.println(Math.rint(0.5));    // 0.0
        System.out.println(Math.rint(1.3));    // 1.0
        System.out.println(Math.rint(5.1));    // 5.0
        System.out.println(Math.rint(-5.1));   // -5.0
        System.out.println(Math.rint(-5.9));   // -6.0
        // Yuvarla
        System.out.println(Math.round(0.60));   // 1
        System.out.println(Math.round(0.40));  // 0
        System.out.println(Math.round(5));        // 5
        System.out.println(Math.round(5.1));     // 5
        System.out.println(Math.round(-5.1));   // -5
        System.out.println(Math.round(-5.9));   // -6
        // yukarı yuvarla
        System.out.println(Math.ceil(0.60));        // 1.0
        System.out.println(Math.ceil(0.40));        // 1.0
        System.out.println(Math.ceil(5));           // 5.0
        System.out.println(Math.ceil(5.1));         // 6.0
        System.out.println(Math.ceil(-5.1));          // -5.0
        System.out.println(Math.ceil(-5.9));          // -5.0
        // aşağı yuvarla
        System.out.println(Math.floor(0.60));   // 0.0
        System.out.println(Math.floor(0.40));  // 0.0
        System.out.println(Math.floor(5));       // 5.0
        System.out.println(Math.floor(5.1));    // 5.0
        System.out.println(Math.floor(-5.1));   // -6.0
        System.out.println(Math.floor(-5.9));   // -6.0
        // Mutlak Değer
        System.out.println(Math.negateExact(-32));     // 32
        // Çarp
        System.out.println(Math.multiplyExact(-4, 95));  // -380
        // a^b
        System.out.println(Math.pow(2, 5));     // 32
        System.out.println(Math.pow(9, 0.5));  // 3
        System.out.println(Math.pow(8, -1));   // 0.125
        // Fark
        System.out.println(Math.subtractExact(12, 16));  // -4
        System.out.println(Math.subtractExact(240, 100)); // 140
        // Sayının işaretini döndürmek için kullanılır.  
        System.out.println(Math.signum(12));   // 1.0
        System.out.println(Math.signum(0));     // 0.0
        System.out.println(Math.signum(-6));    // -1.0
        // Rastgele sayı
        System.out.println(Math.random());  // 0.524607...
    }
}
