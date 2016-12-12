/**
 * Created by vntjomg on 12/12/16.
 */
public class Snake {

    public int size;
    public Position[] positions;

    /*
     * Draw the snake
     */
    public Snake(){
        positions = new Position[1];
        positions[0] = new Position();
        positions[0].setX(2);
        positions[0].setY(2);
    }

//    public void move(String movement) {
//        if (movement.equals("up")) {
//            this.positions[0].setY(this.positions[0].getY() - 1);
//        } else if (movement.equals("down")) {
//            this.positions[0].setY(this.positions[0].getY() + 1);
//        } else if (movement.equals("left")) {
//            this.positions[0].setX(this.positions[0].getX() - 1);
//        } else if (movement.equals("right")) {
//            this.positions[0].setX(this.positions[0].getX() + 1);
//        }
//    }

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
}
