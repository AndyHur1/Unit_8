import java.util.ArrayList;
import java.util.Arrays;
/**
 * @author Andy Hur
 * @since April 9 2020
 * @Version 1.0                              MagicSquare-Class
 *
 * Descriptions:
 *
 * MagicSquare which is Java class has one constructor and 6 methods.
 * The MagicSquare methods are in order to get sum of the rows, columns, diagonals, and to check is given 2d array is
 * a Magic square or not. In order to have a Magic square, it needs to have the same number of rows and columns.
 * Also sum of the row, column, and up and down side of the diagonals must have the same.
 *
 *

 *
 */

public class MagicSquare {
    private int[][] grid;

    public MagicSquare(int[][] g) {

        grid = g;
    }

    /**
     *                                                rowSum
     *
     * THe rowSum method is to find the total sum of the row that is specified. In order to do this, I need a parameter
     * called "row" that will tell which row of the sum that I am need to look for.
     *
     *
     * @return This method will return the sum of numbers in specific row.
     */

    public int rowSum(int row) {
        // <<< Complete the code >>>
        int total=0; //Create a empty int variable to store the sum of specific row of the numbers
        for(int col=0; col<grid[row].length;col++)
        { //it will go through all the column in a given row.
            total+=grid[row][col];
        }
        return total; //This will return sum of the specific row.

    }
    /**
     *                                                  colSum
     *
     *The colSum method also need a parameter called col which is column. It will determine which total sum of specific
     * column that we are looking for. All numbers in column that is specified by col will be added to a variable called
     * total and return that value to us.
     *
     *
     * @param col the col is a parameter that will determine which column of sum that I am looking for.
     *
     * @return It will return the sum of numbers in column that is specified by the given parameter which is col.
     */


    public int colSum(int col) {
        // <<< Complete the code >>>
        int total=0;
        for(int row=0; row<grid.length;row++) // This will go through all row in a given column.
        {
            total+=grid[row][col];
        }
        return total; //This will return the sum of specific column

    }

    /**                                             upDiagSum
     *
     * The upDiagSum method will find the value that are going upwards in the 2d array square and adds all those to find
     * sum of it and then it will return the variable which is called total.
     *
     * @return this method will return the sum of numbers in a diagonal that is going upwards.
     */


    public int upDiagSum() {
        // <<< Complete the code >>>
        int total = 0;
        for (int row = 0; row < grid.length; row++)
        {
            int col = grid.length - row - 1;
            total += grid[row][col];
        }
        return total;
    }
    /**
     *                                              downDiagSum
     *
     * The downDiagSum method will find the value that are going downwards in the 2d array square and adds all those to find
     *  sum of it and then it will return the variable which is called total
     *
     * @return this method will return the sum of numbers in a diagonal that is going downwards.
     */


    public int downDiagSum() {
        // <<< Complete the code >>>
        int total=0;
        for (int row = 0; row < grid.length; row++)
        {
            total += grid[row][row];
        }
        return total;
    }
    /**
     *                                                  IsMagicSquare
     *
     * The IsMagicSquare method determines whether a given 2D array satisfies a criteria point of "Magic Square".
     * A "Magic Square" is  an arrangement of number in a square, which is there sum of row, column, and diagonals are
     * equal with each other. Also, there must be the same number of rows and columns. By checking this conditions, it
     * will go over a given 2d array satisfies these conditions and return true or false depends on result.
     *
     *
     * @return This will return true if given array is MagicSquare and false if it is not.
     */


    public boolean isMagicSquare() {
        // <<< Complete the code >>>
        int tested_Value = upDiagSum(); //I made new variable call tested_Value that is equal to upDiagsum,
        //So I can compare upDiagsum with sum of row, column and diagonals.

        ArrayList<Integer> Total_Array= new ArrayList<>(Arrays.asList(downDiagSum())); /*This will store the
       sum of row, column, and diagonal.*/

        for(int row=0;row<grid.length;row++)
        {
            Total_Array.add(rowSum(row));
        }

        for(int column=0;column<grid.length;column++)
        {
            Total_Array.add(colSum(column));
        }

        for(int review:Total_Array) { //This will go over the the Total_Array.
            if(tested_Value!=review) { //It will return false if tested_Value is not equal the review variable.
                return false;
            }
        }
        return true; //This will return true if tested_Variable is equal to the values of the Total_Array.
    }


    /**
     * This method is complete. You do not need to provide additional
     * comments here.
     */
    public void printGrid() {
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                System.out.print(grid[row][col] + "\t");
            }
            System.out.println("");
        }
    }
}

