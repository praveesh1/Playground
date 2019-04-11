import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
      	int n=sc.nextInt();
      	calc(n);
	}
  	public static void calc(int n){
    	int turn=0;	  
      for(int i=2;i<=n;i++){
          	for(int j=2;j<i;j++){
           			if(i%j==0){
                    	turn=1;break;
                     }
              		turn=0;
            }
        	if(turn==0){
            	System.out.println(i);
       		}
        	turn=0;
       }  
   }
    
    }
