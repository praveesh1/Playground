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
    int mid=n/2;int temp=0;
    for(int i=0;i<mid;i++){
    	for(int j=i+1;j<mid;j++){
        	if(a[i]>a[j]){
            	temp=a[j];
              	a[j]=a[i];
              	a[i]=temp;
            }
        }
    }
    for(int i=0;i<n;i++)
      System.out.print(a[i]+" ");
  }
}