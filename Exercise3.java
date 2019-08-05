/*Jak przechowałbyś stan sudoku? Napisz program, który stworzy instancje tablicy
służących do przechowywania sudoku i uzupełnij ją przykładową planszą.*/

package pl.samouczekprogramisty.kursjava.arrays;

public class Exercise3 {
    public static void main(String[] args) {

        int[][] sudokuBoard = new int[9][9];

        sudokuBoard[0][0] = 2;
        sudokuBoard[0][3] = 6;
        sudokuBoard[0][5] = 7;
        sudokuBoard[0][6] = 5;
        sudokuBoard[1][7] = 9;
        sudokuBoard[1][8] = 6;
        sudokuBoard[2][0] = 6;
        sudokuBoard[2][2] = 7;
        sudokuBoard[2][5] = 1;
        sudokuBoard[2][6] = 3;
        sudokuBoard[3][1] = 5;
        sudokuBoard[3][3] = 7;
        sudokuBoard[3][4] = 3;
        sudokuBoard[3][5] = 2;
        sudokuBoard[4][1] = 7;
        sudokuBoard[4][7] = 2;
        sudokuBoard[5][3] = 1;
        sudokuBoard[5][4] = 8;
        sudokuBoard[5][5] = 9;
        sudokuBoard[5][7] = 7;
        sudokuBoard[6][2] = 3;
        sudokuBoard[6][3] = 5;
        sudokuBoard[6][6] = 6;
        sudokuBoard[6][8] = 4;
        sudokuBoard[7][0] = 8;
        sudokuBoard[7][1] = 4;
        sudokuBoard[8][2] = 5;
        sudokuBoard[8][3] = 2;
        sudokuBoard[8][5] = 6;
        sudokuBoard[8][8] = 8;

        for (int i = 0; i <= 8; i++) {
            for (int j = 0; j <= 8; j++) {
                System.out.print(sudokuBoard[i][j]);
                System.out.print("\t");
            }
            System.out.println(System.lineSeparator());
        }
    }
}