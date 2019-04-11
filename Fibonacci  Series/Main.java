import java.util.*;
class Fibonacci extends Thread
{
public void run(){
  try{
  		int first=0;
        int second =1;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the limit for Fibonacci: "+n);
        
        if(n>0){System.out.print("The Fibonacci series is :");
         int cur=0;
         
         while(n>0)
         {
         	System.out.print(cur+" ");
            first=second;
            second=cur;
            cur=first+second;
            n=n-1;
         }
        }
        else throw new Exception("Exception");
  }
  catch(Exception e){
  System.out.println("Exception occurred");
  }
}
}
class Main
{
     public static void main(String[] args) 
     {
        Fibonacci f = new Fibonacci();
       f.start();
     }
}