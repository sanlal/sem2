package b_tech_assignment1;

class Employee {
    private String name;
    private int age;
    private String address;

    public Employee(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
    // Copy constructor
    public Employee(Employee emp) {
        this.name = emp.name;
        this.age = emp.age;
        this.address = emp.address;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getAddress() {
        return address;
    }
    
    
}




public class ques17 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 30, "123 Main St");
        Employee emp2 = new Employee(emp1); // Copy constructor used to copy emp1 into emp2
        
        // Printing details of emp1
        System.out.println("Details of emp1:");
        System.out.println("Name: " + emp1.getName());
        System.out.println("Age: " + emp1.getAge());
        System.out.println("Address: " + emp1.getAddress());
        
        // Printing details of emp2
        System.out.println("\nDetails of emp2 (copied from emp1):");
        System.out.println("Name: " + emp2.getName());
        System.out.println("Age: " + emp2.getAge());
        System.out.println("Address: " + emp2.getAddress());
    }
}
