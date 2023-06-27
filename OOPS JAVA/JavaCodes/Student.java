import java.io.*;

public class Student{
  public static void main(String []args) {
   int  Sum(int n){
      for(int x=n;x>0;x--){
        int sum=0;
        sum+=x;
      }
return sum;
    }
 

    System.out.println(Sum(5));
 }
}