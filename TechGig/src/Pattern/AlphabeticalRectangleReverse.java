package Pattern;

import java.io.*;
import java.util.*;

public class AlphabeticalRectangleReverse {
	public static void main(String args[]) throws Exception {

		// Write code here
		Scanner scn = new Scanner(System.in);
		int numberOfRow = scn.nextInt();
		scn.close();

		for (int count= numberOfRow; count >= 1; count--) {
			for (int letter = 1; letter <= 5; letter++) {

				System.out.print((char) (count + 64));
				if (letter < 5) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}
