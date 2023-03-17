package demointerface;

public class CreditCardAccount implements Account {
    private double balance;
    private float interestRate;
    private double limitCredit;

    CreditCardAccount() {
        balance = 10;
        interestRate = 30;
        limitCredit = 100;
    }

    @Override
    public void withdraw(double amount) {
        if(amount <= limitCredit){
            if(amount <= balance){
                balance -= amount;
            } else {
                System.out.println("Insufficient balance !!!");
            }

        } else {
            System.out.println("Amount exceed the limit !!!!!!");
        }
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public double calculateInterest() {
        return balance * (interestRate/100);
    }
}
