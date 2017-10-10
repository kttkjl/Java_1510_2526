package ca.bcit.comp2526.a1d;

/**
 * .
 * @author Jacky
 * @version 1.0
 */
public class RTriangle extends Shape {

    /**
     * Creates a right-angled triangle with equal width and height.
     * @param width Given width.
     */
    protected RTriangle(int width) {
        super(width, width, "Rt");
        super.initMadeShape(new String[width][width]);
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                if (j <= i) {
                    super.setMadeShape(i, j, "M");
                } else {
                    super.setMadeShape(i, j, " ");
                }

            }
        }
    }

}
