import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
import java.util.*;
public class Main {
    // type your code here
  public static void main(String a[]){
      Scanner sc = new Scanner(System.in);
      String uname= sc.nextLine();
      String uemail= sc.nextLine();
      String  upwd = sc.nextLine();
      boolean valid_name=Pattern.matches("[a-zA-Z0-9_-]*",uname);
      boolean valid_email=Pattern.matches("[a-z0-9@_.]*",uemail);
      boolean valid_pswd=Pattern.matches("[a-zA-Z0-9@#$%]*",upwd);
      System.out.println("Is "+uname+" a valid user name? "+valid_name);
      System.out.println("Is "+uemail+" a valid email address? "+valid_email);
     System.out.println("Is "+upwd+" a valid password? "+valid_pswd);
    
    }
}