public class ValidSudoku {

/************************************************************************************************************************
*
* Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
*
* Each row must contain the digits 1-9 without repetition.
* Each column must contain the digits 1-9 without repetition.
* Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
* Note:
*
* A Sudoku board (partially filled) could be valid but is not necessarily solvable.
* Only the filled cells need to be validated according to the mentioned rules.
*
*************************************************************************************************************************/



// Runtime beats 100% of Java users --> Optimized row checking
// Memory beats 86% of Java users
// NOTE: This implementation doesn't use hashing
public boolean isValidSudoku(char[][] board) {
        int sideLength = 9;

        // Advance thorugh the Sudoku board in row major order
        for (int row = 0; row < sideLength; row++) {
            int[] filledNums = new int[9]; // Pruning array
            int index = 0;
            
            for (int col = 0; col < sideLength; col++) {
                // Check same row
               if (board[row][col] != '.') { 
                   filledNums[index] = board[row][col];
                   // Only check for matches with numbers already seen in row (optimization)
                   if (index > 0) {
                        for (int i = 0; i < index; i++){
                            if (filledNums[i] == board[row][col])
                                return false;   
                        }
                    }
                    index++;

                  // Check same column
                  for (int rowB = row + 1; rowB < sideLength; rowB++) {
                    if (board[row][col] == board[rowB][col]) {
                        return false; 
                        }
                  }

                  // Check same 3x3 box
                    int boxStartVert = (row / 3) * 3;
                    int count = 0;
                    for (int i = 0; i < 3; i++) {
                        int boxStartHoriz = (col / 3) * 3;
                        for (int j = 0; j < 3; j++) {
                            if (board[boxStartVert][boxStartHoriz] == board[row][col])
                                count++;
                            boxStartHoriz++;
                        }
                        boxStartVert++;
                    }
                    if (count > 1) return false;
                } 
            }
        }
        return true;
    }

public static void main (String args[]) {
    ValidSudoku solution = new ValidSudoku();
    // Test Case 1
    char[][] board1 = {
    {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
    {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
    {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
    {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
    {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
    {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
    {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
    {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
    {'.', '.', '.', '.', '8', '.', '.', '7', '9'} 
};

    boolean bool = solution.isValidSudoku(board1);
    System.out.println("true ---> " + bool);
   
   // Test Case 2 
  char[][] board2 = {
    {'8', '3', '.', '.', '7', '.', '.', '.', '.'},
    {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
    {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
    {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
    {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
    {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
    {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
    {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
    {'.', '.', '.', '.', '8', '.', '.', '7', '9'} 
};

   bool = solution.isValidSudoku(board2);
   System.out.println("false --> " + bool);
}
}