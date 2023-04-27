/*Q5 Write a program to interchange corresponding elements of two single 
dimensional integer arrays of same size, say ‘n’. Use function to interchange
 the elements and pass arraysas a parameters to the function.
E.g.: If A[]={1,2,3,4} and B[]={5,6,7,8} then A[]={5,6,7,8} and B[]={1,2,3,4}.
 */
import java.util.Arrays;

public class ArrayInterchange {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};
        int[] B = {5, 6, 7, 8};
        interchange(A, B);
        System.out.println("My inputed string is A={1,2,3,4} \n B= {5,6,7,8} ");
        System.out.println("A: " + Arrays.toString(A));
        System.out.println("B: " + Arrays.toString(B));
    }

    public static void interchange(int[] A, int[] B) {
        for (int i = 0; i < A.length; i++) {
            int temp = A[i];
            A[i] = B[i];
            B[i] = temp;
        }
    }
}
