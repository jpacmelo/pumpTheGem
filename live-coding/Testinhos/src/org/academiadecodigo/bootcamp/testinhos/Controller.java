package org.academiadecodigo.bootcamp.testinhos;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Controller implements KeyboardHandler {

    private Keyboard keyboard;
    private SmoothOOPerator smoothOOPerator;

    public Controller() {
        keyboard = new Keyboard(this);
        smoothOOPerator = new SmoothOOPerator();
    }

    public void init() {

        KeyboardEvent moveRightEvent = new KeyboardEvent();
        moveRightEvent.setKey(KeyboardEvent.KEY_RIGHT);
        moveRightEvent.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(moveRightEvent);
    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        if(keyboardEvent.getKey() == KeyboardEvent.KEY_RIGHT) {
            smoothOOPerator.moveRight();
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
