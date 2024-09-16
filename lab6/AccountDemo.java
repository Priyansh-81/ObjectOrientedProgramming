class Account {

    String customerName;
    String accNo;
    String accType;
    double balance;

    Account(String customerName, String accNo, String accType, double balance) {
        this.customerName = customerName;
        this.accNo = accNo;
        this.accType = accType;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to display the balance
    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account {

    double interestRate;

    SavingsAccount(
        String customerName,
        String accNo,
        double balance,
        double interestRate
    ) {
        super(customerName, accNo, "Savings", balance);
        this.interestRate = interestRate;
    }

    // Method to compute and deposit interest
    void computeAndDepositInterest() {
        double interest = (balance * interestRate) / 100;
        balance += interest;
        System.out.println("Interest deposited. New balance: " + balance);
    }

    // Method to withdraw money and update balance
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(
                "Withdrawal successful. New balance: " + balance
            );
        } else {
            System.out.println(
                "Invalid withdrawal amount or insufficient balance."
            );
        }
    }
}

class CurrentAccount extends Account {

    double minimumBalance;
    double penalty;

    // Constructor
    CurrentAccount(
        String customerName,
        String accNo,
        double balance,
        double minimumBalance,
        double penalty
    ) {
        super(customerName, accNo, "Current", balance);
        this.minimumBalance = minimumBalance;
        this.penalty = penalty;
    }

    // Method to withdraw money and update balance
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(
                "Withdrawal successful. New balance: " + balance
            );
            checkMinimumBalance();
        } else {
            System.out.println(
                "Invalid withdrawal amount or insufficient balance."
            );
        }
    }

    // Method to check minimum balance and impose penalty if necessary
    void checkMinimumBalance() {
        if (balance < minimumBalance) {
            balance -= penalty;
            System.out.println(
                "Penalty imposed for not maintaining minimum balance. New balance: " +
                balance
            );
        }
    }
}

class AccountDemo {

    public static void main(String[] args) {
        // Create a SavingsAccount
        SavingsAccount savings = new SavingsAccount(
            "Priyansh",
            "IIFL123",
            1000.0,
            5.0
        );
        savings.displayBalance();
        savings.deposit(5000);
        savings.computeAndDepositInterest();
        savings.withdraw(300);

        // Create a CurrentAccount
        CurrentAccount current = new CurrentAccount(
            "Jacob",
            "ISBC456",
            2000.0,
            1000.0,
            100.0
        );
        current.displayBalance();
        current.deposit(500);
        current.withdraw(1700);
    }
}
