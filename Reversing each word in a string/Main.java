import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
 	String[] word= s.split(" ");
  
    for(int i=0;i<((word.length));i++)
    {
    	String temp=word[i];
      	for(int j=temp.length()-1;j>=0;j--)
        {
        	System.out.print(temp.charAt(j));
        }
      	System.out.print(" ");
    }
  }
}