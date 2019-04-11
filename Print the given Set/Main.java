import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
      	Set<String> set=new LinkedHashSet<String>();
      	String numbers=br.readLine();
      	String[] arr=numbers.split(",");
      	for(int i=0;i<arr.length;i++)
          set.add(arr[i]);
      	System.out.println(set);
    }
}