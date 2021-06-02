package org.academiadecodigo.bootcamp.testinhos;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Background {

    public static final int PADDING = 10;
    private Rectangle rectangle;

    public Background() {
        rectangle = new Rectangle(PADDING, PADDING, 400, 400);
        rectangle.setColor(Color.RED);
        rectangle.fill();
    }
}
