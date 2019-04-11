import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
public class Main{
    public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
      	  String str = sc.nextLine();
      	  Pattern reg = Pattern.compile("and|or|,| ");
          String[] res= reg.split(str);
          for( String s : res)
            System.out.println(s);
    }
}