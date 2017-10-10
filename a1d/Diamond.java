package ca.bcit.comp2526.a1d;

/**
 * Diamond Shape.
 * @author Jacky
 * @version 1.0
 */
public class Diamond extends Shape {
    
    /**
     * Constructs the Diamond shape.
     * @param w width.
     * @param h height.
     * @throws BadWidthException 
     */
    public Diamond(int w, int h) throws BadWidthException {
        super(w, h, "d");
        if (w % 2 == 0) {
            throw new BadWidthException("WIDTH ISN'T ODD.");
        }
        super.initMadeShape(new String[w][w]);
        for (int i = 0; i < w / 2 + 1; i++) {
            for (int j = 0; j < w; j++) {
                if (j < w / 2 - i || j > w / 2 + i) {
                    super.setMadeShape(i, j, " ");
                    super.setMadeShape(w - i - 1, j, " ");
                } else {
                    super.setMadeShape(i, j, "#");
                    super.setMadeShape(w - i - 1, j, "#");
                }
            }
        }
    }
    
}
