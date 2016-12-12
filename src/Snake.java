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
        positions[0].x = 5;
        positions[0].y = 5;
    }
}
