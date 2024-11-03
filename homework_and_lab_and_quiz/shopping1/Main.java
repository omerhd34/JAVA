package homework_and_lab_and_quiz.shopping1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Product appleAirpods = new Product("Apple Airpods", 5, 17.52);

        appleAirpods.displayProductInfo();

        int quantity;
        do {
            System.out.print("How many AirPods would you like to buy? ");
            quantity = scanner.nextInt();

            if (quantity < 0) {
                System.out.println("Invalid quantity. Please enter a positive number.");
            } else if (quantity > appleAirpods.getQuantity()) {
                System.out.println("Sorry, we don't have enough stock. Please enter a lower quantity.");
            }
        } while (quantity < 0 || quantity > appleAirpods.getQuantity());

        if (quantity == 0) {
            System.out.println("So, what else can I help you with?");
        } else {
            ShoppingBasket basket = new ShoppingBasket(appleAirpods);
            basket.addProduct(quantity);

            double totalPrice = basket.calculateTotalPrice();
            System.out.println("Total Price: $" + totalPrice);

            System.out.print("Do you approve the payment? (yes/no): ");
            String approval = scanner.next();

            if (approval.equalsIgnoreCase("yes")) {
                basket.reduceStock();

                String iban;
                do {
                    System.out.print("Please enter your IBAN (16 digits): ");
                    iban = scanner.next();

                    if (iban.length() != 16) {
                        System.out.println("Invalid IBAN. Please enter exactly 16 digits.");
                    }
                } while (iban.length() != 16);

                String address;
                do {
                    System.out.print("Please enter your address: ");
                    address = scanner.next();

                    if (address.length() > 25) {
                        System.out.println("Address is too long. Please enter a maximum of 25 characters.");
                    }
                } while (address.length() > 25);

                System.out.println("Order confirmed! The product will be sent to " + address + ".");
            } else {
                System.out.println("Payment not approved. Transaction cancelled.");
            }
        }
        scanner.close();
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
