import java.io.*;
import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;

class Account {
    private String name;
    private String address;
    private String accountNumber;
    private double balance;
    private LocalDate openingDate;

    public Account(String name, String address, String accountNumber, double balance, LocalDate openingDate) {
        this.name = name;
        this.address = address;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.openingDate = openingDate;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public LocalDate getOpeningDate() {
        return openingDate;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException();
        }
        balance -= amount;
    }

    public boolean isEligibleForLoan() {
        return ChronoUnit.DAYS.between(openingDate, LocalDate.now()) >= 794;
    }

    public boolean isEligibleForBusinessLoan() {
        return ChronoUnit.YEARS.between(openingDate, LocalDate.now()) >= 3.5;
    }
}

class LoanApplication {
    private String accountNumber;
    private double amount;
    private LocalDate applicationDate;

    public LoanApplication(String accountNumber, double amount, LocalDate applicationDate) {
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.applicationDate = applicationDate;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getApplicationDate() {
        return applicationDate;
    }
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException() {
        super("Insufficient funds");
    }
}

class NoSuchAccountException extends Exception {
    public NoSuchAccountException() {
        super("No such account");
    }
}

class IneligibleForLoanException extends Exception {
    public IneligibleForLoanException() {
        super("Not eligible for loan");
    }
}

class IneligibleForBusinessLoanException extends Exception {
    public IneligibleForBusinessLoanException() {
        super("Not eligible for business loan");
    }
}

public class CryptoAccountManager {
    private List<Account> accounts;
    private List<LoanApplication> loanApplications;

    public CryptoAccountManager() {
        accounts = new ArrayList<>();
        loanApplications = new ArrayList<>();
    }

    public void openAccount(String name, String address, String accountNumber, double balance, LocalDate openingDate) {
        Account account = new Account(name, address, accountNumber, balance, openingDate);
        accounts.add(account);
    }

    public Account getAccount(String accountNumber) throws NoSuchAccountException {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        throw new NoSuchAccountException();
    }

    public void deposit(String accountNumber, double amount) throws NoSuchAccountException {
        Account account = getAccount(accountNumber);
        account.deposit(amount);
    }

    public void withdraw(String accountNumber, double amount) throws NoSuchAccountException, InsufficientFundsException {
        Account account = getAccount(accountNumber);
        account.withdraw(amount);
    }

    public void applyForLoan(String accountNumber, double amount, LocalDate applicationDate) throws NoSuchAccountException, IneligibleForLoanException {
        
        class NoSuchAccountException extends Exception {
            public NoSuchAccountException() {
            super("No such account found");
            }
            }
            
            class IneligibleForLoanException extends Exception {
            public IneligibleForLoanException() {
            super("Not eligible for loan");
            }
            }
            
            class IneligibleForBusinessLoanException extends Exception {
            public IneligibleForBusinessLoanException() {
            super("Not eligible for business loan");
            }
            }
            
            public static void main(String[] args) {
            CryptoAccountManager manager = new CryptoAccountManager();
            // Open accounts
manager.openAccount("Alice", "123 Main St, Anytown USA", "123456", 5000, LocalDate.of(2020, 1, 1));
manager.openAccount("Bob", "456 Elm St, Anytown USA", "789012", 10000, LocalDate.of(2019, 6, 1));
manager.openAccount("Charlie", "789 Oak St, Anytown USA", "345678", 25000, LocalDate.of(2018, 3, 1));

// Make deposits
try {
    manager.deposit("123456", 1000);
    manager.deposit("789012", 2000);
    manager.deposit("345678", 5000);
} catch (NoSuchAccountException e) {
    System.out.println(e.getMessage());
}

// Make withdrawals
try {
    manager.withdraw("123456", 2000);
    manager.withdraw("789012", 5000);
    manager.withdraw("345678", 10000);
} catch (NoSuchAccountException e) {
    System.out.println(e.getMessage());
} catch (InsufficientFundsException e) {
    System.out.println(e.getMessage());
}

// Apply for loans
try {
    manager.applyForLoan("123456", 5000, LocalDate.now());
    manager.applyForLoan("789012", 10000, LocalDate.now());
    manager.applyForLoan("345678", 20000, LocalDate.now());
} catch (NoSuchAccountException e) {
    System.out.println(e.getMessage());
} catch (IneligibleForLoanException e) {
    System.out.println(e.getMessage());
}

try {
    manager.applyForBusinessLoan("123456", 10000, LocalDate.now());
    manager.applyForBusinessLoan("789012", 20000, LocalDate.now());
    manager.applyForBusinessLoan("345678", 50000, LocalDate.now());
} catch (NoSuchAccountException e) {
    System.out.println(e.getMessage());
} catch (IneligibleForBusinessLoanException e) {
    System.out.println(e.getMessage());
}
