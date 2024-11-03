package extra;

class Sphere {

    private final double r;

    // Constructor
    public Sphere(double r) {
        this.r = r;
    }

    // Hacim hesaplama metodu
    public double findVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
    }
}

class Cylinder {

    private final double r;
    private final double h;

    // Constructor
    public Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    // Hacim hesaplama metodu
    public double findVolume() {
        return Math.PI * Math.pow(r, 2) * h;
    }
}

class Cone {

    private final double r;
    private final double h;

    // Constructor
    public Cone(double r, double h) {
        this.r = r;
        this.h = h;
    }

    // Hacim hesaplama metodu
    public double findVolume() {
        return (1.0 / 3.0) * Math.PI * Math.pow(r, 2) * h;
    }
}

public class Example1 {

    public static void main(String[] args) {
        // Verilen tabloya göre nesneleri oluşturuyoruz
        Sphere sphere1 = new Sphere(2.5);       // Sphere1
        Cone cone1 = new Cone(1.9, 8.9);        // Cone1
        Cylinder cylinder1 = new Cylinder(1.5, 6.5); // Cylinder1
        Cone cone2 = new Cone(2.7, 5.7);        // Cone2
        Sphere sphere2 = new Sphere(3.5);       // Sphere2

        // Hacimleri hesaplayıp toplama işlemi yapıyoruz
        double totalVolume = 0.0;

        // Her bir nesnenin hacmini hesaplayıp ekrana yazdırıyoruz ve toplam hacme ekliyoruz
        System.out.println("Sphere1 Hacim: " + sphere1.findVolume());
        totalVolume += sphere1.findVolume();

        System.out.println("Cone1 Hacim: " + cone1.findVolume());
        totalVolume += cone1.findVolume();

        System.out.println("Cylinder1 Hacim: " + cylinder1.findVolume());
        totalVolume += cylinder1.findVolume();

        System.out.println("Cone2 Hacim: " + cone2.findVolume());
        totalVolume += cone2.findVolume();

        System.out.println("Sphere2 Hacim: " + sphere2.findVolume());
        totalVolume += sphere2.findVolume();

        // Toplam hacmi yazdırıyoruz
        System.out.println("Toplam Hacim: " + totalVolume);
    }
}
