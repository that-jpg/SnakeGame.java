/**
 * Created by vntjomg on 12/12/16.
 */
public class Tile {
    public boolean hasApple = false;
    private String label;

    public Tile() {
        this.setLabel("[ ]");
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
