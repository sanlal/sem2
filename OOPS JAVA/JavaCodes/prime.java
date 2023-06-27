import java.util.Scanner;

public class prime{
  public static void main(String[]args){
    try (Scanner s = new Scanner(System.in)) {
      System.out.print("Enter number: ");
      int n= s.nextInt();
      int flag=0;
      for(int i=2;i<n/2;i++){
      if(n%i==0){
        flag=1;
        //System.out.print("Not ");
        break;
      }
      }

      if(flag==1){
        System.out.print(" Not Prime");

      }
      else
      {
        System.out.print("Prime");
      }
    }
  }
}
