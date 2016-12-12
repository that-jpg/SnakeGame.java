/**
 * Created by vntjomg on 12/12/16.
 */
public class Tile {
    public boolean hasApple = false;
    public boolean hasSnakeBody = false;



    private String label;
    private String labelWithSnakeBody;
    private String labelWithApple;

    public Tile() {
        this.setLabel("[ ]");
        this.setLabelWithApple("[#]");
        this.setLabelWithSnakeBody("[@]");
    }

    public String getLabelToDisplay(boolean isSnakeBody){
        if(isSnakeBody) {
            return this.getLabelWithSnakeBody();
        }

        if(this.hasApple) {
            return this.getLabelWithApple();
        }

        return this.getLabel();

    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getLabelWithApple() {
        return labelWithApple;
    }

    public void setLabelWithApple(String setLabelWithApple) {
        this.labelWithApple = setLabelWithApple;
    }

    public String getLabelWithSnakeBody() {
        return labelWithSnakeBody;
    }

    public void setLabelWithSnakeBody(String labelWithSnakeBody) {
        this.labelWithSnakeBody = labelWithSnakeBody;
    }
}
