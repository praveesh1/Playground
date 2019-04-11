import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n+1];
    for(int i=1;i<=n;i++){
    	a[i]=sc.nextInt();
    }
    int rot =sc.nextInt();
    int temp=0,temp1=0;
   for(int p=1;p<=rot;p++){	if(n%2==0){
      	temp=a[n-1];
    	for(int i=1;i<=(n-1)-2;i=i+2){
        	temp1=a[i];
          	a[i]=temp;
          	temp=temp1;
        }
    	a[n-1]=temp;
      	temp=a[2];
      	for(int i=n;i>2;i=i-2){
        	temp1=a[i];
          	a[i]=temp;
          	temp=temp1;
        }
		a[2]=temp;
    }
    else{
    	temp=a[n];
      	for(int i=1;i<=n-2;i=i+2){
        	temp1=a[i];
          	a[i]=temp;
          	temp=temp1;
        }
    	a[n]=temp;
      	temp=a[2];
      	for(int i=n-1;i>2;i=i-2){
        	temp1=a[i];
          	a[i]=temp;
          	temp=temp1;
        }
		a[2]=temp;
 		
     	
    }}
    for(int i=1;i<=n;i++){
    	System.out.print(a[i]+ " ");
    }
  }
}