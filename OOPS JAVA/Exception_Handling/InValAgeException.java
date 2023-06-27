class InvalidAgeException extends Exception{
    public InvalidAgeException(String errorMessage){
        super(errorMessage);
    }
}



public class InValAgeException {
    static void validateAge(int age) throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException("Age must be greater than or equal to 18");
        }
        else{
            System.out.println("Valid age!");
        }
    }
  
    public static void main(String[] args){
        try{
            int a = Integer.parseInt(args[0]);
            validateAge(a);
        }
        catch(Exception e){
            System.out.println("Caught exception: " + e);
        }
    }
}
