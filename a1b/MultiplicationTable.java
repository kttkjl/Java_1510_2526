package ca.bcit.comp2526.a1b;

/**
 * Multiplication Table.
 * @author Jacky
 * @version 1
 */
public class MultiplicationTable {
     //The starting digit of table.
    private int begin;

     //The ending digit of table.
    private int end;
    
    //The diff between begin and end.
    private int diff;
    
    //2D array for the Arithmetic Table.
    private float[][] constructedMatrix;
    
    /**
     * Constructor that accepts lower and upper bounds.
     * @param start     starting digit.
     * @param finish    ending digit.
     */
    public MultiplicationTable(int start, int finish) {
        this.begin = start;
        this.end = finish;
        // difference between start and finish
        this.diff = this.end - this.begin + 1;
        // Size is the same as the difference between start and end values
        this.constructedMatrix = new float[diff][diff];
        this.createTable();
    }
    
    /**
     * Fills constructedMatrix with answers.
     */
    private void createTable() {
         // Row loop
        for (int i = 0; i < diff; i++) {
            // Column loop
            for (int j = 0; j < diff; j++) {
                this.constructedMatrix[i][j] = (this.begin + i) 
                        * (this.begin + j);
            }
        }
    }
    
    /**
     * Prints the MultiplicationTable to console.
     */
    public void display() {
        // Prints the first legend row
        System.out.print("    *");
        // Proceed to print out all numbers in first legend row
        for (int i = this.begin; i <= this.end; i++) {
            System.out.printf("%5s", i);
        }
        System.out.printf("\n");

        // Builds dividing line string for however long this matrix is
        int arrLength = this.constructedMatrix[0].length;
        StringBuilder sb = new StringBuilder("     ");
        for (int i = 0; i < arrLength; i++) {
            sb.append("-----");
        }
        System.out.println(sb);

        // Sets up inner counter starting from start point
        int counter = this.begin;
        // for loop prints all the individual rows
        for (float[] row : constructedMatrix) {
            // Prints the vertical legend
            System.out.printf("%3d |", counter);

            // for loop prints all the numbers in each individual row
            for (float number : row) {
                System.out.printf("%5d", (int) number);
            }
            System.out.println();
            counter++;
        }
    }
}
