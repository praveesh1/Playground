import java.util.Scanner;
class Faculty
{
  int sal=0;
  public void salary(int salary)
  {
   	this.sal=salary;
    System.out.println("Base Salary: "+ this.sal);
  }
}
class CSE
{
   int sal=0;
  public void salary(int salar)
  {
    
    this.sal=salar+3000;
    System.out.println("CSE Faculty: "+ this.sal);
  }
}
class IT
{
   int sal=0;
  public void salary(int salar)
  {
   
    this.sal=salar+5000;
    System.out.println("IT Faculty: "+ this.sal);
  }
}
class ECE
{
  int sal=0;
  public void salary(int salar)
  {
    	
    	this.sal=salar+4500;
    	System.out.println("ECE Faculty: "+ this.sal);
  }
}

class Main
{
  public static void main(String[] args)
  {
    ECE obj = new ECE();
    Faculty f=new Faculty();
    CSE c=new CSE();
    IT i=new IT();
    
  	Scanner sc=new Scanner(System.in);
    int sal=sc.nextInt();
    f.salary(sal);
    c.salary(sal);
    i.salary(sal);
    obj.salary(sal);
  }
}