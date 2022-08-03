package lesson1.geometry;

public class Rectangle {
    private Point sw = new Point(1,1);
    private Point ne = new Point(1,1);

    public Rectangle(Point sw, Point ne) {
        this.sw = sw;
        this.ne = ne;
    }

    public int getArea(){
        return Math.abs((ne.getX() - sw.getX()) * (ne.getY()-sw.getY()));
    }
}
