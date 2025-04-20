import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sudoku {
    private char[][] board;

    public Sudoku(String filename) throws FileNotFoundException {
        board = new char[9][9];
        Scanner scanner = new Scanner(new File(filename));
        int row = 0;
            while (scanner.hasNextLine() && row < 9) {
                String line = scanner.nextLine().trim();
                for (int col = 0; col < 9 && col < line.length(); col++) {
                    board[row][col] = line.charAt(col);
                }
                row++;
            }

    }

    public String toString() {
        return "";
    }
}
