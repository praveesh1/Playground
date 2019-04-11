import java.util.*;import java.io.*;
public class Main<T> 
{ 
  private T var;
  public void set(T v){
   	this.var= v;
  }
  public T  get(){
  	return this.var;
  }
  public static void main (String[] args) throws Exception
     { 
       Main m1= new Main();
       Main m2 = new Main();
       Main m3 = new Main();
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int i = Integer.parseInt(br.readLine());
       String s = br.readLine();
       float f= Float.parseFloat(br.readLine());
       m1.set(i);m2.set(s);m3.set(f);
       System.out.println("Integer Value: "+m1.get());
       System.out.println("String Value: "+m2.get());
       System.out.println("Float value: "+m3.get());
       }
 }