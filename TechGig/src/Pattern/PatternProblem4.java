package Pattern;

import java.io.*;
import java.util.*;
public class PatternProblem4 {
	 public static void main(String args[] ) throws Exception {

	    	Scanner scn = new Scanner(System.in);
			int numberOfRow = scn.nextInt();
			scn.close();

			for (int count = 1; count <= numberOfRow; count++) {
				for (int letter = 1; letter <= 5; letter++) {

					System.out.print((char)(count+64));
					if (letter < 5) {
						System.out.print(" ");
					}
				}
				System.out.println();
			}

	   }
}
