package Arrays_Udemy;

/*
Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
Note:

A Sudoku board (partially filled) could be valid but is not necessarily solvable.
Only the filled cells need to be validated according to the mentioned rules.

 */

import java.util.HashSet;
import java.util.Set;

public class IsValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rowSet = new HashSet[9];
        Set<Character>[] coloumnSet = new HashSet[9];
        Set<Character>[] gridSet = new HashSet[9];

        for(int i=0; i<9;i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int gridNo = (j / 3) + (i / 3) * 3;
                    boolean isPresentInRow = rowSet[i].contains(board[i][j]);
                    boolean isPresentInColumn = coloumnSet[i].contains(board[i][j]);
                    boolean isPresentInGrid = gridSet[gridNo].contains(board[i][j]);

                    if (isPresentInRow || isPresentInColumn || isPresentInGrid) {
                        return false;
                    }

                    rowSet[i].add(board[i][j]);
                    coloumnSet[i].add(board[i][j]);
                    gridSet[gridNo].add(board[i][j]);
                }
            }
        }
            return true;
    }
    public static void main(String[] args) {
        // this code usually will not asked in interview just for logic purpose
    }
}
