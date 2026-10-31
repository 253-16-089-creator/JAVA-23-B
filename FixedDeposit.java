package bd.edu.diu;

public class FixedDeposit {
    private int accountNo;
    private String title;
    private double balance; 

    
    public FixedDeposit() {
        this.accountNo = 0;
        this.title = "Unknown";
        this.balance = 0.0;
    }

    
    public FixedDeposit(int accountNo, String title) {
        this.accountNo = accountNo;
        this.title = title;
        this.balance = 0.0; 
    }

    public FixedDeposit(int accountNo, double balance, String title) {
        this.accountNo = accountNo;
        this.balance = balance;
        this.title = title;
    }

    
    public int getAccountNo() { return accountNo; }
    public void setAccountNo(int accountNo) { this.accountNo = accountNo; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    // Base print method
    public void showBalance() {
        System.out.println("----- Account Information -----");
        System.out.println(" Account No  : " + accountNo);
        System.out.println(" Account Title: " + title);
        System.out.println(" Balance      : " + balance);
    }
}
