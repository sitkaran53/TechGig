package Pattern;

import java.io.*;
import java.util.*;

public class NumericalRectangleReverse {
	public static void main(String args[]) throws Exception {
		Scanner scn = new Scanner(System.in);
		int numberOfRow = scn.nextInt();
		scn.close();

		for (int count = numberOfRow; count >= 1; count--) {
			for (int number = 1; number <= 5; number++) {

				System.out.print(count);
				if (number < 5) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}
