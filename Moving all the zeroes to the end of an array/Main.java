import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
      	int n=sc.nextInt();
      	int a[]=new int[n];
      	for(int i=0;i<n;i++)
          a[i]=sc.nextInt();
      	int b[]=new int[n];
      	int zc=0;
      	int j=0;
      	for(int i=0;i<n;i++){
        	if(a[i]!=0){
            	b[j]=a[i];
              	j++;
            }
          	else zc++;
        }
      	for(int i=1;i<=zc;i++){
        	b[j]=0;
          	j++;
        }
      	for(int i=0;i<n;i++){
        	System.out.print(b[i]+ " ");
        }
    }
}