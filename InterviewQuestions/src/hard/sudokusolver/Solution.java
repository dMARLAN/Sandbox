package hard.sudokusolver;

public class Solution {
    private static final int GRID_SIZE = 9;
    private static int numTries = 0;

    public static void main(String[] args) {
        char[][] testBoard = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'}, {'6', '.', '.', '1', '9', '5', '.', '.', '.'}, {'.', '9', '8', '.', '.', '.', '.', '6', '.'}, {'8', '.', '.', '.', '6', '.', '.', '.', '3'}, {'4', '.', '.', '8', '.', '3', '.', '.', '1'}, {'7', '.', '.', '.', '2', '.', '.', '.', '6'}, {'.', '6', '.', '.', '.', '.', '2', '8', '.'}, {'.', '.', '.', '4', '1', '9', '.', '.', '5'}, {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        long startTime = System.nanoTime();
        solveSudoku(testBoard);
        long endTime = System.nanoTime();

        long duration = (endTime - startTime) / 1000000;

        System.out.println("Number Of Tries: " + numTries);
        System.out.println("Duration: " + duration + "ms");
    }

    public static void solveSudoku(char[][] board) {
        solveBoard(board);
    }

    @SuppressWarnings("unused")
    private static void printBoard(char[][] board) {
        for (int row = 0; row < GRID_SIZE; row++) {
            if (row % 3 == 0 && row != 0) {
                System.out.println("---+---+---");
            }
            for (int col = 0; col < GRID_SIZE; col++) {
                if (col % 3 == 0 && col != 0) {
                    System.out.print("|");
                }
                System.out.print(board[row][col]);
            }
            System.out.println();
        }
    }

    @SuppressWarnings("squid:S3776")
    private static boolean solveBoard(char[][] board) {
        for (char row = 0; row < GRID_SIZE; row++) {
            for (char col = 0; col < GRID_SIZE; col++) {
                if (board[row][col] == '.') {
                    for (int i = 1; i <= GRID_SIZE; i++) {
                        char charToTry = (char)(i+'0');
                        numTries++;
                        if (isNumberPlacementValid(board, charToTry, row, col)) {
                            board[row][col] = charToTry;
                            if (solveBoard(board)) {
                                return true;
                            } else {
                                board[row][col] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isNumberExistInRow(char[][] board, char number, int row) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[row][i] == number) {
                return true;
            }
        }
        return false;
    }

    private static boolean isNumberExistInColumn(char[][] board, char number, int col) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[i][col] == number) {
                return true;
            }
        }
        return false;
    }

    private static boolean isNumberExistInBox(char[][] board, char number, int row, int col) {
        int localStartingRow = row - row % 3;
        int localStartingColumn = col - col % 3;
        for (int _row = localStartingRow; _row < localStartingRow + 3; _row++) {
            for (int _col = localStartingColumn; _col < localStartingColumn + 3; _col++) {
                if (board[_row][_col] == number) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isNumberPlacementValid(char[][] board, char number, int row, int col) {
        return !isNumberExistInRow(board, number, row) &&
               !isNumberExistInColumn(board, number, col) &&
               !isNumberExistInBox(board, number, row, col);
    }

}
