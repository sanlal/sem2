
/*Q3 Write a java method which takes two dimensional integer array as input 
and prints whetherthe inputted matrix is symmetric. 
Assume 2-D array is of size NxN, where N is known
constant. A matrix is said to be symmetric if it equals to its transpose .
 */
import java.io.*;
 class Symmetric {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the dimension of matrix:");
        int n=Integer.parseInt(br.readLine());
        System.out.println("Enter the values of matrix rowwise: ");
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=Integer.parseInt(br.readLine());
            }
        }
        if(sym(a,n))
        {
            System.out.println("Matrix is Symmetric!!");
        }
        else
        {
            System.out.println("Matrix is not Symmetric!!");

        }

    }
    public static boolean sym(int a[][],int n) {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i][j]!=a[j][i])
                {
                    return false;
                }
            }
        }
        return true;
    }
}
