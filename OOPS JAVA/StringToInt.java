/*Q4 4)	Write a JAVA program to extract numeric characters from a given
 string and display the integer sum of all the numeric character’s integral value.
  */
class StringToInt {
    public static void main(String[] args) {
        String s="9984";
        System.out.println(stoi(s));
    }
    public static int stoi(String s) {
        int i=0;
        int num=0;
        int sum=0;
        while(i<s.length())
        {
            char c=s.charAt(i);
            int x=(int)(c-'0');
            num=num*10+x;
            sum+=x;
            i++;
        }
        
        return sum;
        
    }
}
