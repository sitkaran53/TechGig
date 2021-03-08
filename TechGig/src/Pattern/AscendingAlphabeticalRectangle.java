package Pattern;
import java.io.*;
import java.util.*;
public class AscendingAlphabeticalRectangle {
	 public static void main(String args[] ) throws Exception {

	        Scanner scn = new Scanner(System.in);
			int numberOfRow = scn.nextInt();
			scn.close();

			for (int count = 1; count <= numberOfRow; count++) {
				for (int Alphabetical = 1; Alphabetical <= 5; Alphabetical++) {
	                   
					System.out.print((char)(Alphabetical+64));
					if ( Alphabetical< 5) {
						System.out.print(" ");
					}
				}
				System.out.println();
			}

	   }
}
