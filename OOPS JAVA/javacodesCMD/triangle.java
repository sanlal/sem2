// SIERPINSKI TRIANGLE
import java.io.*;
import java.util.*;


class triangle{
	public static void main(String args[])
	{
		try (Scanner s = new Scanner(System.in)) {
			System.out.print("Enter int value: ");
			int number = s.nextInt();

			for (int Y_Coordinate = number - 1; Y_Coordinate >= 0; Y_Coordinate--) {
				for (int i = 0; i < Y_Coordinate; i++) {
					System.out.print(" ");
				}
				for (int X_Coordinate = 0; X_Coordinate + Y_Coordinate < number; X_Coordinate++) {
					if ((X_Coordinate & Y_Coordinate) != 0)
						System.out.print(" "+ " ");
					else
						System.out.print("A ");
				}

				System.out.print("\n");
			}
		}
	}
}
