import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sudoku {
    private char[][] board;

    public Sudoku(String filename) throws FileNotFoundException {
        board = new char[9][9];
        Scanner scanner = new Scanner(new File(filename));
        int r = 0;
            while (scanner.hasNextLine() && r < 9) {
                String line = scanner.nextLine();
                for (int c = 0;c < line.length(); c++) {
                    board[r][c] = line.charAt(c);
                }
                r++;
            }

    }

    public String toString() {
        return "";
    }
}
