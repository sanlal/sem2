// Creating a text File using FileWriter
import java.io.FileWriter;
import java.io.IOException;
class CreateFile
{
	public static void main(String[] args) throws IOException
	{
		// Accept a string
		String str = "File Handling in Java using "+
				" FileWriter and FileReader";

		// attach a file to FileWriter
		FileWriter fw=new FileWriter("Xyz.txt");

		// read character wise from string and write
		// into FileWriter
		for (int i = 0; i < str.length(); i++)
			fw.write(str.charAt(i));

		System.out.println("Writing successful");
		//close the file
		fw.close();
	}
}






/*
 ch+ch
 ((Str.CharAt(1))+4)     for encryption
 read(ch-ch +- +4)
 */



//Create data privacy using java input and output reader, writer
/*  SUBMIT BEFORE END EXAM
Create a filewriter or filereader and develop an Algorithm for Encryption and Decryption.
Note: We have to know how to make change in our data
*/

//How to create package in VSCODE
//subpackage

//1.CPP to JAVA

/* PROJECT submit before End sem
2.microsoft word. Implement individual functionality.Example italic,bold 

*/