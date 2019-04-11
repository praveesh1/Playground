import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
  	String s=sc.nextLine();
    String pat=sc.nextLine();
    int slen=s.length();
    int found=0;
    int count=0;int j=0;
    int plen=pat.length();
    for(int i=0;i<slen;i++){
    	for( j=0;j<plen;j++){
        	if(s.charAt(i)==pat.charAt(j)){
            	found=1;	
            }
          	else{
            	found=0;
            }
        }
      	if(found==1){
          	i=i+j-1;
        	count++;
        }
      	found=0;
    }
    System.out.println(count);
  } 
}