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

    private void setApplePosition() {
        this.tiles[this.getApple().getPosition().getX()][this.getApple().getPosition().getY()].setApple(false);
        this.getApple().newApple(this.getWidth(), this.getHeight());
        this.tiles[this.getApple().getPosition().getX()][this.getApple().getPosition().getY()].setApple(true);
    }

    private void setSnakePosition(Snake snake) {
        this.tiles[snake.positions[0].getX()][snake.positions[0].getY()].setSnakeBody(true);
    }

    public void setSnakePosition() {
        if(this.getSnake().positions.length == this.getSnake().getSize()){

        } else {
//            this.getSnake().positions.
        }
    }

    public void initialize() {
        this.setTiles(new Tile[this.getHeight()][this.getWidth()]);
        for (int i = 0; i < this.getHeight(); i++) {
            for (int j = 0; j < this.getWidth(); j++) {
                getTiles()[i][j] = new Tile();
            }
        }
    }

    private boolean isSamePosition(Position a, Position b) {
        return (a.getX() == b.getX()) && (a.getY() == b.getY());
    }

    public boolean moveSnake(String movement)  {
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
        // if the snake is coliding with something stop the process
        if (this.isSnakeColide()){
            return false;
        }

        this.setSnakePosition(this.getSnake());
        return true;
    }


    boolean isSnakeColide(){
        return  (this.getSnake().positions[0].getX() < 0 || this.getSnake().positions[0].getX() >= this.getWidth()) ||
                (this.getSnake().positions[0].getY() < 0 || this.getSnake().positions[0].getY() >= this.getHeight());
    }

    boolean isSnakeAteApple() {
        if(this.isSamePosition(this.getApple().getPosition(), this.getSnake().positions[0])) {
            this.setApplePosition();
            this.getSnake().increaseSize();
            this.score += 1;
            return true;
        }
        return false;
    }

    boolean isSnakeBody(Snake snake, Tile tile) {
        return true;
    }

    public void redraw(Snake snake){

        boolean ateApple = false;

        for (int i = 0; i < this.getHeight(); i++) {
            for (int j = 0; j < this.getWidth(); j++) {
                if(this.isSnakeBody(this.getSnake(), this.getTiles()[i][j])) {
                    this.getTiles()[j][i].printTile();
                    if(this.isSnakeAteApple()) {
                        ateApple = true;
                    }
                }
            }
            System.out.print("\n");
        }
        if(ateApple) {
            System.out.println("You got a apple - Score: " + score);
        }


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

