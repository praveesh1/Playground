import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    	Scanner sc=new Scanner(System.in);
    	String s=sc.nextLine();
   		double n=0;int i=0;
    	while(i<s.length() && s.charAt(i)!='.'){
        	int temp=(int)(s.charAt(i)-48);
          	n=n*10+temp;
          	i++;
        }
    	i=i+1;
    	float n2=0;
    	while(i<s.length() ){
        	int temp=(int)(s.charAt(i)-48);
          	n2=n2*10+temp;
          	i++;
        }
    	n=n+n2/100;
    	System.out.println(String.format("%.5g",n));
  }
}