// //Add serializability in the backend to this code to store data in the file that what ever we enter.

import java.io.*;
import java.util.*;

class Account implements Serializable {
    private static final long serialVersionUID = 1L; // optional but recommended
    String name;
    int accountNumber;
    int balance;
    int days;

    Account(String name, int accountNumber, int balance, int days) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.days = days;
    }

    public String toString() {
        return "Name: " + name + ", Account Number: " + accountNumber + ", Balance: " + balance + ", Days: " + days;
    }
}

public class CryptocurrencyAccountDetails {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Account> accounts = new ArrayList<Account>();
        String name;
        int accountNumber;
        int balance;
        int days;

        System.out.println("Enter number of accounts:");
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Enter name:");
            name = br.readLine();

            System.out.println("Enter account number:");
            accountNumber = Integer.parseInt(br.readLine());

            System.out.println("Enter balance:");
            balance = Integer.parseInt(br.readLine());

            System.out.println("Enter days:");
            days = Integer.parseInt(br.readLine());

            Account acc = new Account(name, accountNumber, balance, days);
            accounts.add(acc);
        }

        // write accounts to a file
        FileOutputStream fileOutputStream = new FileOutputStream("accounts.dat");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(accounts);
        objectOutputStream.close();

        // read accounts from a file
        FileInputStream fileInputStream = new FileInputStream("accounts.dat");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ArrayList<Account> accountsFromFile = (ArrayList<Account>) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println("\nAccounts with more than 794 days:");
        accountsFromFile.stream().filter(acc -> acc.days > 794).forEach(System.out::println);

        System.out.println("\nAccounts with more than 3.5 years:");
        accountsFromFile.stream().filter(acc -> acc.days > 1277).forEach(System.out::println);

    }
}




















// import java.io.*;
// import java.util.*;

// class Account {
//     String name;
//     int accountNumber;
//     int balance;
//     int days;

//     Account(String name, int accountNumber, int balance, int days) {
//         this.name = name;
//         this.accountNumber = accountNumber;
//         this.balance = balance;
//         this.days = days;
//     }

//     public String toString() {
//         return "Name: " + name + ", Account Number: " + accountNumber + ", Balance: " + balance + ", Days: " + days;
//     }
// }

// public class CryptocurrencyAccountDetails {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         ArrayList<Account> accounts = new ArrayList<Account>();
//         String name;
//         int accountNumber;
//         int balance;
//         int days;

//         System.out.println("Enter number of accounts:");
//         int n = Integer.parseInt(br.readLine());

//         for (int i = 0; i < n; i++) {
//             System.out.println("Enter name:");
//             name = br.readLine();

//             System.out.println("Enter account number:");
//             accountNumber = Integer.parseInt(br.readLine());

//             System.out.println("Enter balance:");
//             balance = Integer.parseInt(br.readLine());

//             System.out.println("Enter days:");
//             days = Integer.parseInt(br.readLine());

//             Account acc = new Account(name, accountNumber, balance, days);
//             accounts.add(acc);
//         }

//         System.out.println("\nAccounts with more than 794 days:");
//         accounts.stream().filter(acc -> acc.days > 794).forEach(System.out::println);

//         System.out.println("\nAccounts with more than 3.5 years:");
//         accounts.stream().filter(acc -> acc.days > 1277).forEach(System.out::println);

//     }
// }