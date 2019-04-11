import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      	int n=sc.nextInt();
      	int a[]=new int[n+1];
        for(int i=1;i<=n;i++)
          a[i]=sc.nextInt();int num=0;int found=0;
        for(int i=1;i<=n;i++){
        	for(int j=1;j<=n;j++){
            	if(i==a[j]){
                	found=1;
                }
            }
          	if(found==0){
            	System.out.print(i+" ");
            }
          
         	found=0;
        }
    }
}