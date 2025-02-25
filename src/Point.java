public class Point {
    public double x;
    public double y;
    public String toString(){
        return "x="+x+" y="+y;
    }
    public String toSVG(){
        return "<svg height=\"1000\" width=\"1000\" xmlns=\"http://www.w3.org/2000/svg\">\n" +
                "  <circle r=\"40\" cx=\""+x+"\" cy=\""+y+"\" fill=\"orange\" />\n" +
                "</svg>";
    }
    public void translate(double dx, double dy){
        x+=dx;
        y+=dy;
    }
    public Point translated(double dx, double dy){
        Point trPoint = new Point();
        trPoint.x= x+dx;
        trPoint.y= y+dy;
        return trPoint;
    }

}
