package Pattern;
import java.io.*;
import java.util.*;
public class AscendingNumericalRightAngleTriangleReverse {
	  public static void main(String args[] ) throws Exception {

	    	Scanner scn = new Scanner(System.in);
				int numberOfRow = scn.nextInt();
				scn.close();

				int row=numberOfRow;
		        int nst=numberOfRow;  //number of stars after that replace this stars by no.
	        
		        while(row!=0){
		            for(int cst=1; cst <=nst; cst++ ){
		                System.out.print(cst);
		                if ( cst< nst) {
							System.out.print(" ");
						}
		            }

		            row--;
		            nst--;
		           System.out.println();
		 
		        }


	   }
}
