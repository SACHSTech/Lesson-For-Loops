import processing.core.PApplet;

/**
 * Entry point for ICS3U assignments using Processing graphics.
 *
 * @author Your Name
 */
public class Sketch extends PApplet {
    public static void main(String[] args) {
        PApplet.main("Sketch");
    }

    /**
     * The settings() method runs before setup().
     */
    @Override
    public void settings() {
        size(600, 600);   // Set the canvas size
    }

    /**
     * The setup() method runs _once_ at the beginning of the program.
     */
    @Override
    public void setup() {
        background(200);  // Fill the background with grey
    }

    /**
     * The draw() method _repeats_ after setup(). Use for animation or continuous drawing.
     */
    @Override
    public void draw() {
        fill(0);                      // Set fill colour to black
        ellipse(300, 300, 200, 200);  // Draw a circle at the centre
    }

    // === EXTRA METHODS BELOW (optional) ===
    // Add helper methods here, e.g. void drawCircle(int x, int y, int r) { ellipse(x, y, r, r); }

    // === END OF EXTRA METHODS ===
}
