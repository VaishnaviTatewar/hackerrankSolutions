import java.util.*;
import java.lang.*;
import java.io.*;

class RotateMatrix {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();
		
		 while(testcases-->0)
		 {
		     int n = sc.nextInt();
		     int mat[][] = new int[n][n];
		     for(int i=0;i<n;i++)
		     {
		         for(int j=0;j<n;j++)
		             mat[i][j] = sc.nextInt();
		     }
		     
		     for(int i=n-1;i>=0;i--)
		     {
		       for(int j=0;j<n;j++)
		           System.out.print(mat[j][i]+" ");
		     }
		      System.out.println();
		 }
	}
}
