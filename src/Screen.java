import java.util.Random;

/**
 * Created by vntjomg on 12/12/16.
 */
public class Screen {

    private int height = 5;
    private int width = 5;
    private Tile tiles[][];


    public void initialize() {
        this.tiles = new Tile[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                tiles[i][j] = new Tile();
            }
        }
    }

    public void redraw(Snake snake){
        System.out.flush();
        boolean isSnakeBody = false;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                for (int k = 0; k < snake.positions.length; k++) {
                    if(snake.positions[k].getX() == j && snake.positions[k].getY() == i) {
                        isSnakeBody = true;
                    }
                }
                System.out.print(tiles[i][j].getLabelToDisplay(isSnakeBody));
                isSnakeBody = false;
            }
            System.out.print("\n");
        }
    }


    public void setApple() {
        Random randomGenerator = new Random();
        int x = randomGenerator.nextInt(this.width);
        int y = randomGenerator.nextInt(this.height);
        this.tiles[x][y].hasApple = true;
    }

}

