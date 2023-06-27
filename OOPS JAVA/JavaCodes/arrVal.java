import java.util.Scanner;

import org.xml.sax.SAXException;

//package com.basicsstrong.arrays
public class arrVal{
  public static void main(String []args){
    //Scanner s= new Scanner(System.in);
    int[][] y = new int[2][2];
          int[][] mat1 = {{1, 2}, {4, 5}};
          int[][] mat2 = {{9, 8}, {6, 5}};
          int[][] mat3 = new int[3][3];

          for (int i = 0; i < 3; i++) {
              for (int j = 0; j < 3; j++) {
                  mat3[i][j] = mat1[i][j] + mat2[i][j];
              }
          }
          
          System.out.println("Matrix 1: ");
          for (int i = 0; i < 3; i++) {
              for (int j = 0; j < 3; j++) {
                  System.out.print(mat1[i][j] + " ");
              }
              System.out.println();
          }
          
          System.out.println("Matrix 2: ");
          for (int i = 0; i < 3; i++) {
              for (int j = 0; j < 3; j++) {
                  System.out.print(mat2[i][j] + " ");
              }
              System.out.println();
          }
          
          System.out.println("Matrix 3 (mat1 + mat2): ");
          for (int i = 0; i < 3; i++) {
              for (int j = 0; j < 3; j++) {
                  System.out.print(mat3[i][j] + " ");
              }
              System.out.println();
          }
      }
  }
