package Pattern;

import java.io.*;
import java.util.*;

public class NumericalRightAngleTriangle {
	public static void main(String args[]) throws Exception {

		Scanner scn = new Scanner(System.in);
		int numberOfRow = scn.nextInt();
		scn.close();

		int row = 1;
		int numberOfStars = 1;
		while (row <= numberOfRow) {
			for (int count = 1; count <= numberOfStars; count++) {
				System.out.print(row);
				if (count < numberOfStars) {
					System.out.print(" ");
				}
			}

			row++;
			numberOfStars++;
			System.out.println();

		}

	}
}
