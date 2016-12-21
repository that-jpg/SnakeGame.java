/**
 * Tile is the object that represent one position in the screen.
 */
public class Tile {
    /**
     * Theses variables define the state of the tile, the tile can be
     * - apple tile (which means that it contain a apple)
     * - Snake tile (which means that it contain a part of the snake body)
     * - Empty tile (When the tile isnt a apple or a snake body it should have a empty behavior)
     **/
    private boolean apple = false;
    private boolean snakeBody = false;

    /**
     * Each type of tile is represented in a differently way in the     
     * screen, this variables define theirs styles.
     **/
    final private String LABEL = "[ ]";
    private String LABEL_WITH_SNAKE_BODY= "[@]";
    private String LABEL_WITH_APPLE = "[#]";

    /**
     * Print the tile in the screen basead on its type   
     **/
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
