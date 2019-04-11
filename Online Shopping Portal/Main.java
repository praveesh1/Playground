public class Main {
	public static void main(String[] args) {
		Customers obj1=new Customers(1001,"Saakshi",9000000000l,"Bangalore","16-Jul-1990",'F',"Lakme Kajal,Salwar");
      	Customers obj2=new Customers(1008,"Rahul",9000000001l,"Chennai","27-Jan-1992",'M',"T-Shirt,Jeans");
    	Suppliers obj3=new Suppliers(7901,"ABC Traders",8000000000l,"Mumbai",10,"Paid",4.75);
      	Suppliers obj4=new Suppliers(7972,"XYZ Enterprises",8000000900l,"Kolkata",7,"Unpaid",4.35);
    	obj1.display();
      	obj2.display();
      	obj3.display();
      	obj4.display();
    	obj1.editAddress("Coimbatore");
      	obj3.editAddress("Delhi");
      	obj1.placeOrder();
      	obj3.increaseStockLevel(5);
      	obj4.increaseStockLevel(10);
    }	
}

class Users {
		private int customerId;
  		private String name;
  		private long  mobileNumber;
  		
  		Users(int c, String n,long  m){
        	this.customerId=c;
          	this.name=n;
          	this.mobileNumber=m;
        }
  		public String getName(){
        	return this.name;
        }
  		public int getId(){
        	return this.customerId;
        }
  		public long getMob(){
        	return this.mobileNumber;
        }
}

class Customers extends Users{
		private String shippingAddress;
  		private String dateOfBirth;
  		private char gender;
  		private String orderHistory;
  		
  		Customers(int id,String name,long mob,String sa,String dob,char g,String oh){
        	super(id,name,mob);
          	this.shippingAddress=sa;
          	this.dateOfBirth=dob;
          	this.gender=g;
          	this.orderHistory=oh;
        }
  		public void display(){
        	System.out.println(this.getName()+", "+this.getMob());
        }
  		public void editAddress(String addr){
        	System.out.println(this.getName()+", "+this.shippingAddress);
          	System.out.println(this.getName()+", "+addr);
        }
  		public void placeOrder(){
        	System.out.println("Order placed successfully!");
        }
}

class Suppliers extends Users {
		//write the logic for the class Suppliers
  		private String billingAddress;	
  		private int itemStock;
  		private String paymentStatus;
  		private double feedback;
  		Suppliers(int id,String n,long  mob,String ba,int i,String p,double f){
        	super(id,n,mob);
          	this.billingAddress=ba;
          	this.itemStock=i;
          	this.paymentStatus=p;
          	this.feedback=f;
        }
  		public void display(){
        	System.out.println(this.getName()+", "+this.getMob());
        }
  		
  		public void editAddress(String addr){
        	System.out.println(this.getName()+", "+this.billingAddress);
          	System.out.println(this.getName()+", "+addr);
        }
  		public void increaseStockLevel(int i){
        	this.itemStock=this.itemStock+i;
          	System.out.println(this.getName()+", "+this.itemStock);
        }
}