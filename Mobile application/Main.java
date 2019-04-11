class MyModel1 {
     int mp;
  	 String lock;
  	 int dp;
  	 MyModel1(int m,String l, int d){
     	this.mp=m;
       	this.lock=l;	
       	this.dp=d;
     }
}
class MyModel2 extends MyModel1 {
    MyModel2(int m,String l,int d){
    	super(m,l,d);
    }
}
class MyModel2T extends MyModel2 {
     //write your logic here
  	 MyModel2T(int m,String l,int d){
     	super(m,l,d);
     }
}
public class Main 
{
    public static void main(String[] args) 
    {
          MyModel1 m1=new MyModel1(2,"No Lock",5);
      	  MyModel2 m2=new MyModel2(5,"Fingerprint",5);
      	  MyModel2T m3=new MyModel2T(16,"Fingerprint",6);
      	  System.out.println("Features of MyModel 1");
      	 System.out.println("Camera mega pixels: "+m1.mp);
      	System.out.println("Features of MyModel 2");
      	System.out.println("Camera mega pixels: "+m2.mp);
      	System.out.println("Lock mechanism: "+m2.lock);
        System.out.println("Display size: "+m2.dp);
      	System.out.println("Features of MyModel 2T");
      	System.out.println("Camera mega pixels: "+m3.mp);
      	System.out.println("Lock mechanism: "+m3.lock);
      	System.out.println("Display size: "+m3.dp);
    }
}