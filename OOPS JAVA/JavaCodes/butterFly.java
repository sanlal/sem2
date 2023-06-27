import java.util.*;
public class butterFly{
  public static void main(String []args){

    int n=9;
    for(int j=1;j<=n;j++){

      for(int k=1;k<=j;k++){
      System.out.print("*");
    }

    int spaces = 2*(n-j);
    for(int k=1;k<=spaces;k++){
      System.out.print(" ");
    }

    for(int k=5;k<=j;k++){
      System.out.print("*");
    }
    System.out.println();
    }

  for(int j=n-1  ;j>=1;j--){

    for(int k=1;k<=j;k++){
      System.out.print("*");
    }

    int spaces = 2*(n-j);
    for(int k=1;k<=spaces;k++){
      System.out.print(" ");
    }
    for(int k=5;k<=j;k++){
      System.out.print("*");
    }
    System.out.println();
   }
  }
}