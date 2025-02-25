public class Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 250;
        p1.y = 750;
        System.out.println("Twój x to: " + p1.x + " a Twój y to: " + p1.y);
        System.out.println(p1);
        System.out.println(p1.toSVG());
    }
}