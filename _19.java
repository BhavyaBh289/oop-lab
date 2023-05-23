interface Account {
    void set(String accNum, double balance);
    void display();
}

interface Person1 {
    void store(String name);
    void disp();
}

class Customer implements Account, Person1 {
    private String name;
    private String accNum;
    private double balance;

    public void set(String accNum, double balance) {
        this.accNum = accNum;
        this.balance = balance;
    }

    public void display() {
        System.out.println("Account Number: " + accNum);
        System.out.println("Balance: $" + balance);
        double interest = balance * 0.05; // Assuming 5% interest rate
        System.out.println("Interest: $" + interest);
    }

    public void store(String name) {
        this.name = name;
    }

    public void disp() {
        System.out.println("Customer Name: " + name);
    }
}

public class _19 {
    public static void main(String[] args) {
        Customer customer = new Customer();

        // Accepting information
        customer.store("John Doe");
        customer.set("1234567890", 10000.0);

        // Displaying account information with interest
        customer.disp();
        customer.display();
    }
}
