/*
Trendyol benzeri e-ticaret senaryosu : E-ticaret platformu için basit bir ürün yönetim sistemi
Bir e-ticaret platformu için basit bir ürün yönetim sistemi oluşturun. Aşağıdaki görevleri tamamlayın:
Şirketin yalnızca akıllı saat olan bir teknolojik ürün sattığını varsayalım. Bir müşteri teknolojik ürünlerden 10 akıllı saat alır.
Her akıllı saatin fiyatı 87,55 dolardır. Kullanıcıdan ürün adı ve miktarı gibi ürün bilgileri için girdiler alın. Müşterinin ödemesi gereken toplam tutarı
hesaplayın ve bir yöntem oluşturarak ekrana yazdırın. Müşteri bu son fiyatı onaylarsa, kullanıcıdan IBAN numarasını, adresi isteyin ve bir yöntem
oluşturarak ürünü gönderin.
Talimatlar:
Product Class: Kullanıcıdan ürün adını ve ürün miktarını girdi olarak alan bir Product sınıfı oluşturun. Bu nedenle, ürün bilgilerini depolar ve ürünle ilgili
işlemleri yönetir. Ve ürün bilgilerini görüntülemelidir….vb. gerekirse diğer yöntemleri burada oluşturabilirsiniz.  displayProductInfo(): Ürün bilgilerini
görüntüler.
ShoppingBasket Sınıfı: E-Ticaret ShoppingBasket sınıfı, kullanıcının alacağı ürünleri yönetir, örneğin ödeme sürecini tamamlar, ürünü stoktan çıkarır ve
ekranda tutarını görüntüler. Ayrıca stok azaltma işlemlerini de gerçekleştirir. ….vb. gerekirse diğer yöntemleri burada oluşturabilirsiniz.
reduceStock(int quantity): Stok miktarını azaltır ve stok yetersizse bir mesaj döndürür.
Main Class: Kullanıcıdan veri alır, ilişkili nesneleri oluşturur ve alışverişi gerçekleştirir. …vb. gerekirse başka metodları da burada oluşturabilirsiniz.
Notlar: IBAN'ın 16 haneli sayılardan oluştuğunu ve ödeme işleminin herhangi bir hata olmadan başarıyla tamamlandığını varsayalım. Diğer her
şeyi dilediğiniz gibi kabul edebilirsiniz.
 */
package homework_and_lab_and_quiz.shopping3;

import java.util.Scanner;

class Product2 {

    private String productName;
    private int quantity;
    private static final double PRICE_PER_WATCH = 87.55;

    public Product2(String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }

    public void displayProductInfo() {
        System.out.println("Product: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per item: $" + PRICE_PER_WATCH);
        System.out.println("Total Price: $" + quantity * PRICE_PER_WATCH);
    }

    public double calculateTotalPrice() {
        return quantity * PRICE_PER_WATCH;
    }

    public int getQuantity() {
        return quantity;
    }
}

class ShoppingBasket2 {

    private int stock;

    public ShoppingBasket2(int stock) {
        this.stock = stock;
    }

    public void reduceStock(int quantity) {
        if (quantity > stock) {
            System.out.println("Insufficient stock available!");
        } else {
            stock -= quantity;
            System.out.println("Stock reduced by " + quantity + ". Remaining stock: " + stock);
        }
    }

    public boolean processPayment(String iban) {
        if (iban.length() == 16 && iban.matches("\\d+")) {
            System.out.println("Payment completed successfully. IBAN: " + iban);
            return true;
        } else {
            System.out.println("Invalid IBAN. Transaction failed.");
            return false;
        }
    }

    public int getStock() {
        return stock;
    }
}

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ShoppingBasket2 basket = new ShoppingBasket2(10);

        System.out.print("Enter product name: ");
        String productName = scanner.nextLine();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        scanner.nextLine();

        Product2 product = new Product2(productName, quantity);

        product.displayProductInfo();

        if (quantity > basket.getStock()) {
            System.out.println("Not enough stock to fulfill this order.");
        } else {
            System.out.print("Enter your IBAN (16 digits): ");
            String iban = scanner.nextLine();

            System.out.print("Enter your shipping address: ");
            String address = scanner.nextLine();

            if (basket.processPayment(iban)) {
                System.out.println("Order confirmed! Shipping to: " + address);
                basket.reduceStock(quantity);
            }
        }
        scanner.close();
    }
}
/*
Enter product name: ffda
Enter quantity: 5
Product: ffda
Quantity: 5
Price per item: $87.55
Total Price: $437.75
Enter your IBAN (16 digits): 1234567891234567
Enter your shipping address: fadfa
Payment completed successfully. IBAN: 1234567891234567
Order confirmed! Shipping to: fadfa
Stock reduced by 5. Remaining stock: 5

               Main2
----------------------------------
----------------------------------
- main(args: String[]): void
-----------------------------------


                                           ShoppingBasket2
------------------------------------------------------------------------------------------------------
- stock: int
------------------------------------------------------------------------------------------------------
+ ShoppingBasket(stock : int)
+ reduceStock(quantity: int): void
+ processPayment(iban: String): boolean
+ getStock(): int
-------------------------------------------------------------------------------------------------------

                                                 Product2
---------------------------------------------------------------------------------------------------------
- productName: String
- quantity: int
- PRICE_PER_WATCH: double
---------------------------------------------------------------------------------------------------------
+ Product(productName: String, quantity: int)
+ displayProductInfo(): void
+ calculateTotalPrice(): double
+ getQuantity(): int
---------------------------------------------------------------------------------------------------------












 */
