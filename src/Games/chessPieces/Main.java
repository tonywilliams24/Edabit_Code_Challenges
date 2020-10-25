package Games.chessPieces;

import static Games.chessPieces.Challenge.*;

public class Main {
    public static void main(String[] args) {

        /*  Chess Pieces

            Create a function that takes the name of a chess piece, its position and a target position. The function
            should return true if the piece can move to the target and false if it can't.

            The possible inputs are "Pawn", "Knight", "Bishop", "Rook", "Queen" and "King".

            Examples

            canMove("Rook", "A8", "H8") ➞ true

            canMove("Bishop", "A7", "G1") ➞ true

            canMove("Queen", "C4", "D6") ➞ false

            *** Pawn Captures and Castling are not included
            *** Assume all pawn movements are forward

         */

        System.out.println(canMove("Rook", "A8", "H8"));
        System.out.println(canMove("Bishop", "A7", "G1"));
        System.out.println(canMove("Queen", "C4", "D6"));
        System.out.println(canMove("Pawn", "A5", "A6"));
        System.out.println(canMove("Pawn", "G2", "G4"));
        System.out.println(canMove("Pawn", "C6", "D7"));
        System.out.println(canMove("Knight", "F5", "E3"));
        System.out.println(canMove("Knight", "F6", "E5"));
        System.out.println(canMove("Bishop", "B4", "E7"));
        System.out.println(canMove("Bishop", "B6", "F5"));
        System.out.println(canMove("Rook", "A8", "H8"));
        System.out.println(canMove("Rook", "A8", "H7"));
        System.out.println(canMove("Queen", "A8", "H1"));
        System.out.println(canMove("Queen", "A6", "H4"));
        System.out.println(canMove("King", "C4", "D5"));
        System.out.println(canMove("King", "B7", "B5"));
    }
}



