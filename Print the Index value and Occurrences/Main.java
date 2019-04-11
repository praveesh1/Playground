import java.util.*;
import java.util.regex.*;
import java.io.*;
public class Main {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String key = sc.nextLine();
       String value  = sc.nextLine();
       boolean found = false;
       Pattern p =Pattern.compile(key);
       Matcher m = p.matcher(value);
       int counter=0;
       while(m.find()){
       	counter++;
         System.out.println("found: "+counter+" : "+m.start()+" - "+m.end());
        
        found=true;
       }
       if(found){
       	System.out.println(counter);
       }
      else System.out.println("The given word is not present in the string");
    }
}