package Pattern;

import java.io.*;
import java.util.*;
public class DescendingAlphabeticalRectangle {
	public static void main(String args[] ) throws Exception {

    	Scanner scn = new Scanner(System.in);
		int numberOfRow = scn.nextInt();
		scn.close();

		for (int count = 1; count <= numberOfRow; count++) {
			for (int letter = 5; letter >=1; letter--) {
                   
				System.out.print((char)(letter+64));
				if ( letter>1) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
   }
}
