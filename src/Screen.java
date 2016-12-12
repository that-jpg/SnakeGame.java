import java.util.Random;

/**
 * Created by vntjomg on 12/12/16.
 */
public class Screen {

    private static final int HEIGHT = 5;
    private static final int WIDTH = 5;
    private Tile tiles[][];
    public int score = 0;
    

    public void initialize() {
        this.tiles = new Tile[HEIGHT][WIDTH];
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                tiles[i][j] = new Tile();
            }
        }
    }

    boolean isSnakeColide(Snake snake){
        return  (snake.positions[0].x < 0 || snake.positions[0].x >= WIDTH) ||
                (snake.positions[0].y < 0 || snake.positions[0].y >= HEIGHT);
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
            for (int i = 0; i < HEIGHT; i++) {
                for (int j = 0; j < WIDTH; j++) {
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
        int x = randomGenerator.nextInt(this.WIDTH);
        int y = randomGenerator.nextInt(this.HEIGHT);
        this.tiles[x][y].hasApple = true;
    }

}

