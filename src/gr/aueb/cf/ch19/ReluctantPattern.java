package gr.aueb.cf.ch19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Reluctant (Non-Greedy)
 */
public class ReluctantPattern {

    public static void main(String[] args) {
        String str = "alice;12345;bob;23456;";

        Pattern pattern = Pattern.compile(".*?;");   // as little as possible - non-greedy, reluctant
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
