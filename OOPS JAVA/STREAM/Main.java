import java.util.*;

public class Main {
  public static void main(String[] args) {
    // Create a list of accounts
    List<Account> accounts = new ArrayList<Account>();

    // Add some accounts
    accounts.add(new Account("Alice", 794));
    accounts.add(new Account("Bob", 1000));
    accounts.add(new Account("Charlie", 1500));

    // Print all accounts
    for (Account account : accounts) {
      System.out.println(account);
    }

    // Filter accounts by account maintain more than 794 days
    List<Account> filteredAccounts = accounts.stream().filter(account -> account.getDays() > 794).toList();

    // Print filtered accounts
    System.out.println("Filtered Accounts:");
    for (Account account : filteredAccounts) {
      System.out.println(account);
    }

    // Filter accounts by account maintain more than 3.5 years
    List<Account> businessLoanAccounts = accounts.stream().filter(account -> account.getDays() > 1277).toList();

    // Print business loan accounts
    System.out.println("Business Loan Accounts:");
    for (Account account : businessLoanAccounts) {
      System.out.println(account);
    }
  }
}

class Account {
  private String name;
  private int days;

  public Account(String name, int days) {
    this.name = name;
    this.days = days;
  }

  public String getName() {
    return name;
  }

  public int getDays() {
    return days;
  }

  @Override
  public String toString() {
    return "Account{" +
            "name='" + name + '\'' +
            ", days=" + days +
            '}';
  }
}