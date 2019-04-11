import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      int gre=n1;
      if(gre<n2){
      	gre=n2;
      }
      if(gre<n3){
      	gre=n3;
      }
      System.out.println(gre);
    }
}