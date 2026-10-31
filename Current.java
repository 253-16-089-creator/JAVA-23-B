package bd.edu.diu;

public class Current {
    private int accountNo;
    private String title;

    
    public Current() {
        this.accountNo = 0;
        this.title = "Unknown";
    }

    
    public Current(int accountNo, String title) {
        this.accountNo = accountNo;
        this.title = title;
    }

    
    public int getAccountNo() { return accountNo; }
    public void setAccountNo(int accountNo) { this.accountNo = accountNo; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

   
    public void showBalance() {
        System.out.println("----------------------------------");
        System.out.println(" Account No  : " + accountNo);
        System.out.println(" Account Title: " + title);
    }
}

