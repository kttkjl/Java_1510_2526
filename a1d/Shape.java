package ca.bcit.comp2526.a1d;

/**
 * Defines a shape.
 * 
 * @author Jacky Li
 * @version 1.0
 */
public class Shape {
    private int width;
    private int height;
    private ShapeType type;
    private String[][] madeShape;

    /**
     * Constructor.
     * 
     * @param width     
     * @param height       
     * @param type      
     * @throws BadWidthException 
     */
    protected Shape(final int width, final int height, final String type) {
        this.width = width;
        this.height = height;
        if (type.equals("r")) {
            this.type = ShapeType.RECTANGLE;
        }
        if (type.equals("t")) {
            this.type = ShapeType.TRIANGLE;
        }
        if (type.equals("d")) {
            this.type = ShapeType.DIAMOND;
        }
        if (type.equals("Rt")) {
            this.type = ShapeType.RTRIANGLE;
        }
        if (type.equals("s")) {
            this.type = ShapeType.SQUARE;
        }
    }

    /**
     * Gets the 2D array of a shape.
     * @return the 2D array of the madeShape.
     */
    public String[][] getMadeShape() {
        return madeShape;
    }

    /**
     * Initialize the 2D shape array.
     * @param mS the madeShape to init
     */
    public void initMadeShape(String[][] mS) {
        this.madeShape = mS;
    }
    /**
     * Modifies the 2D array which holds the shape at [x][y].
     * @param x Row.
     * @param y Column.
     * @param s String to be inserted into 2D arr.
     */
    public void setMadeShape(int x, int y, String s) {
        this.madeShape[x][y] = s;
    }

    /**
     * Draws the shape according to 2D array madeShape.
     */
    void drawShape() {
        for (String[] rows : this.madeShape) {
            for (String s : rows) {
                System.out.print(s);
            }
            System.out.println();
        }
    }
    /**
     * Gets the width of a shape.
     * @return the width of the shape.
     */
    public int getWidth() {
        return this.width;
    }
    /**
     * Gets the height of a shape.
     * @return the height of the shape.
     */
    public int getHeight() {
        return this.height;
    }
    /**
     * Gets the ShapeType of a Shape.
     * @return the ShapeType.
     */
    public ShapeType getType() {
        return this.type;
    }
}
