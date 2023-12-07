package BankSys;

import java.io.IOException;

class FileManager implements DataSourceInterface {
    @Override
    public void addClient(Client client) throws IOException {
        FileHelper.saveClient(client);
    }

    @Override
    public void addEmployee(Employee employee) throws IOException {
        FileHelper.saveEmployee("AllEmployees.txt", "EmployeeLastId", employee);
    }

    @Override
    public void addAdmin(Admin admin) throws IOException {
        FileHelper.saveEmployee("AllAdmins.txt", "AdminsLastId.txt", admin);
    }

    @Override
    public void getAllClients() throws IOException {
        FileHelper.getClients();
    }

    @Override
    public void getAllEmployees() throws IOException {
        FileHelper.getEmployees();
    }

    @Override
    public void getAllAdmins() throws IOException {
        FileHelper.getAdmins();
    }

    @Override
    public void removeAllClients() throws IOException {
        FileHelper.clearFile("AllClients.txt", "ClientLastId.txt");
    }

    @Override
    public void removeAllEmployees() throws IOException {
        FileHelper.clearFile("AllEmployees.txt", "EmployeeLastId.txt");
    }

    @Override
    public void removeAllAdmins() throws IOException {
        FileHelper.clearFile("AllAdmins.txt", "AdminLastId.txt");
    }
    
}
