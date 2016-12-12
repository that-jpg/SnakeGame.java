import java.util.Random;

/**
 * Created by vntjomg on 12/12/16.
 */
public class Screen {

    private int height = 20;
    private int width = 20;

    void draw() {
        Tile[][] tiles = new Tile[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                tiles[i][j] = new Tile();
                System.out.print(tiles[i][j].getLabel());
            }
            System.out.print("\n");
        }
    }

    

}

