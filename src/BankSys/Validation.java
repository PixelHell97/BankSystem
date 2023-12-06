package BankSys;

public class Validation {
    static public boolean isValidNameSize(String name) {
        return (name.length() >= 5 && name.length() <= 20);
    }
    static public boolean isValidName(String name) {
        if (isValidNameSize(name))
            return false;

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z' ||
                    name.charAt(i) >= 'a' && name.charAt(i) <= 'z') {
                if (name.charAt(i) == ' ')
                    continue;
                else
                    return true;
            }
        }
        return false;
    }
    static public boolean isValidPasswordSize(String password) {
        return (password.length() >= 8 && password.length() <= 20);
    }
    static public boolean isValidBalance(double balance) {
        return (balance >= 1500);
    }
    static public boolean isValidSalary(double salary) {
        return (salary >= 5000);
    }
}
