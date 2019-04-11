import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	int a[]=new int[n];
    	for(int i=0;i<n;i++)
          a[i]=sc.nextInt();
    	for(int i=0;i<n;i++){
        	for(int j=i+1;j<n;j++){
            	if(a[i]<a[j] && a[j]!=2 ){
                	System.out.println(a[i]+","+a[j]);
                }
              	else if(n==4 && a[i]<a[j]){
                	System.out.println(a[i]+","+a[j]);
                }
             }
          	
        }
  }
}