package BankSys;

import java.util.Vector;

public class Employee extends Person{
    private int id;
    protected double salary;
    static private int ID_Generator = 1;

    public Employee() {}
    public Employee(String name, String password, double salary) {
        super(name, password);
        this.id = ID_Generator;
        setSalary(salary);
        ID_Generator++;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) { this.id = id; }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        while (true) {
            if (!Validation.isValidSalary(salary)) {
                System.err.println("Invalid salary.");
                System.out.println("Balance must be more than or equal 5000.");
                salary = cin.nextDouble();
            }else {
                this.salary = salary;
                return;
            }
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("ID: " + getId());
        super.displayInfo();
        System.out.println("Salary: " + getSalary());
    }
   static Vector<Employee> allEmployees;
}
