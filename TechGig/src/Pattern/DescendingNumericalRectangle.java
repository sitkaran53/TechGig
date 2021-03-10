package Pattern;
import java.io.*;
import java.util.*;
public class DescendingNumericalRectangle {
	 public static void main(String args[] ) throws Exception {

	    	
	        Scanner scn = new Scanner(System.in);
			int numberOfRow = scn.nextInt();
			scn.close();

			for (int count = 1; count <= numberOfRow; count++) {
				for (int nnumber = 5; nnumber>=1; nnumber--) {
	                   
					System.out.print(nnumber);
					if ( nnumber >1) {
						System.out.print(" ");
					}
				}
				System.out.println();
			}

	   }
}
