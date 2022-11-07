package medium.isvalidsudoku;

public class Solution {
    private static final int GRID_SIZE = 9;

    public static void main(String[] args){
        char[][] testBoard = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'}, {'6', '.', '.', '1', '9', '5', '.', '.', '.'}, {'.', '9', '8', '.', '.', '.', '.', '6', '.'}, {'8', '.', '.', '.', '6', '.', '.', '.', '3'}, {'4', '.', '.', '8', '.', '3', '.', '.', '1'}, {'7', '.', '.', '.', '2', '.', '.', '.', '6'}, {'.', '6', '.', '.', '.', '.', '2', '8', '.'}, {'.', '.', '.', '4', '1', '9', '.', '.', '5'}, {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        long startTime = System.nanoTime();
        System.out.println(isValidSudoku(testBoard));
        long endTime = System.nanoTime();

        long duration = (endTime - startTime) / 1000000;

        System.out.println("Duration: " + duration + "ms");
    }

    public static boolean isValidSudoku(char[][] board) {
        for (int row = 0; row < GRID_SIZE; row++){
            for (int col = 0; col < GRID_SIZE; col++){
                if (!isNumberPlacementValid(board, board[row][col], row, col)){
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isNumberPlacementValid(char[][] board, char number, int row, int col) {
        return !isNumberExistInRow(board, number, row, col) &&
               !isNumberExistInColumn(board, number, row, col) &&
               !isNumberExistInBox(board, number, row, col);
    }

    private static boolean isNumberExistInBox(char[][] board, char number, int row, int col) {
        if (number == '.') return false;
        int localStartingRow = row - row % 3;
        int localStartingColumn = col - col % 3;
        for (int _row = localStartingRow; _row < localStartingRow + 3; _row++) {
            for (int _col = localStartingColumn; _col < localStartingColumn + 3; _col++) {
                if (_row == row && _col == col) continue;
                if (board[_row][_col] == number) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isNumberExistInRow(char[][] board, char number, int row, int col) {
        if (number == '.') return false;
        for (int i = 0; i < GRID_SIZE; i++) {
            if (i == col) continue;
            if (board[row][i] == number) {
                return true;
            }
        }
        return false;
    }

    private static boolean isNumberExistInColumn(char[][] board, char number, int row, int col) {
        if (number == '.') return false;
        for (int i = 0; i < GRID_SIZE; i++) {
            if (i == row) continue;
            if (board[i][col] == number) {
                return true;
            }
        }
        return false;
    }

}
