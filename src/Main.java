public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        System.out.println("PCH");
        Point p1 = new Point();
        p1.setX(250);
        p1.setY(750);

        Point p2 = new Point(6,9);
        System.out.println("Twój x to: " + p1.getX() + " a Twój y to: " + p1.getY());

        Segment s=new Segment(p1,p2);
        Segment s2 = new Segment(p1,p2);
        p1.setX(15);
        p1.setY(12);
        p2.setX(15);
        p2.setY(8);






        System.out.println();
    }
}