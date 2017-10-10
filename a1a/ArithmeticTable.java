package ca.bcit.comp2526.a1a;

/**
 * Arithmetic table of type addition or multiplication.
 * 
 * @author Jacky
 * @version 1
 */
public class ArithmeticTable {

     //constraints command line argument length.
    private static final int ARGSLEN = 3;
    
     //constraints start and stop input size.
    private static final int STARTSTOPCONSTRAINT = 100;
    
     //The starting digit of our table.
    private int start;

     //The ending digit of our table.
    private int end;

    /**
     * Creates a TableType enumeration type of ADD or MULT.
     * 
     * @author Jacky
     * @version 1.0
     */
    private enum TableType {
        /**
         * Variables for enum type TableType.
         * 
         * @ADD the table is an addition table.
         * @MULT the table is a multiplication.
         */
        ADD, MULT
    }

    
    //TableType. 
    private TableType tableType;

    //2D array for the Arithmetic Table.
    private float[][] constructedMatrix;
    
    /**
     * Creates a 2D array for the Arithmetic Table.
     * 
     * @param begin
     *            starting digit
     * @param finish
     *            ending digit
     * @param tt
     *            Multiplication or Addition table
     * @return
     */
    public void createTable(int begin, int finish, TableType tt) {
        this.start = begin;
        this.end = finish;
        this.tableType = tt;
        // difference between start and finish
        int diff = finish - begin + 1;

        // Size is the same as the difference between start and end values
        this.constructedMatrix = new float[diff][diff];

        // We start putting things into the 2D array
        if (tableType == TableType.ADD) {
            // Row loop
            for (int i = 0; i < diff; i++) {
                // counter starting at start
                // int count = begin;
                // Column loop
                for (int j = 0; j < diff; j++) {
                    this.constructedMatrix[i][j] = (start + i) + (start + j);
                    // count++;
                }
            }
        } else {
            // Row loop
            for (int i = 0; i < diff; i++) {
                // counter starting at start
                // int count = begin;
                // Column loop
                for (int j = 0; j < diff; j++) {
                    this.constructedMatrix[i][j] = (start + i) * (start + j);
                    // count++;
                }
            }
        }
    }

    /**
     * Prints the table created by the constructor.
     */
    public void printTable() {

        // Prints the first legend row
        if (this.tableType == TableType.ADD) {
            System.out.print("    +");
        } else {
            System.out.print("    *");
        }
        // Proceed to print out all numbers in first legend row
        for (int i = this.start; i <= this.end; i++) {
            System.out.printf("%5s", i);
        }
        System.out.printf("\n");

        // Builds dividing line string for however long this matrix is
        int arrLength = this.constructedMatrix[0].length;
        StringBuilder sb = new StringBuilder("     ");
        for (int i = 0; i < arrLength; i++) {
            sb.append("-----");
        }

        // Prints the dividing line below the legend
        System.out.println(sb);

        // Sets up inner counter starting from start point
        int counter = this.start;
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

    /**
     * parameter Checks.
     * 
     * @param args
     *            input arguments on command line.
     * @return if input is valid or not
     */
    public boolean argumentCheck(String[] args) {

        if (args.length != ARGSLEN) {
            System.err.println("Usage: Main <type> <start> <stop>");
            System.err.println("\tWhere <type> is one of +, \"*\"");
            System.err.println("\tand <start> is between 1 and 100");
            System.err.println("\tand <stop> is between 1 and 100");
            System.err.println("\tand start < stop");
            return false;
        }

        if (args[0].charAt(0) == '+') {
            tableType = TableType.ADD;
        } else {
            tableType = TableType.MULT;
        }
        int sta;
        int sto;

        try {
            sta = Integer.parseInt(args[1]);
            sto = Integer.parseInt(args[2]);
        } catch (NumberFormatException ex) {
            System.err.println("Usage: Main <type> <start> <stop>");
            System.err.println("\tWhere <type> is one of +, -, \"*\", /");
            System.err.println("\tand <start> is between 1 and 100");
            System.err.println("\tand <stop> is between 1 and 100");
            System.err.println("\tand start < stop");
            return false;
        }

        if ((sta < 1 || sta > STARTSTOPCONSTRAINT) || ((sto < 1 
                || sto > STARTSTOPCONSTRAINT)) || (sta >= sto)) {
            System.err.println("Usage: Main <type> <start> <stop>");
            System.err.println("\tWhere <type> is one of +, -, \"*\", /");
            System.err.println("\tand <start> is between 1 and 100");
            System.err.println("\tand <stop> is between 1 and 100");
            System.err.println("\tand start < stop");
            return false;
        }

        start = sta;
        end = sto;
        return true;
    }

    /**
     * The main method.
     * 
     * @param args
     *            command line arguments.
     */
    public static void main(String[] args) {
        ArithmeticTable table = new ArithmeticTable();
        if (table.argumentCheck(args)) {
            table.createTable(table.start, table.end, table.tableType);
            table.printTable();
        }
    }
}
