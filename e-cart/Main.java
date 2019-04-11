import java.util.Scanner;

class Item
{
  private int price;
  //create various method to return attribute value(s)
  public void set_price(int p){
  	this.price=p;
  }
  public int get_price(){
  	return this.price;
  }
  
}
   
class Customer
{
  private String product;
  private int quantity;
  //create various method to return attribute value(s)
  public void set_product(String p){
  	 this.product=p;
  }
  public void set_quantity(int q){
   	 this.quantity=q;
  }
  public String get_product(){
  	return this.product;
  }
  public int get_quantity(){
  	return this.quantity;
  }
}

class Bill
{
  private int total=0;
  public void compute(Item i, Customer c){
  		total= i.get_price() * c.get_quantity();
    	System.out.println("Total Price is : "+total); 
  }
}
class Main
{
  public static void main(String[] args)
  {
    Item i = new Item();
    Customer c = new Customer();
    Bill obj = new Bill();
    //write the logic here
    Scanner sc=new Scanner(System.in);
    String item_name=sc.nextLine();
    int unit_price=sc.nextInt();
    int quantity=sc.nextInt();
    i.set_price(unit_price);
    c.set_product(item_name);
    c.set_quantity(quantity);
    obj.compute(i ,c);
  }
}