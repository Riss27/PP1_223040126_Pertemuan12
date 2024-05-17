public class Vertex {
    private char label; 
    private boolean wasVisited;

    public Vertex(char lab) { 
        label = lab;
        wasVisited = false;
    }

    /** Setter dan Getter **/
    public char getLabel() {
        return label;
    }

    public void setLabel(char label) {
        this.label = label;
    }
}
