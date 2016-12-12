/**
 * Created by vntjomg on 12/12/16.
 */
public class Screen {
    private Tile[][] tiles;
    public int score = 0;

    private Snake snake;
    private Apple apple;
    private int height;
    private int width;


    public Screen(Snake snake, Apple apple, int HEIGHT, int WIDTH) {
        this.setWidth(WIDTH);
        this.setHeight(HEIGHT);
        this.setApple(apple);
        this.setSnake(snake);

        this.initialize();

        this.setSnakePosition(snake);
        this.setApplePosition(apple);
    }

    private void setApplePosition(Apple apple) {
        this.tiles[apple.getPosition().getX()][apple.getPosition().getY()].setApple(true);
    }

    private void setSnakePosition(Snake snake) {
        this.tiles[snake.positions[0].getX()][snake.positions[0].getY()].setSnakeBody(true);
    }

    public void initialize() {
        this.setTiles(new Tile[this.getHeight()][this.getWidth()]);
        for (int i = 0; i < this.getHeight(); i++) {
            for (int j = 0; j < this.getWidth(); j++) {
                getTiles()[i][j] = new Tile();
            }
        }
    }

    public void moveSnake(String movement)  {
        this.tiles[this.getSnake().positions[0].getX()][this.getSnake().positions[0].getY()].setSnakeBody(false);
        // Reset the current tile of the snake
        if (movement.equals("up")) {
            this.getSnake().moveUp();
        } else if (movement.equals("down")) {
            this.getSnake().moveDown();
        } else if (movement.equals("left")) {
            this.getSnake().moveLeft();
        } else if (movement.equals("right")) {
            this.getSnake().moveRight();
        }
        // Set the new tile to be the body
        this.setSnakePosition(this.getSnake());
    }


    boolean isSnakeColide(Snake snake){
//        return  (snake.positions[0].getX() < 0 || snake.positions[0].getX() >= this.getWidth()) ||
//                (snake.positions[0].getY() < 0 || snake.positions[0].getY() >= this.getHeight());
        return false;
    }

    boolean isSnakeAteApple(Snake snake, Tile tile) {
//        if(tile.hasApple) {
//            tile.hasApple = false;
//            this.score += 1;
//            return true;
//        }
        return false;
    }

    boolean isSnakeBody(Snake snake, Tile tile) {
        return true;
    }

    public boolean redraw(Snake snake){
        System.out.flush();
        boolean isSnakeBody = false;
        boolean ateApple = false;

        if(!this.isSnakeColide(snake)) {
            for (int i = 0; i < this.getHeight(); i++) {
                for (int j = 0; j < this.getWidth(); j++) {
                    if(this.isSnakeBody(this.getSnake(), getTiles()[i][j])) {
                        getTiles()[j][i].printTile();
                    }
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Snake getSnake() {
        return snake;
    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    public Apple getApple() {
        return apple;
    }

    public void setApple(Apple apple) {
        this.apple = apple;
    }

    public Tile[][] getTiles() {
        return tiles;
    }

    public void setTiles(Tile[][] tiles) {
        this.tiles = tiles;
    }
}

