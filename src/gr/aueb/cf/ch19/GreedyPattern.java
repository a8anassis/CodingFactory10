package gr.aueb.cf.ch19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Άπληστος (Greedy)
 */
public class GreedyPattern {

    public static void main(String[] args) {
        String str = "alice;12345;bob;23456;";

        Pattern pattern = Pattern.compile(".*;");   // greedy -- longest match
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
