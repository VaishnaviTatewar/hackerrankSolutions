import java.util.*;
import java.lang.*;
import java.io.*;

class DecimalToBinary {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int testcases = sc.nextInt();
	    Queue<Integer> q;
	    int s = 1 , number , n ,l = 0 , result;
		while(testcases-- > 0 )
		{
		    number = sc.nextInt();
		    s= 1;
		    q = new LinkedList<>(); ;
		    while(number>0)
		    {
		        if(number==1)  s=1;
		        else
		        {
		            n = (int)(Math.log(number) / Math.log(2));
    		        l = (int)Math.pow(2,n);
    		        s = 1;
    		        for(int i = 0; i < n ;i++)
    		           s*=10;
		        }
    		        q.add(s);
    		        number-=l;
		    }
		    result = q.remove();
		    while(q.size() > 0)
		        result = result + q.remove();
		        
		    System.out.println(result);
		}
	}
}
