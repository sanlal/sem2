import java.util.Scanner;

public class convertionToJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String cppCode = "";
        String line;
        int num = 9;
        while (num >= 0) {
            line = input.nextLine();
            cppCode += line + "\n";
            num--;
        }

        cppCode = cppCode.replaceAll("int main\\(\\)", "public static void main(String[] args)");

        cppCode = cppCode.replaceAll("cin >> (\\w+)", "$1 = input.nextLine().trim()");

        cppCode = cppCode.replaceAll("cout << (.*)", "System.out.println($1)");

        cppCode = cppCode.replaceAll("string (\\w+)", "String $1");

        cppCode = cppCode.replaceAll("char (\\w+)\\[.*\\]", "String $1");

        cppCode = cppCode.replaceAll("int (\\w+)\\[.*\\]", "int[] $1");

        cppCode = "public class ConvertedCode {\n" + cppCode + "}\n";
        System.out.print(cppCode);
    }
}
