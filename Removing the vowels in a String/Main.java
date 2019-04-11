import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();int j=0;
    StringBuilder str=new StringBuilder("                 ");
    for(int i=0;i<s.length();i++){
    	char ch=s.charAt(i);
      	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
        	continue;
        }
    	else{
        	str.setCharAt(j++,ch);
        }
    }
    System.out.println(str);
  }
}