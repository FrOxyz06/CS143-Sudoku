import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SudokuBoard {
   private char[][] board;

   public SudokuBoard(String filename) throws FileNotFoundException {
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
      StringBuilder sb = new StringBuilder();
    
      for (int r = 0; r < 9; r++) {
         if (r % 3 == 0 && r != 0) {
            sb.append("------+-------+------\n");
         }
        
         for (int c = 0; c < 9; c++) {
            if (c % 3 == 0 && c != 0) {
                sb.append("| ");
            }
            sb.append(board[r][c]);
            sb.append(' ');
         }   
         sb.append('\n');
    }
    
    return sb.toString();
}
   
}
   