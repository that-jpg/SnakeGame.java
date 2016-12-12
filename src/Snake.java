/**
 * Created by vntjomg on 12/12/16.
 */
public class Snake {

    public int size;
    public Position[] positions;

    public class Position {
        public int x;
        public int y;

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    /*
     * Draw the snake
     */
    public Snake(){
        positions = new Position[1];
        positions[0] = new Position();
        positions[0].x = 2;
        positions[0].y = 2;
    }

    public void move(String movement) {
        if (movement.equals("up")) {
            this.positions[0].y = this.positions[0].y - 1;
        } else if (movement.equals("down")) {
            this.positions[0].y = this.positions[0].y + 1;
        } else if (movement.equals("left")) {
            this.positions[0].x = this.positions[0].x - 1;
        } else if (movement.equals("right")) {
            this.positions[0].x = this.positions[0].x + 1;
        }
    }

}
