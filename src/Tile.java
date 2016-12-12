/**
 * Created by vntjomg on 12/12/16.
 */
public class Tile {
    public boolean hasApple = false;
    private String label;
    private String labelWithApple;

    public Tile() {
        this.setLabel("[ ]");
        this.setLabelWithApple("[#]");
    }

    public String getLabelToDisplay(){
        if(this.hasApple) {
            return this.getLabelWithApple();
        } else {
            return this.getLabel();
        }
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
}
