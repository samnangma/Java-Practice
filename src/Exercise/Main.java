package Exercise;

// The Account class represents a basic bank account
class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
}

// The SavingsAccount class represents a savings account
class SavingsAccount extends Account {
    public SavingsAccount(double balance) {
        super(balance);
    }

    public double calculateInterest() {
        // Calculate interest and return it
        double interestRate = 0.02;
        return balance * interestRate;
    }
}

// The CreditCardAccount class represents a credit card account
class CreditCardAccount extends Account {
    public CreditCardAccount(double balance) {
        super(balance);
    }

    public void payBill(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds to pay bill");
        }
    }
}

// Example usage
class Main {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(1000);
        savings.deposit(500);
        System.out.println("Savings account balance: " + savings.getBalance());
        System.out.println("Savings account interest: " + savings.calculateInterest());
        savings.withdraw(200);
        System.out.println("Savings account balance: " + savings.getBalance());

        CreditCardAccount creditCard = new CreditCardAccount(500);
        creditCard.deposit(100);
        System.out.println("Credit card account balance: " + creditCard.getBalance());
        creditCard.payBill(200);
        System.out.println("Credit card account balance: " + creditCard.getBalance());
    }
}
