/*Jak przechowałbyś stan gry w szachy? Napisz program, który stworzy instancje tablic służące
do przechowywania stanu gry w szachy. Potrafiłbyś zachować w nim ostatni stan partii
Kasparowa z Deep Blue?*/

package pl.samouczekprogramisty.kursjava.arrays;

public class Exercise4 {
    public static void main(String[] args) {

        int pawnWhite = 11;//pionek
        int bishopWhite = 12;//goniec
        int knightWhite = 13;//kon
        int rookWhite = 14;//wierza
        int queenWhite = 15;//dama
        int kingWhite = 16;//krol

        int pawnBlack = 21;//pionek
        int bishopBlack = 22;//goniec
        int knightBlack = 23;//kon
        int rookBlack = 24;//wierza
        int queenBlack = 25;//dama
        int kingBlack = 26;//krol

        int[][] chessBoard = new int[8][8];

        chessBoard[1][0] = 21;
        chessBoard[1][1] = 21;
        chessBoard[1][6] = 11;
        chessBoard[4][1] = 26;
        chessBoard[4][2] = 21;
        chessBoard[4][5] = 13;
        chessBoard[5][1] = 23;
        chessBoard[5][4] = 14;
        chessBoard[5][6] = 11;
        chessBoard[6][3] = 14;
        chessBoard[7][1] = 16;

        for (int row = 0; row <= 7; row++) {
            for (int col = 0; col <= 7; col++) {
                System.out.print(chessBoard[row][col]);
                System.out.print("\t");
            }
            System.out.println(System.lineSeparator());

        }
    }

}