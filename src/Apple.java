import java.util.Random;

/**
 * Created by vntjomg on 12/12/16.
 */
public class Apple {

    private Position position;

    public Apple(int maxX, int maxY) {
        this.newApple(maxX, maxY);
    }

    public void newApple(int maxX, int maxY) {
        position = new Position();
        Random randomGenerator = new Random();
        position.setX(randomGenerator.nextInt(maxX));
        position.setY(randomGenerator.nextInt(maxY));
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

}
