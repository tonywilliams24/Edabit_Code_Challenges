package strings.CompleteTheWord;

import static strings.CompleteTheWord.Challenge.canComplete;

public class Main {
    public static void main(String[] args) {

        System.out.println(canComplete("butl", "beautiful"));

        System.out.println(canComplete("butlz", "beautiful"));

        System.out.println(canComplete("tulb", "beautiful"));

        System.out.println(canComplete("bbutl", "beautiful"));

    }
}
