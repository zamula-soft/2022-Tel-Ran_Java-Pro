package lesson3.figure;

public class Rectangle extends FigureAbstract {
    double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }



    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea(){
        return height*width;
    }

    @Override
    public double getPerimeter(){
        return 2 * (width + height);

    }
}
