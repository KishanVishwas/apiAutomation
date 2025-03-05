package javaPractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularExpressions {
    public static void main(String[] args) {
       Pattern pattern= Pattern.compile("JavaClass",Pattern.CASE_INSENSITIVE);
        Matcher matcher=pattern.matcher("hello javaClass");
        boolean matchFound = matcher.find();
        if (matchFound){
            System.out.println("found the match");
        }
        else {
            System.out.println("couldn't find the match");
        }
        System.out.println(matchFound);

    }
}
