import java.util.*;

public class Student  {
   private String studentname;
   private int rollno;
   private int studentage;

   public Student(int rollno, String studentname, int studentage) {
        this.rollno = rollno;
        this.studentname = studentname;
        this.studentage = studentage;
   }

   public String getStudentname() {
        return studentname;
   }
   public void setStudentname(String studentname) {
this.studentname = studentname;
   }
   public int getRollno() {
return rollno;
   }
   public void setRollno(int rollno) {
this.rollno = rollno;
   }
   public int getStudentage() {
return studentage;
   }
   public void setStudentage(int studentage) {
 this.studentage = studentage;
   } 
}



 public class ArrayListSort {
    public static void main(String args[]) {
        
       ArrayList<Student> arraylist = new ArrayList<Student>();
    arraylist.add(new Student(111, "John", 23));
    arraylist.add(new Student(222, "Messi", 29));
    arraylist.add(new Student(333, "Ronaldo", 31));

    Collections.sort(arraylist);

    for(Student str: arraylist){
   System.out.println(str);
    }
  }
}
