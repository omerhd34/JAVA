package method.mains2.Project5;

public class Account {

    private double balance; // bakiyeyi tutan örnek değişken
    // yapıcı metod

    public Account(double initialBalance) {
// initialBalance'in 0.0'dan büyük olduğunu doğrula değilse, balance 0.0.
        if (initialBalance > 0.0) {
            balance = initialBalance;
        }
    } // Account yapıcısının sonu

    // hesaba bir miktar kredi (ekleme) yap
    public void credit(double amount) {
        balance = balance + amount; // bakiyeye miktar ekle
    } // credit metodunun sonu

    // hesabın bakiyesini geri döndür
    public double getBalance() {
        return balance; // bakiyenin değerini geri döndür
    } // getBalance metodunun sonu
} // Account sınıfının sonu
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
