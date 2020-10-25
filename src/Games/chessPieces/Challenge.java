package Games.chessPieces;

public class Challenge {

    /*
        8	♜	♞	♝	♛	♚	♝	♞	♜
        7	♟	♟	♟	♟	♟	♟	♟	♟
        6
        5
        4
        3
        2	♙	♙	♙	♙	♙	♙	♙	♙
        1	♖	♘	♗	♕	♔	♗	♘	♖
            a	b	c	d	e	f	g	h
    */
    public static boolean canMove(String piece, String current, String target) {
        System.out.print(piece + ": " + current + " to " + target + " - ");
        current = current.toLowerCase();
        target = target.toLowerCase();

        // Position Variables for readability and ease of coding
        char vCurrentPos = current.charAt(1);
        char hCurrentPos = current.charAt(0);
        char hTargetPos = target.charAt(0);
        char vTargetPos = target.charAt(1);

        // Checks to see if any positions are off the board
        if(hCurrentPos < 'a' || hCurrentPos > 'h' || vCurrentPos < '1' || vCurrentPos > '8'
            || hTargetPos < 'a' || hTargetPos > 'h' || vTargetPos < '1' || vTargetPos > '8')
                return false;

        // Variables for move in position
        int vMove = Math.abs(vCurrentPos - vTargetPos);
        int hMove = Math.abs(hCurrentPos - hTargetPos);

        // Confirms a move has taken place
        if(vMove+hMove==0) return false;

        switch (piece) {
            case "Pawn":
                // Confirms movement is only vertical and no more than 1 position (except for current positions 2 and 7, which can be 2).
                if(hMove==0 && vMove<=2 && (vCurrentPos == '2' || vCurrentPos == '7' || vMove!=2)) return true;
                return false;
            case "Knight":
                if(hMove!=0 && vMove!=0 && hMove+vMove==3) return true; // Confirms movement both horizontal and vertical, with a total position change of 3.
                return false;
            case "Bishop":
                if(hMove==vMove) return true; // Confirms the horizontal movement equals the vertical movement (diagonal movement)
                return false;
            case "Rook":
                if(hMove==0 || vMove==0) return true; // Confirms movement is only vertical or only horizontal
                return false;
            case "Queen":
                // Confirms horizontal and vertical movement are equal or movement is only horizontal or only vertical
                if(hMove==vMove || hMove==0 || vMove==0) return true;
                return false;
            case "King":
                if(hMove+vMove==1 || hMove==vMove && hMove==1) return true; // Confirms movement is only 1 position
                return false;
            default:
                throw new RuntimeException();
        }
    }
}