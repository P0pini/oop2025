import java.util.ArrayList;

public class Polygon {
    private ArrayList<Point>Points=new ArrayList<Point>();

    public Polygon(ArrayList<Point> points) {
        Points = points;
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "Points=" + Points +
                '}';
    }
}
