/**
 * Created by vntjomg on 12/12/16.
 */
public class Tile {
    private boolean apple = false;
    private boolean snakeBody = false;

    final private String LABEL = "[ ]";
    private String LABEL_WITH_SNAKE_BODY= "[@]";
    private String LABEL_WITH_APPLE = "[#]";

    public void printTile() {
        if (this.hasApple()) {
            System.out.print(this.LABEL_WITH_APPLE);
        } else if(this.isSnakeBody()){
            System.out.print(this.LABEL_WITH_SNAKE_BODY);
        } else {
            System.out.print(this.LABEL);
        }
    }

    public boolean hasApple() {
        return apple;
    }

    public void setApple(boolean apple) {
        this.apple = apple;
    }

    public boolean isSnakeBody() {
        return snakeBody;
    }

    public void setSnakeBody(boolean snakeBody) {
        this.snakeBody = snakeBody;
    }
}
