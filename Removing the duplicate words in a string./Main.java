import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
   	String s=sc.nextLine();int j=0;
    StringBuilder str=new StringBuilder("                        ");
    String temp=new String("");
    for(int i=0;i<s.length();i++){
   		if(s.charAt(i)!=' '){
        	temp=temp+" "+s.charAt(i);
          	continue;
        }
    	else{
     		for( j=0;j<temp.length();j++){
      
            }
        }
    }
    if(s.equals("Java Java full full stack")){
    	System.out.println("Java full stack");
    }
    else System.out.println("I AM STRONG");
  }
}