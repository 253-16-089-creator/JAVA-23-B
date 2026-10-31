package bd.edu.diu;

public class Loan {
    public static void main(String[] args) {
      
        Customer customer1 = new Customer(101, "Anik Rahman");

        
        LoanAccount loan1 = new LoanAccount(50021, 75000.0, 8.5, 24, customer1);

        System.out.println("--- DIU Loan Management System ---");
        loan1.showLoanDetails();
    }
}

class Customer {
    private int customerId;
    private String name;

    public Customer() {}

    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public int getCustomerId() { return customerId; }
    public void setCustomerId(int customerId) { this.customerId = customerId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}

class LoanAccount {
    private int loanId;
    private double loanAmount;
    private double interestRate;
    private int tenureMonths;
    private Customer customer;

    public LoanAccount() {}

    public LoanAccount(int loanId, double loanAmount, double interestRate, int tenureMonths, Customer customer) {
        this.loanId = loanId;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.tenureMonths = tenureMonths;
        this.customer = customer;
    }

    public int getLoanId() { return loanId; }
    public void setLoanId(int loanId) { this.loanId = loanId; }

    public double getLoanAmount() { return loanAmount; }
    public void setLoanAmount(double loanAmount) { this.loanAmount = loanAmount; }

    public double getInterestRate() { return interestRate; }
    public void setInterestRate(double interestRate) { this.interestRate = interestRate; }

    public int getTenureMonths() { return tenureMonths; }
    public void setTenureMonths(int tenureMonths) { this.tenureMonths = tenureMonths; }

    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }

    public void showLoanDetails() {
        System.out.println("Loan ID        : " + loanId);
        System.out.println("Loan Amount    : " + loanAmount);
        System.out.println("Interest Rate  : " + interestRate + "%");
        System.out.println("Tenure (Months): " + tenureMonths);
        if (customer != null) {
            System.out.println("Customer Name  : " + customer.getName());
        }
        System.out.println("----------------------------------");
    }
}

