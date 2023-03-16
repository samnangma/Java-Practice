package Bank;
// Suppose you want to create a banking Software with function like:
//    1. Deposit
//    2. Withdrawal
//    3.Show Balance

// We are supposed to open 2 different account types, one for saving and other for credit card.
//  1. Saving Account
//  2. Credit Card Account

class Account{
    private double balance;
    void withdraw(double amount){
        if(amount <= this.balance){
            this.balance -= amount;
        } else {
            System.out.println("Insufficient funds !!");
        }
    }

    void deposit(double amount){
        balance += amount;
    }

    public double getBalance(){
        return this.balance;
    }
    public void setBalance(){
        this.balance=balance;
    }
}

// SavingAccount
class SavingAccount extends Account{
    private float interestRates;
    public float getInterestRates(){ return this.interestRates ;}
    public void setInterestRates(float interestRates){
        this.interestRates = interestRates;
    }
    double calculateInterest(){
        return getBalance() * (interestRates/100);
    }
}

// CreditCardAccount
class CreditCardAccount extends Account{
    private  float interestRates;
    private float creditCardLimit;

    double calculateInterest(){
        return getBalance() * (interestRates/100);
    }

    @Override
    void withdraw(double amount) {
        if(amount <= creditCardLimit){
            super.withdraw(amount);
        }else {
            System.out.println("Amount exceed the credit card limit!!! ");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        SavingAccount account1 = new SavingAccount();
        account1.deposit(1000);
        account1.setInterestRates(50);
        System.out.println("Interest of balance : " + account1.calculateInterest()+ "$");
        System.out.println("Original amount : "+ account1.getBalance()+ "$");
        System.out.println("Total money "+ account1.calculateInterest()+"$");

        account1.withdraw(1000);
        System.out.println("Money left : "+ account1.getBalance()+"$");
    }


}


