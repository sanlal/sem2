
class Student{
    String name;
    int roll_no;
    void setinfo(String n,int r_n){
        name = n;
        roll_no = r_n;
    }
    String getname(){
        return name;
    }
    int getroll(){
        return roll_no;
    }
}

public class ques12 {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.setinfo("Vishwas", 1);
        System.out.println(s1.getname());
        System.out.println(s1.getroll());

    }
}
