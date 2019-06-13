package domain;

public class Account 
{
   private int accountNumber;
   private int pin;
   private double availableBalance;
   private double totalBalance; 
   
   public Account(int theAccountNumber, int thePIN, 
      double theAvailableBalance, double theTotalBalance) {
      accountNumber = theAccountNumber;
      pin = thePIN;
      availableBalance = theAvailableBalance;
      totalBalance = theTotalBalance;
   }

   public boolean validatePIN(int userPIN) {
      if (userPIN == pin)
         return true;
      else
         return false;
   }
   
   public double getAvailableBalance() {
      return availableBalance;
   }

   public double getTotalBalance() {
      return totalBalance;
   } // end method getTotalBalance

   // credits an amount to the account
   public void credit(double amount)
   {
      totalBalance += amount; // add to total balance
   } // end method credit

   // debits an amount from the account
   public void debit(double amount)
   {
      availableBalance -= amount; // subtract from available balance
      totalBalance -= amount; // subtract from total balance
   } // end method debit

   // returns account number
   public int getAccountNumber()
   {
      return accountNumber;  
   } // end method getAccountNumber
}