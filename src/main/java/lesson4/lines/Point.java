package lesson4.lines;

public class Point {
    private double x,y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }


    public double getLength (Point p){
        return Math.sqrt(
                Math.pow((p.getX() - getX()),2) + Math.pow((p.getY() - getY()),2)
        );
    }
}
