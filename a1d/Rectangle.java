package ca.bcit.comp2526.a1d;

/**
 * The rectangle class shape.
 * @author Jacky
 * @version 1.0
 */
public class Rectangle extends Shape {
    /**
     * Constructor for a Rectangle Shape.
     * @param w width.
     * @param h height.
     * @throws BadWidthException 
     */
    public Rectangle(int w, int h) {
        super(w, h, "r");
        super.initMadeShape(new String[h][w]);
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                super.setMadeShape(i, j, "*");
            }
        }
    }
}
