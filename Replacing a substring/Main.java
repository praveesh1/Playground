import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      String pat=sc.nextLine();
      String rep=sc.nextLine();
      System.out.println(str.replace(pat,rep));
    }
}