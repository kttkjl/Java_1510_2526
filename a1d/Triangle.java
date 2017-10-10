package ca.bcit.comp2526.a1d;

/**
 * Triangle.
 * @author Jacky
 * @version 1
 */
public class Triangle extends Shape {
    
    /**
     * Constructs the Triangle Shape.
     * @param width     .
     * @param height    .
     * @throws BadWidthException 
     */
    public Triangle(int width, int height) throws BadWidthException {
        super(width, height, "t");
        if (width % 2 == 0) {
            throw new BadWidthException(" ");
        }
        super.initMadeShape(new String[width / 2 + 1][width]);
        for (int i = 0; i < width / 2 + 1; i++) {
            for (int j = 0; j < width; j++) {
                if (j < width / 2 - i || j > width / 2 + i) {
                    super.setMadeShape(i, j, " ");
                } else {
                    super.setMadeShape(i, j, "@");
                }
            }
        }
    }
    
}
