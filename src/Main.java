import java.security.cert.PolicyNode;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        System.out.println("PCH");



        Point p1 = new Point();
        p1.setX(250);
        p1.setY(750);

        Point p2 = new Point(6,9);
        Point p3 = new Point(p1);
        Point p4 = new Point(p2);

        Segment s1= new Segment(p1,p2);
        Segment s2 = new Segment(p3,p4);

        p1.setX(15);
        p1.setY(12);
        p2.setX(15);
        p2.setY(8);

        ArrayList<Point> points = new ArrayList<Point>();
        points.add(new Point(90,80));
        points.add(new Point(1,1));
        points.add(new Point(100,100));
        points.add(new Point(55,55));
        Polygon poly=new Polygon(points);



        System.out.println();
    }
}