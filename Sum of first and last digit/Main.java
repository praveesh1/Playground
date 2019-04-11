import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
      	int n=sc.nextInt();
      	int last=n%10;
      	while(n>=100){
        	n=n/10;
        }
      	int l=0;
        while(n>0){
        	 l=n%10;
          	n=n/10;
        }
      	System.out.print(l+last);
	}
}