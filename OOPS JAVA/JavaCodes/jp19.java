//Question 20
/*Write a program to return a value from a method
*/
//import java.lang.*;
class Demo{
      public static void main(String args[])
       {
        int res= Demo.myMethod(10);
        System.out.println("Result= "+ res);
     }
     static int myMethod(int num)
     {
        return num*num;
     }
}
