package Pattern;
import java.io.*;
import java.util.*;
public class NumericalRightAngleTriangleReverse {
	public static void main(String args[] ) throws Exception {

    	Scanner scn = new Scanner(System.in);
			int numberofRow = scn.nextInt();
			scn.close();

			int row=numberofRow;
	        int nst=numberofRow;
	        while(row!=0){
	            for(int cst=1; cst <=nst; cst++ ){
	                System.out.print(row);
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
