package Graph;

public class Vertex {
    public char label;
    public boolean wasVisited;
    
    public Vertex(char lab) {
        this.label = lab; 
        wasVisited = false;
    }
}
