/**
 * Created by vntjomg on 12/12/16.
 */
public class Snake {

    private int size;
    public Position[] positions;

    /*
     * Draw the snake
     */
    public Snake(){
        this.setSize(1);
        positions = new Position[1];
        positions[0] = new Position();
        positions[0].setX(2);
        positions[0].setY(2);
    }

    public void increaseSize() {
        this.setSize(this.getSize() + 1);
    }

    public void moveUp(){
        this.positions[0].setY(this.positions[0].getY() - 1);
    }

    public void moveDown(){
        this.positions[0].setY(this.positions[0].getY() + 1);
    }

    public void moveLeft(){
        this.positions[0].setX(this.positions[0].getX() - 1);
    }

    public void moveRight(){
        this.positions[0].setX(this.positions[0].getX() + 1);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
