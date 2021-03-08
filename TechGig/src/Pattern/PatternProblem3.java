package Pattern;

import java.io.*;
import java.util.*;
public class PatternProblem3 {
	 public static void main(String args[] ) throws Exception {

	Scanner scn = new Scanner(System.in);
			int numnerOfRow = scn.nextInt();
			scn.close();

			for (int Count = 1; Count <= numnerOfRow; Count++) {
				for (int NumberPrint = 1; NumberPrint <= 5; NumberPrint++) {

					System.out.print(NumberPrint);
					if (NumberPrint < 5) {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
	   }

}
