package lesson2.homeWork;

import lesson2.homeWork.pizza.Pizza;
import lesson2.homeWork.pizza.PizzaOrder;

import java.util.ArrayList;
import java.util.List;

public class HomeWork {
    public static void main(String[] args) {
        List<Pizza> pizzas = new ArrayList<>();

        pizzas.add(new Pizza("small",1,2,2));
        System.out.println(new Pizza("small",1,2,2).calculatePrice());
        pizzas.add(new Pizza("large",2,0,1));
        System.out.println(new Pizza("large",2,0,1).calculatePrice());
        pizzas.add(new Pizza("medium",1,1,1));
        System.out.println(new Pizza("medium",1,1,1).calculatePrice());

        PizzaOrder order = new PizzaOrder(pizzas);
        System.out.println(order.calculateTotalPrice());

    }
}
