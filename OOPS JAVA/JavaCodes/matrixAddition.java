import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.xml.sax.SAXException;

//package com.basicsstrong.arrays
public class matrixAddition{
  public static void main(String []args){
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in))throws IOException
    int[][] y = new int[2][2];
          int[][] mat1 = {{1, 2}, {4, 5}};
          int[][] mat2 = {{9, 8}, {6, 5}};
          int[][] mat3 = new int[3][3];

          for (int i = 0; i < 2; i++) {
              for (int j = 0; j < 2; j++) {
                  mat3[i][j] = mat1[i][j] + mat2[i][j];
              }
          }
          
          System.out.println("Matrix 1: ");
          for (int i = 0; i < 2; i++) {
              for (int j = 0; j < 2; j++) {
                  System.out.print(mat1[i][j] + " ");
              }
              System.out.println();
          }
          
          System.out.println("Matrix 2: ");
          for (int i = 0; i < 2; i++) {
              for (int j = 0; j < 2; j++) {
                  System.out.print(mat2[i][j] + " ");
              }
              System.out.println();
          }
          
          System.out.println("Matrix 3 (mat1 + mat2): ");
          for (int i = 0; i < 2; i++) {
              for (int j = 0; j < 2; j++) {
                  System.out.print(mat3[i][j] + " ");
              }
              System.out.println();
          }
      }
  }
