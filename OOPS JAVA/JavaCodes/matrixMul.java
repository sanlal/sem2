import java.io.*;
public class matrixMul {
  public static void main(String args[]) {
    // creating two matrices
    int a[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
    int b[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };

    int c[][] = new int[3][3];
    int z[][] = new int[3][3];

    // z= ((a*b)+c)-a
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        c[i][j] = 0;
        for (int k = 0; k < 3; k++) {
          c[i][j] += a[i][k] * b[k][j];

          z[i][j]= c[i][j] + c[i][j];

          z[i][j]-= a[i][j];
        }

        System.out.print(z[i][j] + " ");
      } 
      System.out.println();
    }
  }
}