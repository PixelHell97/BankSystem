package BankSys;

import java.util.StringTokenizer;
import java.util.Vector;

public class Parser {
    private static Vector<String> split(String line) {
        StringTokenizer split = new StringTokenizer(line, ",");
        Vector<String> info = new Vector<>();
        while (split.hasMoreElements()) {
            info.add(split.nextToken());
        }
        return info;
    }
    public static Client parseToClient(String line) {
        Vector<String> info = split(line);
        Client client = new Client();
        client.setId(Integer.parseInt(info.get(0)));
        client.setName(info.get(1));
        client.setPassword(info.get(2));
        client.setBalance(Double.parseDouble(info.get(3)));
        return client;
    }
    public static Employee parseToEmployee(String line) {
        Vector<String> info = split(line);
        Employee employee = new Employee();
        employee.setId(Integer.parseInt(info.get(0)));
        employee.setName(info.get(1));
        employee.setPassword(info.get(2));
        employee.setSalary(Double.parseDouble(info.get(3)));
        return employee;
    }
    public static Admin parseToAdmin(String line) {
        Vector<String> info = split(line);
        Admin admin = new Admin();
        admin.setId(Integer.parseInt(info.get(0)));
        admin.setName(info.get(1));
        admin.setPassword(info.get(2));
        admin.setSalary(Double.parseDouble(info.get(3)));
        return admin;
    }
}
