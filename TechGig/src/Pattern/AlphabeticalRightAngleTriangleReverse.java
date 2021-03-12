package Pattern;

import java.io.*;
import java.util.*;

public class AlphabeticalRightAngleTriangleReverse {
	public static void main(String args[]) throws Exception {
		Scanner scn = new Scanner(System.in);
		int numberOfRow = scn.nextInt();
		scn.close();

		int row = numberOfRow;
		int nst = numberOfRow;
		int x = 1;
		while (row != 0) {
			for (int cst = 1; cst <= nst; cst++) {
				System.out.print((char) (x + 64));
				if (cst < nst) {
					System.out.print(" ");
				}
			}

			row--;
			nst--;
			x++;
			System.out.println();

		}

	}
}
