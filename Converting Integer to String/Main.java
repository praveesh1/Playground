import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[50];int i=0;
    StringBuilder s=new StringBuilder("      ");
    if(n>=0){
    	while(n!=0){
        	int temp=n%10;
          	a[i]=temp;
          	n=n/10;
          	i++;
        }
      	int k=0;
    	for(int j=i-1;j>=0;j--){
        	char ch=(char)(a[j]+'0');
          	s.setCharAt(k++,ch);
        }
    }
    else{
      	n=n*-1;
    	while(n!=0){
        	int temp=n%10;
          	a[i]=temp;
          	n=n/10;
          	i++;
        }
      	int k=0;
      	s.setCharAt(k++,'-');
    	for(int j=i-1;j>=0;j--){
        	char ch=(char)(a[j]+'0');
          	s.setCharAt(k++,ch);
        }
    
    }
    System.out.println(s);
  }
}