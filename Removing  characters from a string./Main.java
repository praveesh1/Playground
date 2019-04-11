import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   	Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String p=sc.nextLine();
    StringBuilder str=new StringBuilder("                        ");
    int j=0;int found=0;
  	for(int i=0;i<s.length();i++){
    	for(int k=0;k<p.length();k++){
        	if(s.charAt(i)==p.charAt(k)){
            	found=1;
            }
        	
        }
      	if(found==0){
        	str.setCharAt(j++,s.charAt(i));
        }
    	found=0;
    }
    System.out.println(str);
  }
}