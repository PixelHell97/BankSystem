package BankSys;

import java.util.Vector;

public interface DataSourceInterface {
    void addClient(Client client);
    void addEmployee(Employee employee);
    void addAdmin(Admin admin);
    Vector<Client> getAllClients();
    Vector<Employee> getAllEmployees();
    Vector<Admin> getAllAdmins();
    void removeAllClients();
    void removeAllEmployees();
    void removeAllAdmins();
}
