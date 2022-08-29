package lesson3.figure;

public abstract class FigureAbstract {
    private String material;

    abstract double getArea();
    abstract double getPerimeter();

    public FigureAbstract(String material) {
        this.material = material;
    }

    public FigureAbstract(){
        this.material = "Aluminium";
    }

    public String getMaterial(){
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double calcPrice(){
        if (material.equals("Aluminium"))
            return 20 * getArea();
        else if (material.equals("Carton"))
            return 5 * getArea();
        else
            return 15 * getArea();
    }
}
