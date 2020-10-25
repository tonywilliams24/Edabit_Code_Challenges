package strings.WordBuckets;

import java.util.ArrayList;

public class Challenge {
    public static String[] bucketize(String phrase, int n) {
        StringBuilder phraseBuilder = new StringBuilder(phrase);
        ArrayList<String> phraseList = new ArrayList<>();
        int j;
        while(phraseBuilder.length()!= 0) {
            String tmp;
            if(phraseBuilder.length() <= n) {
                phraseList.add(phraseBuilder.toString());
                break;
            }
            else {
                j=n;
                if(phraseBuilder.charAt(0) == ' ') j++;
                tmp=phraseBuilder.substring(0,j+1);
            }
            while(j!=0 && tmp.charAt(0+j) != ' ') {
                j--;
            }
            if(j!=0) {
                phraseList.add(phraseBuilder.substring(0, j).trim());
                phraseBuilder.delete(0, j);
                if(phraseBuilder.charAt(0)==' ') phraseBuilder.deleteCharAt(0);
            }
            else if (phraseBuilder.length() == phrase.length()){
                return new String[0];
            }
            else {
                phraseList.add(phraseBuilder.toString());
                phraseBuilder.setLength(0);
            }
        }
        String[] bucket = new String[phraseList.size()];
        for(int i=0; i<bucket.length; i++) bucket[i] = phraseList.get(i);
        return bucket;
    }
}