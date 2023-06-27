package b_tech_assignment2;


public class ques4 {
    public static void main(String[] args) {
        MyClass obj = new MyClass(5);
        System.out.println("Before calling the method, obj.value = " + obj.getValue());
        modify(obj);
        System.out.println("After calling the method, obj.value = " + obj.getValue());
    }

    public static void modify(MyClass obj) {
        obj.setValue(obj.getValue() + 10);
        System.out.println("Inside the method, obj.value = " + obj.getValue());
    }
}

class MyClass {
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
