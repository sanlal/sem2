//package com.basicsstrong.arrays
public class MultiArray{
  public static void main(String []args){

    //MULTIDIMENSTIONAL ARRAYS

    //1.adding elements to array 3D array
    int[][] qw= new int[3][];
    qw[0] = new int[3];
    qw[1] = new int[1];
    qw[2] = new int[2];

    int[][][] we = new int[2][][];
    we[0] = new int[3][];
    we[1] = new int[2][];

    we[0][0] = new int[3];
    we[0][1] = new int[1];
    we[0][2] = new int[2];

    we[1][0] = new int[3];
    we[1][1] = new int[1];
    we[1][2] = new int[2];

    we[0][0][0] = 1;
    System.out.println(we);





  }
}