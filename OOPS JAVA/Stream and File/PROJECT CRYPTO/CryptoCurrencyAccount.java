import java.util.Date;
//import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class CryptoCurrencyAccount {
    private int accountNumber;
    private String accountHolderName;
    private String accountType;
    private double balance;
    private Date accountOpeningDate;
    
    // Constructor
    public CryptoCurrencyAccount(int accountNumber, String accountHolderName, String accountType,
                                  double balance, Date accountOpeningDate) 
    {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.balance = balance;
        this.accountOpeningDate = accountOpeningDate;
    }
    
    // Getters and Setters
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getAccountOpeningDate() {
        return accountOpeningDate;
    }

    public void setAccountOpeningDate(Date accountOpeningDate) {
        this.accountOpeningDate = accountOpeningDate;
    }
}

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
    public boolean isEligibleForLoan() {
        return false;
    }
    public boolean isEligibleForBusinessLoan() {
        return false;
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
    }


    private Employee getEmployeeById(int id) {
        for (Employee emp : employees) {
            if (emp.id == id) {
                return emp;
            }
        }
        return null;
    }

    public void checkEligibilityForLoan(int accountNumber) throws FileNotFoundException {
        Account account = getAccountByNumber(accountNumber);
        if (account == null) {
            throw new IllegalArgumentException("Account with number " + accountNumber + " does not exist.");
        }
        if (account.isEligibleForLoan()) {
            System.out.println("Congratulations! You are eligible to apply for a loan or credit card.");
        } else {
            System.out.println("Sorry, you are not eligible to apply for a loan or credit card at this time.");
        }
    }

    // private Account getAccountByNumber(int accountNumber) {
    //     return null;
    // }


    public void checkBusinessLoanEligibility(int accountNumber) throws FileNotFoundException {
        Account account = getAccountByNumber(accountNumber);
        if (account == null) {
            throw new IllegalArgumentException("Account with number " + accountNumber + " does not exist.");
       

        }
        if (account.isEligibleForBusinessLoan()) {
            System.out.println("Congratulations! You are eligible to apply for a business loan of 10 crores.");
        } else {
            System.out.println("Sorry, you are not eligible to apply for a business loan at this time.");
        }
    }
    
    public void viewAccountDetails(int accountNumber) throws FileNotFoundException {
        Account account = getAccountByNumber(accountNumber);
        if (account == null) {
            throw new IllegalArgumentException("Account with number " + accountNumber + " does not exist.");
        }
        System.out.println("Account details:");
        System.out.println(account.toString());
    }
    
    public void closeAccount(int accountNumber) throws FileNotFoundException, IOException {
        Account account = getAccountByNumber(accountNumber);
        if (account == null) {
            throw new IllegalArgumentException("Account with number " + accountNumber + " does not exist.");
        }
        accounts.remove(account);
        saveToFile();
        System.out.println("Account with number " + accountNumber + " has been successfully closed.");
    }
    
    private Account getAccountByNumber(int accountNumber) {
        for (Account acc : accounts) {
            if (acc.accountNumber == accountNumber) {
                return acc;
            }
        }
        return null;
    }
    
    void saveToFile() throws IOException {
        try (FileOutputStream fileOut = new FileOutputStream("accounts.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(accounts);
        }
    }
    
    public void loadFromFile() throws IOException, ClassNotFoundException {
        try (FileInputStream fileIn = new FileInputStream("accounts.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            accounts = (List<Account>) in.readObject();
        }
    }
    

    // private void saveToFile(Employee employee, int accountNumber, String accountType, double balance) {
    //     try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("accounts.txt", true)))){
    //         writer.println(String.format("%d,%s,%d,%s,%.2f", employee.id, employee.name, accountNumber, accountType, balance));
    //     } catch (IOException e) {
    //         e.printStackTrace();
    //     }
    // }


    public static void main(String[] args) throws IOException {
        AccountHolderList accountHolderList = new AccountHolderList();
        try {
            accountHolderList.loadFromFile();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading accounts: " + e.getMessage());
        }

        // add employees
        accountHolderList.employees.add(new Employee(1, "John Doe", "Manager", "Sales", 50000));
        accountHolderList.employees.add(new Employee(2, "Jane Smith", "Analyst", "Marketing", 40000));

        accountHolderList.openAccount(1, 1001, "Savings", 5000, LocalDate.now().minusDays(800));
        accountHolderList.openAccount(2, 1002, "Checking", 2000, LocalDate.now().minusDays(100));

        // check eligibility for loan
        try {
            accountHolderList.checkEligibilityForLoan(1001);
            accountHolderList.checkEligibilityForLoan(1002);
        } catch (FileNotFoundException e) {
            System.out.println("Error loading account: " + e.getMessage());
        }

        // check eligibility for business loan
        try {
            accountHolderList.checkBusinessLoanEligibility(1001);
            accountHolderList.checkBusinessLoanEligibility(1002);
        } catch (FileNotFoundException e) {
            System.out.println("Error loading account: " + e.getMessage());
        }

        // view account details
        try {
            accountHolderList.viewAccountDetails(1001);
            accountHolderList.viewAccountDetails(1002);
        } catch (FileNotFoundException e) {
            System.out.println("Error loading account: " + e.getMessage());
        }
    // close accounts
    try {
        accountHolderList.closeAccount(1001);
        accountHolderList.closeAccount(1002);
    } catch (IOException e) {
        System.out.println("Error saving account: " + e.getMessage());
    }

    try {
        accountHolderList.saveToFile();
    } catch (IOException e) {
        System.out.println("Error saving accounts: " + e.getMessage());
    }
}


    private void openAccount(int i, int j, String string, int k, LocalDate minusDays) {
    }



}
    

