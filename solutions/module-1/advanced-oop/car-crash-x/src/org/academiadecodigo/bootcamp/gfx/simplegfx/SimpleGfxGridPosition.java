package org.academiadecodigo.bootcamp.gfx.simplegfx;

import org.academiadecodigo.bootcamp.grid.GridColor;
import org.academiadecodigo.bootcamp.grid.GridDirection;
import org.academiadecodigo.bootcamp.grid.position.AbstractGridPosition;
import org.academiadecodigo.bootcamp.grid.position.GridPosition;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;


/**
 * Simple graphics position
 */
public class SimpleGfxGridPosition extends AbstractGridPosition {

    private Rectangle rectangle;
    private SimpleGfxGrid simpleGfxGrid;

    /**
     * Simple graphics position constructor
     * @param grid Simple graphics grid
     */
    public SimpleGfxGridPosition(SimpleGfxGrid grid){
        super((int) (Math.random() * grid.getCols()), (int) (Math.random() * grid.getRows()), grid);

        simpleGfxGrid = grid;

        int x = simpleGfxGrid.columnToX(getCol());
        int y = simpleGfxGrid.rowToY(getRow());

        this.rectangle = new Rectangle(x, y,simpleGfxGrid.getCellSize(),simpleGfxGrid.getCellSize());

        show();
    }

    /**
     * Simple graphics position constructor
     * @param col position column
     * @param row position row
     * @param grid Simple graphics grid
     */
    public SimpleGfxGridPosition(int col, int row, SimpleGfxGrid grid){
        super(col, row, grid);

        simpleGfxGrid = grid;

        int x = simpleGfxGrid.columnToX(col);
        int y = simpleGfxGrid.rowToY(row);

        this.rectangle = new Rectangle(x, y,simpleGfxGrid.getCellSize(),simpleGfxGrid.getCellSize());

        show();
    }

    /**
     * @see GridPosition#show()
     */
    @Override
    public void show() {
        this.rectangle.fill();
    }

    /**
     * @see GridPosition#hide()
     */
    @Override
    public void hide() {
        this.rectangle.delete();
    }

    /**
     * @see GridPosition#moveInDirection(GridDirection, int)
     */
    @Override
    public void moveInDirection(GridDirection direction, int distance) {

        // where we were before the position moved
        int initialCol = getCol();
        int initialRow = getRow();

        super.moveInDirection(direction, distance); // logic works just fine!!!!

        // how many squares we need to move in a certain direction
        int colDifference = Math.abs(initialCol - getCol());
        int rowDifference = Math.abs(initialRow - getRow());

        switch (direction) {
            case UP:
                rectangle.translate(0, -(simpleGfxGrid.getCellSize() * rowDifference));
                break;
            case DOWN:
                rectangle.translate(0, (simpleGfxGrid.getCellSize() * rowDifference));
                break;
            case LEFT:
                rectangle.translate(-(simpleGfxGrid.getCellSize() * colDifference), 0);
                break;
            case RIGHT:
                rectangle.translate((simpleGfxGrid.getCellSize() * colDifference), 0);
                break;
        }

    }

    /*
    @Override
    public void moveInDirection(GridDirection direction, int distance) {

        int initialCol = getCol();
        int initialRow = getRow();

        super.moveInDirection(direction, distance);

        int xDifference = simpleGfxGrid.columnToX(getCol()) - simpleGfxGrid.columnToX(initialCol);
        int yDifference = simpleGfxGrid.rowToY(getRow()) - simpleGfxGrid.rowToY(initialRow);

        this.rectangle.translate(xDifference, yDifference);

    }*/

    /**
     * @see AbstractGridPosition#setColor(GridColor)
     */
    @Override
    public void setColor(GridColor color) {
        this.rectangle.setColor(SimpleGfxColorMapper.getColor(color));
        super.setColor(color);
    }
}
