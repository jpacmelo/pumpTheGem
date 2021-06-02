package org.academiadecodigo.bootcamp.testinhos;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class SmoothOOPerator {

    private Picture picture;

    public SmoothOOPerator() {
        picture = new Picture(Background.PADDING, Background.PADDING, "smoothooperator.png");
        picture.draw();
    }

    public void moveRight() {
        picture.translate(10, 0);
    }
}
