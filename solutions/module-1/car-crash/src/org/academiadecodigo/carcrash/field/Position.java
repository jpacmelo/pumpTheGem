package org.academiadecodigo.carcrash.field;

public class Position {

    private int row;
    private int col;

    public Position() {
        row = (int) (Math.random() * Field.getHeight());
        col = (int) (Math.random() * Field.getWidth());
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    private void moveDown() {
        if (this.row + 1 < Field.getHeight()) {
            this.row++;
        } else {
            this.row = Field.getHeight() - 1;
        }
    }

    private void moveUp() {
        if (this.row - 1 > 0) {
            this.row--;
        } else {
            this.row = 0;
        }
    }

    private void moveLeft() {
        if (this.col - 1 > 0) {
            this.col--;
        } else {
            this.col = 0;
        }
    }

    private void moveRight() {

        if (this.col + 1 < Field.getWidth()) {
            this.col++;
        } else {
            this.col = Field.getWidth() - 1;
        }
    }

    public void moveInDirection(Direction direction) {


        switch (direction) {

            case UP:
                moveUp();
                break;
            case DOWN:
                moveDown();
                break;
            case LEFT:
                moveLeft();
                break;
            case RIGHT:
                moveRight();
                break;
        }

    }


    public boolean onEdge(Direction direction){
        return (direction == Direction.DOWN && this.row == Field.getHeight() -1) ||
                (direction == Direction.UP && this.row == 0) ||
                (direction == Direction.LEFT && this.col == 0) ||
                (direction == Direction.RIGHT && this.col == Field.getWidth() - 1);
    }


    public boolean equals(Position position) {
        return col == position.getCol() &&
                row == position.getRow();
    }

    @Override
    public String toString() {
        return "Position{" +
                "row=" + row +
                ", col=" + col +
                '}';
    }
}
