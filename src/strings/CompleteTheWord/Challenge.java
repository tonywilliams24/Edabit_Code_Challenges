package strings.CompleteTheWord;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge {
    public static boolean canComplete(String initial, String word) {
        Pattern initialPattern;
        Matcher wordMatcher;
        String regex = "\\w*";
        for(int i=0; i<initial.length();i++) regex = regex.concat("[" + initial.charAt(i) + "]" + "\\w*");
        initialPattern = Pattern.compile(regex);
        wordMatcher = initialPattern.matcher(word);
        return wordMatcher.find();
    }
}
