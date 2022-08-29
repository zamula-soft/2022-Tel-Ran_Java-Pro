package lesson3.figure;

public class Ellipse extends FigureAbstract {
    private double axis1, axis2;

    public Ellipse(double axis1, double axis2) {
        this.axis1 = axis1;
        this.axis2 = axis2;
    }

    public double getAxis1() {
        return axis1;
    }

    public void setAxis1(double axis1) {
        this.axis1 = axis1;
    }

    public double getAxis2() {
        return axis2;
    }

    public void setAxis2(double axis2) {
        this.axis2 = axis2;
    }

    @Override
    public double getPerimeter() {
        return 4 * (Math.PI * (axis1 + axis2) + (axis1 + axis2) * (axis1 + axis2)) / (axis1 + axis2);
    }

    @Override
    public double getArea()
    {
        return Math.PI * axis1 * axis2;
    }
}
