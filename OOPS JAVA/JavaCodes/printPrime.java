import java.util.Scanner;
class printPrime{
  public static void main(String[]args){
    try (Scanner s = new Scanner(System.in)) {
      System.out.println("Enter a number to print sequence of prime numbers: ");
      int n = s.nextInt();

      int flag=0;
      for(int i=2;i<=n;i++){
        if(i==1){
          System.out.print(i);
        }
      }


      for(int i=2; i<=n/2;i++){
        if(n%i==0){
          flag=1;
          break;
        }
      }
      if(flag==1){
        System.out.print(0);

      }
      else{
        System.out.print(1);
      }

    }
  }
}
