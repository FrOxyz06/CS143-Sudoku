# CS143 Sudoku: board loading and display

A Java coursework project that reads a Sudoku puzzle from a text file and prints a 9 by 9 board with 3 by 3 separators. This repository covers loading and display; the separate [Solver project](https://github.com/FrOxyz06/Solver) implements validation and backtracking.

## Run

Install a JDK (Java 21 is used in CI), then run from this repository's root:

```sh
javac --release 21 -d build *.java
java -cp build SudokuEngine
```

The included `data1.sdk` is the input used by `SudokuEngine`. Keep the working directory at the repository root so the relative path resolves.

## Input format

A `.sdk` file contains exactly nine lines of nine characters. Digits `1` through `9` are clues; `.` represents an empty cell. Do not add spaces between cells. The reader assumes well-formed input and does not validate Sudoku rules.

## Files

- `SudokuBoard.java`: board reader and formatted output.
- `MySudokuBoard.java`: alternate coursework implementation with the same output.
- `SudokuEngine.java`: runnable example.
- `data1.sdk`: sample puzzle corresponding to the example output.
- `ProjectTest.java`: checks both implementations against the expected board.

## Check

```sh
java -cp build ProjectTest
```

GitHub Actions compiles all Java sources and runs the check on pushes and pull requests. Dependabot checks workflow updates weekly.

## Assignment context

The exercise builds a board class, loads the starting puzzle, implements `toString()`, and prints the result from a main class. This description incorporates the assignment outline proposed in [PR #1](https://github.com/FrOxyz06/CS143-Sudoku/pull/1).
