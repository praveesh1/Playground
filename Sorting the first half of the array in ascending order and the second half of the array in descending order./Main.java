import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int mid=n/2;
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    int temp=0;
    for(int i=0;i<mid;i++){
    	for(int j=i+1;j<mid;j++){
        	if(a[i]>a[j]){
              temp=a[i];
              a[i]=a[j];
              a[j]=temp;
            }
        }
    }
    for(int i=mid;i<n;i++){
    	for(int j=i+1;j<n;j++){
        	if(a[i]<a[j]){
              temp=a[i];
              a[i]=a[j];
              a[j]=temp;
            }
        }
    }
    for(int i=0;i<n;i++)
      System.out.print(a[i]+" ");
  }
}