package method.mains2.Project5;

import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {
        // Account nesneleri oluştur
        Account account1 = new Account(50.00);
        Account account2 = new Account(-7.53);
        // her bir nesnenin başlangıç bakiyesini göster
        System.out.printf("account1 bakiyesi: $%.2f\n", account1.getBalance());
        System.out.printf("account2 bakiyesi: $%.2f\n", account2.getBalance());
        Scanner input = new Scanner(System.in);
        double depositAmount;  // okunan para yatırma miktarı
        // account1 için para yatırma miktarını iste
        System.out.print("account1 için yatırılacak miktarı girin: ");
        depositAmount = input.nextDouble(); // kullanıcıdan girdi al
        System.out.printf("\n%.2f miktarı account1 bakiyesine ekleniyor\n\n",
                depositAmount);
        account1.credit(depositAmount); // account1 bakiyesine ekle
        // güncel bakiyeleri göster
        System.out.printf("account1 bakiyesi: $%.2f\n", account1.getBalance());
        System.out.printf("account2 bakiyesi: $%.2f\n", account2.getBalance());

        // account2 için para yatırma miktarını iste
        System.out.print("account2 için yatırılacak miktarı girin: ");
        depositAmount = input.nextDouble(); // kullanıcıdan girdi al
        System.out.printf("\n%.2f miktarı account2 bakiyesine ekleniyor\n\n",
                depositAmount);
        account2.credit(depositAmount); // account2 bakiyesine ekle

        // güncel bakiyeleri göster
        System.out.printf("account1 bakiyesi: $%.2f\n", account1.getBalance());
        System.out.printf("account2 bakiyesi: $%.2f\n", account2.getBalance());
        input.close();
    } // main metodunun sonu
} // AccountTest sınıfının sonu
/*
account1 bakiyesi: $50,00
account2 bakiyesi: $0,00
account1 için yatırılacak miktarı girin: 43

43,00 miktarı account1 bakiyesine ekleniyor

account1 bakiyesi: $93,00
account2 bakiyesi: $0,00
account2 için yatırılacak miktarı girin: 21

21,00 miktarı account2 bakiyesine ekleniyor

account1 bakiyesi: $93,00
account2 bakiyesi: $21,00

      Account
      -------------------------------------------------
      - balance : Double
      -------------------------------------------------
      <<constructor>> Account (initialBalance : Double)
      + credit (amount : Double)
      + getBalance() : Double
       -------------------------------------------------
 */
