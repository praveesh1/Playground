import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
      	int n1=sc.nextInt();
      	int n2=sc.nextInt();
      	int n3=sc.nextInt();
      	calc(n1,n2,n3);
	}
  	public static void calc(int n1,int n2,int n3){
    	int big=n1;
      	if(big<n2){
        	big=n2;
        }
        if(big <n3){
        	big=n3;
        }
      	System.out.println(big);
    }
}