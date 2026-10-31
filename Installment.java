package bd.edu.diu;

public class Installment { 
    private int installmentNo; 
    private double monthlyAmount; 
    private String dueDate; 
    private boolean isPaid; 

    
    public Installment() {} 

    
    public Installment(int installmentNo, double monthlyAmount, String dueDate, boolean isPaid) { 
        this.installmentNo = installmentNo; 
        this.monthlyAmount = monthlyAmount; 
        this.dueDate = dueDate; 
        this.isPaid = isPaid; 
    } 

  
    public int getInstallmentNo() { 
        return installmentNo; 
    } 

    public void setInstallmentNo(int installmentNo) { 
        this.installmentNo = installmentNo; 
    } 

    public double getMonthlyAmount() { 
        return monthlyAmount; 
    } 

    public void setMonthlyAmount(double monthlyAmount) { 
        this.monthlyAmount = monthlyAmount; 
    } 

    public String getDueDate() { 
        return dueDate; 
    } 

    public void setDueDate(String dueDate) { 
        this.dueDate = dueDate; 
    } 

    public boolean isPaid() { 
        return isPaid; 
    } 

    public void setPaid(boolean paid) { 
        isPaid = paid; 
    } 

   
    public void showInstallmentDetails() { 
        System.out.println("Installment No : " + installmentNo); 
        System.out.println("Monthly Amount : " + monthlyAmount); 
        System.out.println("Due Date : " + dueDate); 
        System.out.println("Status : " + (isPaid ? "Paid" : "Unpaid")); 
        System.out.println("----------------------------------"); 
    } 


    public static void main(String[] args) {
        
        Installment testInstallment = new Installment(1, 15000.0, "2026-11-10", false);
        
        System.out.println("--- Testing Installment Class ---");
        testInstallment.showInstallmentDetails();
        
      
        System.out.println("Updating payment status to Paid...");
        testInstallment.setPaid(true);
        testInstallment.showInstallmentDetails();
    }
}


