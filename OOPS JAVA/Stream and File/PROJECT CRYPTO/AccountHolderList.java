import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

class Employee {
    int id;
    String name;
    String designation;
    String department;
    double salary;
//constructor
    public Employee(int id, String name, String designation, String department, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.department = department;
        this.salary = salary;
    }
}

class Account {
    int accountNumber;
    String accountType;
    double balance;
//constructor
    public Account(int accountNumber, String accountType, double balance) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }
}

class AccountHolderList {
    List<Employee> employees = new ArrayList<>();
    List<Account> accounts = new ArrayList<>();

    public void openAccount(int employeeId, int accountNumber, String accountType, double balance) {
        Employee employee = null;
        for (Employee emp : employees) {
            if (emp.id == employeeId) {
                employee = emp;
                break;
            }
        }
        if (employee == null) {
            throw new IllegalArgumentException("Employee with ID " + employeeId + " does not exist.");
        }

        if (accountNumber <= 0) {
            throw new IllegalArgumentException("Invalid account number.");
        }
        for (Account acc : accounts) {
            if (acc.accountNumber == accountNumber) {
                throw new IllegalArgumentException("Account number already exists.");
            }
        }

        if (accountType.isEmpty()) {
            throw new IllegalArgumentException("Invalid account type.");
        }

        if (balance < 0) {
            throw new IllegalArgumentException("Invalid balance.");
        }

        accounts.add(new Account(accountNumber, accountType, balance));
        saveToFile(employee, accountNumber, accountType, balance);
    }

    private void saveToFile(Employee employee, int accountNumber, String accountType, double balance) {
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("accounts.txt", true)))){
            writer.println(String.format("%d,%s,%d,%s,%.2f", employee.id, employee.name, accountNumber, accountType, balance));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
