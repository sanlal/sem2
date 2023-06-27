package b_tech_assignment1;


class OverloadingDemo {
    
    // Constructor overloading
    public OverloadingDemo() {
        System.out.println("Default constructor called");
    }
    
    public OverloadingDemo(int num) {
        System.out.println("Constructor with integer parameter called: " + num);
    }
    
    public OverloadingDemo(String str) {
        System.out.println("Constructor with string parameter called: " + str);
    }
    
    // Method overloading
    public void print() {
        System.out.println("No argument method called");
    }
    
    public void print(int num) {
        System.out.println("Method with integer argument called: " + num);
    }
    
    public void print(String str) {
        System.out.println("Method with string argument called: " + str);
    }
    
    
}



public class ques16 {
    public static void main(String[] args) {
        OverloadingDemo obj1 = new OverloadingDemo();
        OverloadingDemo obj2 = new OverloadingDemo(10);
        OverloadingDemo obj3 = new OverloadingDemo("hello");
        
        obj1.print();
        obj2.print(20);
        obj3.print("world");
    }
}
