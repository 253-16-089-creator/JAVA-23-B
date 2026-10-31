package bd.edu.diu;

import java.util.Date;

public class Transaction {
    private int serial;
    private Date date = new Date();
    private String type;
    private double amount;
    private String description;
    private Accounts accounts;
    

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Accounts getAccounts() {
        return accounts;
    }

    public void setAccounts(Accounts accounts) {
        this.accounts = accounts;
    }

    public Transaction() {
    }

    public void deposit(Accounts accounts, double amount) {
        setAccounts(accounts);
        setAmount(amount);
        setType("Deposit");
        accounts.deposit(amount);

    }

public void withdrawn(Accounts accounts, double amount) {
        setAccounts(accounts);
        setAmount(amount);
        setType("Withdrawn");
        accounts.withdrawn(amount);

    }
public void show(){
    System.out.println(" serial "+serial);
    System.out.println(" date "+date);
    System.out.println(" Type "+type);
    System.out.println(" Amount "+amount);
    System.out.println(" Account "+accounts.getAccountNo());
}

}
