package b_tech_assignment1;

public class ques14 {
    private int outerVar = 10;
    
    public void outerMethod() {
        InnerClass innerObj = new InnerClass();
        innerObj.innerMethod();
    }
    
    // Inner class definition
    public class InnerClass {
        private int innerVar = 5;
        
        public void innerMethod() {
            System.out.println("Inner class method called");
            System.out.println("Inner class variable: " + innerVar);
            System.out.println("Outer class variable: " + outerVar);
        }
    }
    
    public static void main(String[] args) {
        ques14 outerObj = new ques14();
        outerObj.outerMethod();
        
        // Create an instance of the inner class and call its method
        ques14.InnerClass innerObj = outerObj.new InnerClass();
        innerObj.innerMethod();
    }
}

