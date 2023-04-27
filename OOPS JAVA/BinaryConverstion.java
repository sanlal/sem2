// Java Program to count minimum number of swap
// required to make string N to M
public class BinaryConverstion {

	// Method to count swaps
	static void minSwaps(String str1, String str2)
	{
		// Initialize the count
		int count = 0;

		// Iterate the loop with str1 length
		for (int i = 0; i < str1.length(); i++) {

			// If any non-equal elements are found
			// increment the counter
			if (str1.charAt(i) != str2.charAt(i))
				count++;
		}

		// If counter is even print the swap
		if (count % 2 == 0)
			System.out.println(count / 2);
		else
			System.out.println("Not Possible");
	}

	// Driver Code
	public static void main(String args[])
	{
		// Take two input
		String binaryString1 = "1110000";
		String binaryString2 = "0001101";

		// Call the method
		minSwaps(binaryString1, binaryString2);
	}
}
