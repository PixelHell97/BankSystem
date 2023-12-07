package BankSys;

import java.util.Vector;

public class Admin extends Employee{
    private int id;
    static private int ID_Generator = 1;

    public Admin() {}
    public Admin(String name, String password, double salary) {
        super(name, password, salary);
        this.id = ID_Generator;
        ID_Generator++;
    }
    static Vector<Admin> allAdmins;
}
