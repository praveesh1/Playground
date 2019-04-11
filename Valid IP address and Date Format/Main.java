import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*; 
public class Main{
	
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
      	String ip = sc.nextLine();
        String date = sc.nextLine();
        Pattern ip_pat=Pattern.compile("[0-9]{3}.[0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}");
      	Matcher ip_matcher=ip_pat.matcher(ip);
        boolean ip_found=ip_matcher.find();
         Pattern date_pat=Pattern.compile("[0-9]{2}/[0-9]{1}/[0-9]{4}");
      	Matcher date_matcher=date_pat.matcher(date);
        boolean date_found=date_matcher.find();
        System.out.println(ip+" is valid? "+ip_found);
       System.out.println("Is "+date+" a valid date format? "+date_found);
    }
}