import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int fact=1;
        int n=num;
      	while(num!=0){
        	fact=1;
          	int r=num%10;
          	for(int i=r;i>=1;i--){
            	fact=fact*i;
            }
        	sum=sum+fact;
             num=num/10;
        }
        if(sum==n) System.out.println("Yes");
        else System.out.println("No");
	}
}