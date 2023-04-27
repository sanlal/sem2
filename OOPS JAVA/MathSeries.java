//import java.io.*;
import java.util.Scanner;

public class MathSeries{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		double x= s.nextDouble();
		int n= s.nextInt();
		double y = 0;
		double fact = 1;
		double power = 1;
		 
		for(int i=1; i<=n; i++){
			fact  = fact *i;
			power = power * x * x ;
			if(i%2==0){
				y= y-(power/fact);
			}
			else{
				y= y + (power/fact);
			}
		}
		System.out.println("Y= " + y);
	}
}
