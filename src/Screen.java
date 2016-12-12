import java.util.Random;

/**
 * Created by vntjomg on 12/12/16.
 */
public class Screen {

    private int height = 20;
    private int width = 20;
    private Tile tiles[][];

    public void initialize() {
        this.tiles = new Tile[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                tiles[i][j] = new Tile();
                System.out.print(tiles[i][j].getLabelToDisplay());
            }
            System.out.print("\n");
        }
    }

    public void redraw(){
        System.out.flush();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(tiles[i][j].getLabelToDisplay());
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

