public class Point {
    private Double x;
    private Double y;

    @Override
    public String toString() {
        return "Point{" + "\t\t\n"+
                "\t\t"+"x=" + x +",\n"+
                "\t\t"+"y=" + y +"\n"+
                '}';
    }

    public Point(Point toCopy){
        this.x=toCopy.x;
        this.y=toCopy.y;
    }

    public String toSVG(){
        return "<svg height=\"1000\" width=\"1000\" xmlns=\"http://www.w3.org/2000/svg\">\n" +
                "  <circle r=\"40\" cx=\""+x+"\" cy=\""+y+"\" fill=\"orange\" />\n" +
                "</svg>";
    }
    public Point(){}
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
