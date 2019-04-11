import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      	int b=sc.nextInt();
      	int e=sc.nextInt();
      	int ec=1;int res=1;
      	while(ec<=e){
        	res=res*b;
          	ec++;
        }
      	System.out.println(res);
    }
}