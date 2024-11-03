package homework_and_lab_and_quiz.shopping1;

public class Product {

    private String productName;
    private int quantity;
    private double price;

    public Product(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public void displayProductInfo() {
        System.out.println("Product: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per unit: $" + price);
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void reduceStock(int quantity) {
        if (this.quantity >= quantity) {
            this.quantity -= quantity;
        } else {
            System.out.println("Insufficient stock!");
        }
    }
}
/*
Product: Apple Airpods
Quantity: 5
Price per unit: $17.52
How many AirPods would you like to buy? 4
Total Price: $70.08
Do you approve the payment? (yes/no): yes
Please enter your IBAN (16 digits): 1234567891234567
Please enter your address: Bostancı
Order confirmed! The product will be sent to Bostancı.

               Main
-------------------------------
-------------------------------
   main(args: String[])


                              Product
-------------------------------------------------------------------------------
String productName
int quantity
double price
-------------------------------------------------------------------------------
Product(String productName, int quantity, double price)
void displayProductInfo()
int getQuantity()
double getPrice()
void reduceStock(int quantity)


                                   ShoppingBasket
-------------------------------------------------------------------------------
Product product
int orderedQuantity
-------------------------------------------------------------------------------
ShoppingBasket(Product product)
void addProduct(int quantity)
double calculateTotalPrice()
void reduceStock()
 */
