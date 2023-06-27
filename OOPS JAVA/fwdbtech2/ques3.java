package b_tech_assignment2;

public class ques3 {
    public static void main(String[] args) {
        int x = 5;
        System.out.println("Before calling the method, x = " + x);
        modify(x);
        System.out.println("After calling the method, x = " + x);
    }

    public static void modify(int num) {
        num = num + 10;
        System.out.println("Inside the method, num = " + num);
    }
}
