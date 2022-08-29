package lesson3.figure;

import java.util.ArrayList;
import java.util.List;

public class FigureTest {
    public static void main(String[] args) {
        List <FigureAbstract> figures = new ArrayList<>();
        Rectangle r = new Rectangle(2,3);
        r.setMaterial("Carton");
        figures.add(r);
        figures.add(new Rectangle(2,3));
        figures.add(new Ellipse(2, 3));

        System.out.println(figures.size());

        double perimeter = 0;
        double area = 0;
        double price = 0;

        for (int i = 0; i < figures.size(); i++) {
            perimeter += figures.get(i).getPerimeter();
            area += figures.get(i).getArea();
            price += figures.get(i).calcPrice();
        }
        System.out.println("area: "+ area);
        System.out.println("perimeter: "+perimeter);
        System.out.println("price: "+price);

    }
}
