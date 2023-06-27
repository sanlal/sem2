package b_tech_assignment1;

import java.util.ArrayList;
import java.util.Scanner;

class RailwayReservationSystem {
    private ArrayList<Passenger> passengers;
    private int capacity;
    
    public RailwayReservationSystem(int capacity) {
        this.passengers = new ArrayList<Passenger>();
        this.capacity = capacity;
    }
    
    public void bookTicket() {
        if (passengers.size() >= capacity) {
            System.out.println("Sorry, all seats are booked.");
            return;
        }
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter passenger name: ");
        String name = scanner.nextLine();
        System.out.print("Enter passenger age: ");
        int age = scanner.nextInt();
        System.out.print("Enter passenger gender (M/F): ");
        char gender = scanner.next().charAt(0);
        scanner.nextLine();
        System.out.print("Enter passenger phone number: ");
        String phoneNumber = scanner.nextLine();
        
        Passenger passenger = new Passenger(name, age, gender, phoneNumber);
        passengers.add(passenger);
        
        System.out.println("Ticket booked for passenger " + name + ".");
    }
    
    public void cancelTicket() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter passenger name: ");
        String name = scanner.nextLine();
        
        for (Passenger passenger : passengers) {
            if (passenger.getName().equals(name)) {
                passengers.remove(passenger);
                System.out.println("Ticket canceled for passenger " + name + ".");
                return;
            }
        }
        
        System.out.println("No ticket found for passenger " + name + ".");
    }
    
    public void displayChart() {
        System.out.println("Reservation chart:");
        for (Passenger passenger : passengers) {
            System.out.println(passenger.toString());
        }
    }
    
    public void searchPassenger() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter passenger phone number: ");
        String phoneNumber = scanner.nextLine();
        
        for (Passenger passenger : passengers) {
            if (passenger.getPhoneNumber().equals(phoneNumber)) {
                System.out.println("Passenger " + passenger.getName() + " found.");
                System.out.println(passenger.toString());
                return;
            }
        }
        
        System.out.println("Passenger not found with phone number " + phoneNumber + ".");
    }
    
    
}

class Passenger {
    private String name;
    private int age;
    private char gender;
    private String phoneNumber;
    
    public Passenger(String name, int age, char gender, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public char getGender() {
        return gender;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public String toString() {
        return name + ", " + age + " years, " + gender + ", Phone: " + phoneNumber;
    }
}    




public class ques18 {
    public static void main(String[] args) {
        RailwayReservationSystem system = new RailwayReservationSystem(10);
        
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("Choose an option:");
            System.out.println("1. Book ticket");
            System.out.println("2. Cancel ticket");
            System.out.println("3. Display reservation chart");
            System.out.println("4. Search passenger by phone number");
            System.out.println("0. Exit");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    system.bookTicket();
                    break;
                case 2:
                    system.cancelTicket();
                    break;
                case 3:
                    system.displayChart();
                    break;
                case 4:
                    system.searchPassenger();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
}
