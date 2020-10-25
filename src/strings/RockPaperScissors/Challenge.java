package strings.RockPaperScissors;

public class Challenge {

    public static String rps(String s1, String s2) {

        // variables to be returned
        String t = "TIE";
        String p1 = "Player 1 wins";
        String p2 = "Player 2 wins";

        // In case of tie
        if (s1.equals(s2)) return t;

        // Switch to determine the winner
        switch (s1) {
            case "rock":
                if(s2.equals("scissors")) return p1;
                else return p2;
            case "paper":
                if(s2.equals("rock")) return p1;
                else return p2;
            case "scissors":
                if(s2.equals("paper")) return p1;
                else return p2;
        }
        return null;
    }

}
