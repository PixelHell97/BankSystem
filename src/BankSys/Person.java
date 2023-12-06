package BankSys;

import java.util.Scanner;


public class Person {
    protected String name, password;
    Scanner cin = new Scanner(System.in);

    public Person() {
        name = " ";
        password = " ";
    }
    public Person(String name, String password) {;
        setName(name);
        setPassword(password);
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        while (true) {
            if (!Validation.isValidName(name)) {
                System.err.println("Invalid name.");
                System.out.println("Please make sure the name is all alphabetic," +
                        " and it size between 5 to 20.");
                name = cin.nextLine();
            }else {
                this.name = name;
                return;
            }
        }
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        while (true) {
            if (!Validation.isValidPasswordSize(password)) {
                System.err.println("Invalid password.");
                System.out.println("Please make sure the password size between 8 to 20.");
                password = cin.nextLine();
            }else {
                this.password = password;
                return;
            }
        }
    }

    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Password: " + getPassword());
    }
}
