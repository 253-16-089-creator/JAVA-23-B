package bd.edu.diu;

public class Customer {
    private int id;
    private String name;
    private String cell;
    private String phone;

    public Customer() {
    }

    public Customer(int id, String name, String cell, String phone) {
        this.id = id;
        this.name = name;
        this.cell = cell;
        this.phone = phone;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

   
    public void displayCustomer() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Cell: " + cell);
        System.out.println("Phone: " + phone);
    }

    public static void main(String[] args) {
        Customer c1 = new Customer(101, "Rahim", "01700000000", "02-9876543");
        c1.displayCustomer();
    }
}