import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
      	int n=sc.nextInt();
      	sum(n);
   	}
  	public static void sum(int n){
    	int sum=0;
      	for(int i=1;i<=n;i++){
        	sum=sum+i;
        }
    	System.out.println(sum);
    }
}