package Pattern;

import java.io.*;
import java.util.*;

public class AsteriskRightAngleTriangle {
	public static void main(String args[]) throws Exception {

		Scanner scn = new Scanner(System.in);
		int numberOfRow = scn.nextInt();
		
		scn.close();

		int row = 1;
		int nst = 1;  //Number of Stars
		while (row <= numberOfRow) {
			for (int cst = 1; cst <= nst; cst++) {    // count of stars
				System.out.print("*");
				if (cst < nst) {
					System.out.print(" ");
				}
			}

			row++;
			nst++;
			System.out.println();

		}

	}
}
