import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	Scanner sc=new Scanner(System.in);
      	String s=sc.nextLine();
      	String s1=sc.nextLine();
      	StringBuilder str=new StringBuilder(s);
      	str.append(str);
      	String str1=str.toString();
      	if(str1.contains(s1))
          System.out.println("Yes");
      else System.out.println("No");
    }
}