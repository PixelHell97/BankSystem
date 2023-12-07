package BankSys;

import java.util.Vector;

public class Client extends Person{
    private int id;
    private double balance;
    static private int ID_Generator = 1;

    public Client() {}
    public Client(String name, String password, double balance) {
        super(name, password);
        this.id = ID_Generator;
        setBalance(balance);
        ID_Generator++;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {this.id = id;}

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        while (true) {
            if (!Validation.isValidBalance(balance)) {
                System.err.println("Invalid balance.");
                System.out.println("Balance must be more than or equal 1500.");
                balance = cin.nextDouble();
            }else {
                this.balance = balance;
                return;
            }
        }
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Successful operation");
        System.out.print("Your balance: " + getBalance());
    }
    public void withdrew(double amount) {
        if (getBalance() < amount || getBalance() == 0) {
            System.err.println("Invalid operation");
            return;
        }
        this.balance -= amount;
        System.out.println("Successful operation");
        System.out.print("Your balance: " + getBalance());
    }
    public void transferTo(double amount, Client recipient) {
        if (getBalance() < amount || getBalance() == 0) {
            System.err.println("Invalid operation");
            return;
        }
        recipient.deposit(amount);
        this.balance -= amount;
        System.out.println("Successful operation");
        System.out.print("Your balance: " + getBalance());
    }
    public void checkBalance() {
        System.out.print("Your balance: " + getBalance());
    }

    @Override
    public void displayInfo() {
        System.out.println("ID: " + getId());
        super.displayInfo();
        checkBalance();
    }
    static Vector<Client> allClients;
}
