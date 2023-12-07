package BankSys;

import java.io.IOException;

interface DataSourceInterface {
    void addClient(Client client) throws IOException;
    void addEmployee(Employee employee) throws IOException;
    void addAdmin(Admin admin) throws IOException;
    void getAllClients() throws IOException;
    void getAllEmployees() throws IOException;
    void getAllAdmins() throws IOException;
    void removeAllClients() throws IOException;
    void removeAllEmployees() throws IOException;
    void removeAllAdmins() throws IOException;
}
