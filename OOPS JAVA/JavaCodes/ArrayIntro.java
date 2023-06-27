//package com.basicsstrong.arrays
public class ArrayIntro{
  public static void main(String []args){

    //1D array
    float[] y = new float[10];
    //we must have to provide lenght for array
    System.out.println(y.getClass().getName());

    char[] ch = new char[10];
    System.out.println(ch.getClass().getName());

    String[] st = new String[10];
    System.out.println(st.getClass().getName());

    //2D array
    int[][] x = new int[10][3];
    System.out.println(x.getClass().getName());

//giving character in array index can be promoted to int
    int[] a = new int['A'];
    //byte,short,char and int

    //negative index of array
    int[] p = new int[-1];//No compile time error
    //we get run time exceeption //So we cant take negative lenght/value in array index


    /*By giving big value in index
    int[]q = new int[12324564657213]; //compile time error because it is out of range
    */
    int[]e = new int[214783648];//limit of int//memory required to store this is 214783648*4





  }
}