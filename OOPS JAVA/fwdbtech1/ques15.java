package b_tech_assignment1;

class Student {
    private String name;
    private int rollNo;
    
    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
    
    public String getName() {
        return name;
    }
    
    public int getRollNo() {
        return rollNo;
    }
};

public class ques15{
    
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Alice", 1);
        students[1] = new Student("Bob", 2);
        students[2] = new Student("Charlie", 3);
        
        for (int i = 0; i < students.length; i++) {
            System.out.println("Name: " + students[i].getName() + ", Roll No: " + students[i].getRollNo());
        }
    }
}

