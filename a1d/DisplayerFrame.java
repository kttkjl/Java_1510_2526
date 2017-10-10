package ca.bcit.comp2526.a1d;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 * Displays a JFrame representation of a shape.
 * @author Jacky
 * @version 1.0
 */
public class DisplayerFrame extends JFrame {
    
    /**
     * Compiler was complaining.
     */
    private static final long serialVersionUID = -3032816108972948389L;
    /**
     * Fills in a JFrame with JButtons and JPanels of a given shape.
     * @param shape .
     */
    public void init(final Shape shape) {
        String[][] drawnShape = shape.getMadeShape();
        int h = shape.getHeight();
        int w = shape.getWidth();
        // code to create a gridlayout with buttons that will display the shape
        setLayout(new GridLayout(w, h));
        for (String[] rows : drawnShape) {
            for (String s : rows) {
                if (!" ".equals(s)) {
                    add(new JButton("HUE"));
                } else {
                    add(new JLabel());
                }
            }
        }
    }
}
