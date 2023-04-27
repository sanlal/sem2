/* Q2 Write a java method insert(), to insert an integer x into a sorted array A[] (sorted inascending order) containing N integers so that the array remains sorted after insertion. The
method takes x and array A as input and returns the index of x where it get inserted in A[].
Note: indicies starts from 0.

*/
import java.util.Arrays;

public class SortedInsert {
    
    public static void main(String[] args) {
        int a[]={1,2,3,6,7,8};
        System.out.println("Original Array: ");
        for(int i : a) {
            System.out.print(i+" ");
        }
        System.out.println();
        int v=5;
        System.out.println("Element must be added at "+findPos(a,v));
        
        int[] newArray=new int[a.length+1];
        int i=0;int j=0;
        while(a[i]<v&&i<a.length)
        {
            newArray[j++]=a[i++];
        }

        
        newArray[j++]=v;
        while(i<a.length)
        {
            newArray[j++]=a[i++];
        }
        
        
        a=Arrays.copyOf(newArray, j-1);

        System.out.println("New Array: ");
        for(int x : a) {
            System.out.print(x+" ");
        }

       
    }
    public static int findPos(int []a,int value) {
        int i=0;
        while(a[i]<value)
        {
            i++;
        }
        return i;
        
    }
 
}
