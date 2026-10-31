package bd.edu.diu;

public class Accounts {
    private int accountNo;
    private String title;
    private double balance;

    public Accounts() {
    }

    public Accounts(int accountNo, String title) {
        this.accountNo = accountNo;
        this.title = title;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdrawn(double amount) {
        this.balance -= amount;
    }

    public void showBalance() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Title: " + title);
        System.out.println("Balance: " + balance);
        System.out.println("______******______******______******");
    }

    public static void main(String[] args) {
        Accounts accounts = new Accounts();
        accounts.showBalance();
        accounts.setAccountNo(1001);
        accounts.setTitle("test");
        accounts.showBalance();
        accounts.deposit(5000);
        accounts.showBalance();
        accounts.withdrawn(500);
        accounts.showBalance();

        
        Accounts accounts2 = new Accounts(1001, "myAccount");
        accounts2.showBalance();
        accounts2.deposit(5000);
        accounts2.showBalance();
        accounts2.withdrawn(50000);
        accounts2.showBalance();
    }
}
