import java.util.ArrayList;
import java.awt.Point;
import java.util.Objects;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Vertex
{
    Point p;
    boolean hovered;
    Cloud inCloud;
    ArrayList<Edge> inEdges;

    public Vertex(Point x) {
        // constructor
        p = x;
        hovered = false;
        inEdges = new ArrayList<Edge>();
        inCloud = new Cloud();
    }
}
