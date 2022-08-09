package lesson2.homeWork.pizza;

import java.util.List;

public class PizzaOrder {
    private List<Pizza> pizzas;

    public PizzaOrder(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public double calculateTotalPrice(){
        double totalPrice = 0;
        for (int i = 0; i < pizzas.size(); i++) {
            totalPrice += pizzas.get(i).calculatePrice();
        }
        return totalPrice;
    }
}
