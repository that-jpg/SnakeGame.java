import java.util.Random;

/**
 * Created by vntjomg on 12/12/16.
 */
public class Screen {

    private int height = 5;
    private int width = 5;
    private Tile tiles[][];
    public int score = 0;


    public void initialize() {
        this.tiles = new Tile[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                tiles[i][j] = new Tile();
            }
        }
    }

    boolean isSnakeColide(Snake snake){
        return  (snake.positions[0].x < 0 || snake.positions[0].x >= width) ||
                (snake.positions[0].y < 0 || snake.positions[0].y >= height);
    }

    boolean isSnakeAteApple(Snake snake, Tile tile) {
        if(tile.hasApple) {
            tile.hasApple = false;
            this.score += 1;
            return true;
        }
        return false;
    }


    public boolean redraw(Snake snake){
        System.out.flush();
        boolean isSnakeBody = false;
        boolean ateApple = false;

        if(!this.isSnakeColide(snake)) {
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    for (int k = 0; k < snake.positions.length; k++) {
                        if(snake.positions[k].getX() == j && snake.positions[k].getY() == i) {
                            isSnakeBody = true;
                            if (isSnakeAteApple(snake, tiles[i][j])) {
                                setApple();
                                ateApple = true;
                            }
                        }
                    }
                    System.out.print(tiles[i][j].getLabelToDisplay(isSnakeBody));
                    isSnakeBody = false;
                }

                System.out.print("\n");
            }
        } else {
            System.out.println("--------- GAME OVER ---------");
            System.out.println("Your final score is " + score);
            return false;
        }

        if(ateApple) {
            System.out.println("You got a apple - Score: " + score);
        }

        return true;
    }


    public void setApple() {
        Random randomGenerator = new Random();
        int x = randomGenerator.nextInt(this.width);
        int y = randomGenerator.nextInt(this.height);
        this.tiles[x][y].hasApple = true;
    }

}

