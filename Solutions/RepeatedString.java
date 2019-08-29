import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
     int length = s.length();
     System.out.println(length);
     int count=0;
     for(int i=0;i<length;i++)
     {
         if(s.charAt(i)=='a') count++;
     }
      Long countCharA = new Long(n/length);
      countCharA = countCharA*count ;
      Long rem1 = new Long(n%length);
      int rem =rem1.intValue();
      if(rem > 0)
      {
        for(int i =rem;i>0;i--)  
          if(s.charAt(rem-i)=='a') countCharA++; 
      }
     return countCharA; 
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
