import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    Scanner sc=new Scanner(System.in);
      	int n1=sc.nextInt();
      	int n2=sc.nextInt();
      	int n3=sc.nextInt();
      	gcd(n1,n2,n3);
	}
  	public static void gcd(int n1,int n2,int n3){
    	int min=n1;
      	if(min>n2){
        	min=n2;
        }
        if(min>n3){
        	min=n3;
        }
      	while(true){
        	if((n1%min==0)&&(n2%min==0)&&(n3%min==0)){
            	break;
            }
            else{
            	min--;
            }
        }
      	System.out.println(min);
      	
    }
}