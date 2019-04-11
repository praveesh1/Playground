import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
      	int num=sc.nextInt();
      int c=0;	
      int n=num;
      while(num!=0){
        	num=num/10;
            c++;
        }
      num=n;int sum=0;
      while(num!=0){
      int r=num%10;
      int p=(int)java.lang.Math.pow(r,c);
        num=num/10;
        sum=sum+p;
      }
      if(sum==n) System.out.println("Armstrong Number");
      else System.out.println("Not a Armstrong Number");
      
	}
}