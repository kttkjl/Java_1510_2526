package ca.bcit.comp2526.a1d;

import javax.swing.JFrame;

/**
 * Displays a shape in a java GUI.
 * @author Jacky
 * @version 1.0
 */
public class SwingDisplayer implements Displayer {
    /**
     * Displays a shape using Swing components.
     * @param shape the input shape
     */
    public void displayTable(final Shape shape) {
        final DisplayerFrame frame;

        frame = new DisplayerFrame();
        frame.init(shape);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void displayShape(Shape shape) {
        // TODO Auto-generated method stub
        displayTable(shape);
    }
}
