import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      	int c=sc.nextInt();
      	switch(c){
          case 1: int s=sc.nextInt();
            	  System.out.println(s*s);break;
          case 2: int l=sc.nextInt();int b=sc.nextInt();
            	  System.out.println(l*b);break;
            
          case 3: int base=sc.nextInt();int height=sc.nextInt();
            	  System.out.println((base*height)/2);break;
          case 4: int r=sc.nextInt();
            	  System.out.println(3.14*r*r);break;
        
        }
    }
}