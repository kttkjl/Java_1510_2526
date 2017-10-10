package ca.bcit.comp2526.a1d;

/**
 * Displays given shape in Console.
 * @author Jacky
 * @version 1.0
 */
public class ConsoleDisplayer implements Displayer {

    @Override
    public void displayShape(Shape shape) {
        // TODO Auto-generated method stub
        shape.drawShape();
    }
    
}
