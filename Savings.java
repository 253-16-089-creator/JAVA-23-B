package bd.edu.diu;

public class Savings extends Accounts {
    private double interestRate;
    private double minimumBalance;

    public Savings() {
        super();
    }

    public Savings(int accountNo, String title, double interestRate, double minimumBalance) {
        super(accountNo, title);
        this.interestRate = interestRate;
        this.minimumBalance = minimumBalance;
    }

    public double getInterestRate() { return interestRate; }
    public void setInterestRate(double interestRate) { this.interestRate = interestRate; }

    public double getMinimumBalance() { return minimumBalance; }
    public void setMinimumBalance(double minimumBalance) { this.minimumBalance = minimumBalance; }

    public void withdraw(double amount) {
        if ((getBalance() - amount) >= minimumBalance) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal denied: Minimum balance requirement not met.");
        }
    }

    public void showBalance() {
        super.showBalance();
        System.out.println(" Interest %  : " + interestRate);
        System.out.println(" Min Balance : " + minimumBalance);
        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {
        System.out.println("--- DIU Savings Account System ---");

        Savings acc1 = new Savings(2001, "Anik Rahman", 5.5, 500.0);

        acc1.deposit(5000.0);
        acc1.withdraw(2000.0);
        acc1.withdraw(2700.0);

        System.out.println("----------------------------------");
        acc1.showBalance();
    }
}

class Accounts {
    private int accountNo;
    private String title;
    private double balance;

    public Accounts() {}

    public Accounts(int accountNo, String title) {
        this.accountNo = accountNo;
        this.title = title;
        this.balance = 0.0;
    }

    public int getAccountNo() { return accountNo; }
    public void setAccountNo(int accountNo) { this.accountNo = accountNo; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void showBalance() {
        System.out.println(" Account No  : " + accountNo);
        System.out.println(" Title       : " + title);
        System.out.println(" Balance     : " + balance);
    }
}
