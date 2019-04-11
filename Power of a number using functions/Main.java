import java.util.Scanner;
 class Main{
  	public static void main(String args[]){
    	Scanner sc=new Scanner(System.in);
      	int base=sc.nextInt();
      	int exp=sc.nextInt();
      	int res=comp(base,exp);
      	System.out.println(res);
   	}
   	public static int comp(int b,int e){
     int res=1;
     for(int i=1;i<=e;i++){
     	res=res*b;
     }
    	return res;
    }

}