//Question 12
/*Write a program to display stars in a triangular form-- 
a single star in the first line, two stars in the second line, and so on.
*/
//import java.lang.*;
class star{
      public static void main(String args[])
       {
        int r=5;
       for(int i=1;i<=r;i++){
         for(int st=1;st<=i;st++){
            System.out.print("*");
         }
             System.out.println();
        }
       
        }
}