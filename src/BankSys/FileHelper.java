package BankSys;

import java.io.*;

public class FileHelper {
    private static void saveLast(String fileName, int id) throws IOException {
        BufferedWriter idCounter = new BufferedWriter(new FileWriter(fileName));
        idCounter.write(id);
        idCounter.close();
    }
    public static int getLast(String fileName) throws IOException {
        int lastId;
        BufferedReader getLastId = new BufferedReader(new FileReader(fileName));
        lastId = Integer.parseInt(getLastId.readLine());
        return lastId;
    }
    public static void saveClient(Client client) throws IOException {
        int lastId = getLast("ClientLastID.txt");
        String clientData = (lastId +1) + "," + client.getName() + "," + client.getPassword() + "," + client.getBalance();
        BufferedWriter saveToFile = new BufferedWriter(new FileWriter("AllClients.txt"));
        saveToFile.write(clientData + "\n");
        saveToFile.close();
        saveLast("ClientLastID.txt", lastId+1);
    }
    public static void saveEmployee(String fileName, String lastIdFile, Employee employee) throws IOException {
        int lastId = getLast(lastIdFile);
        String employeeData = (lastId +1) + "," + employee.getName() + "," + employee.getPassword() + "," + employee.getSalary();
        BufferedWriter saveToFile = new BufferedWriter(new FileWriter(fileName));
        saveToFile.write(employeeData + "\n");
        saveToFile.close();
        saveLast(lastIdFile, lastId+1);
    }
    public static void getClients() throws IOException {
        String line;
        BufferedReader getAllClients = new BufferedReader(new FileReader("AllClients.txt"));
        while ((line = getAllClients.readLine()) != null) {
            Client client = Parser.parseToClient(line);
            Client.allClients.add(client);
        }
        getAllClients.close();
    }
    public static void getEmployees() throws IOException {
        String line;
        BufferedReader getAllEmployees = new BufferedReader(new FileReader("AllEmployees.txt"));
        while ((line = getAllEmployees.readLine()) != null) {
            Employee employee = Parser.parseToEmployee(line);
            Employee.allEmployees.add(employee);
        }
        getAllEmployees.close();
    }
    public static void getAdmins() throws IOException {
        String line;
        BufferedReader getAllAdmins = new BufferedReader(new FileReader("AllAdmins.txt"));
        while ((line = getAllAdmins.readLine()) != null) {
            Admin admin = Parser.parseToAdmin(line);
            Admin.allAdmins.add(admin);
        }
        getAllAdmins.close();
    }
    public static void clearFile(String fileName, String lastIdFile) throws IOException{
        BufferedWriter clearFiles = new BufferedWriter(new FileWriter(fileName));
        clearFiles.close();
        BufferedWriter clearIDFile = new BufferedWriter(new FileWriter(lastIdFile));
        clearIDFile.write(0);
        clearIDFile.close();
    }
}
