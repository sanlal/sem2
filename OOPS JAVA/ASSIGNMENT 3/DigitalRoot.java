/*7)	The digital root of an integer n is defined as the result of summing 
the digits repeatedly until only a single digit remains. 
For example, the digital root of 1729 can be calculated
using the following steps:
Step 1: 1+7+2+9 = 19
Step 2: 1+9 = 10
Step 3: 1+0 = 1
Because the total at the end of step 3 is the single digit 1,
that value is the digital root.
Write a method digitalRoot(n) that returns the digital root of its argument. 
Write the Method recursively without using any explicit loop constructs.
 */
import java.io.*;
public class DigitalRoot {
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter atleast a two digit number :");
        int n=Integer.parseInt(br.readLine());
        System.out.println(digitalRoot(n));
    }

    public static int digitalRoot(int n) {
        if (n < 10) {
            return n;
        }
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return digitalRoot(sum);
    }
}
