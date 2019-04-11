import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      	int n=sc.nextInt();
      	int arr[]=new int[n];
      	boolean found=true;
      	for(int i=0;i<n;i++)
          	arr[i]=sc.nextInt();
      	int front=0,end=n-1;
      	while(front<end){
        	if(arr[front]==arr[end]){
            	found=true;
            }
          	else {
            	found=false;
              	break;
            }
          	front++;
          	end--;
        }
      	if(found){
        	System.out.println("Yes");
        }
      	else System.out.println("No");
    }
}