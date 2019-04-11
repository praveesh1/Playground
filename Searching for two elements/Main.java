import java.util.Scanner;
class Main{
    public static void main(String args[]){
       
      	Scanner sc=new Scanner(System.in);
      	int arr[]=new int[5];int n=sc.nextInt();
       	for(int i=0;i<5;i++){
        	arr[i]=sc.nextInt();
        }
      	int n1=sc.nextInt();
      	int n2=sc.nextInt();
      	int i1=-1,i2=-1;
      	for(int i=0;i<5;i++){
        	if(n1==arr[i]){
            	i1=i;
            }
          	if(n2==arr[i]){
            	i2=i;
            }
          
        }
      	System.out.println(i1);
      	System.out.println(i2);
    }
}