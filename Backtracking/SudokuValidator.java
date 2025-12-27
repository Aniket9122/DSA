package Backtracking;

public class SudokuValidator {
    public static boolean check(int[][] sudoku) {
        
        for(int row = 0; row < sudoku.length; row++){
            for(int col = 0; col < sudoku[row].length; col++){
                if(sudoku[row][col] < 1 || sudoku[row][col] > 9){
                    return false;
                }
                for(int i = row+1; i < sudoku.length; i++){
                    if(sudoku[row][col] == sudoku[i][col]){
                        return false;
                    }
                }
                for(int j = col+1; j < sudoku[row].length; j++){
                    if(sudoku[row][col] == sudoku[row][j]){
                        return false;
                    }
                }

                int p = (row)/3;
                int q = (col)/3;

                p = p * 3;
                q = q * 3;
                for(int blockRow = p; blockRow < p+3; blockRow++){
                    for(int blockCol = q; blockCol < q+3; blockCol++){
                        int count = 0;
                        if(sudoku[row][col] == sudoku[blockRow][blockCol]){
                            count++;
                            if(count>1){
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int[][] sudoku = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };

        for(int row = 0; row < sudoku.length; row++){
            for(int col = 0; col < sudoku[row].length; col++){
                System.out.print(sudoku[row][col]+",");
            }
            System.out.println("");
        }
        System.out.println("true:"+check(sudoku));


        // sudoku[0][0]++;
        // sudoku[1][1]++;
        // sudoku[0][1]--;
        // sudoku[1][0]--;   
        
        // sudoku[0][0]--;
        // sudoku[1][1]--;
        // sudoku[0][1]++;
        // sudoku[1][0]++;
        
        // sudoku[4][4] = 0;

        // System.out.println("False:"+check(sudoku));


    }
}
