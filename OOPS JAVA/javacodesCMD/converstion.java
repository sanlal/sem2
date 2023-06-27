import java.util.Scanner;

class converstion{
  public static void main(String []args){
    Scanner s= new Scanner(System.in);
    string st = s.nextLine();

if(str.indexOf("_") > -1){
        var arr = str.split("_");
        result = arr[0];
        for(let i=1; i< arr.length; i++){
            result = result + arr[i].charAt(0).toUpperCase() + arr[i].slice(1);
        }       

    }else{
        for(let i=0; i<str.length; i++){
            if(str[i] == str.charAt(i).toUpperCase()){
                result = result + "_" + str[i].toLowerCase();
            }
            else{
                result = result + str[i];
            }
        }
    }

    return result;

    
    System.out.println("");
  }
}