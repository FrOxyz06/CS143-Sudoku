public class ProjectTest {
    public static void main(String[] args) throws Exception {
        String expected = String.join("\n",
            "2 . . | 1 . 5 | . . 3 ",
            ". 5 4 | . . . | 7 1 . ",
            ". 1 . | 2 . 3 | . 8 . ",
            "------+-------+------",
            "6 . 2 | 8 . 7 | 3 . 4 ",
            ". . . | . . . | . . . ",
            "1 . 5 | 3 . 9 | 8 . 6 ",
            "------+-------+------",
            ". 2 . | 7 . 1 | . 6 . ",
            ". 8 1 | . . . | 2 4 . ",
            "7 . . | 4 . 2 | . . 1 ") + "\n";
        if (!expected.equals(new SudokuBoard("data1.sdk").toString()))
            throw new AssertionError("Board formatting changed");
        if (!expected.equals(new MySudokuBoard("data1.sdk").toString()))
            throw new AssertionError("Alternative board formatting changed");
        System.out.println("Both board implementations load and format the sample correctly.");
    }
}
