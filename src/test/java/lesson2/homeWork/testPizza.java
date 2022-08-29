package lesson2.homeWork;

import lesson2.homeWork.pizza.Pizza;
import lesson2.homeWork.pizza.PizzaOrder;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class testPizza {

    @Test
    public void testCalculatePrice(){
        Pizza pizza = new Pizza("small", 2,1,5); //10+2*2+1*2+5*2 = 26

        assertEquals(26., pizza.calculatePrice(), 0.001);

    }

    @Test
    public void calculateTotalPrice(){
        List<Pizza> pizzas = new ArrayList<>();

        pizzas.add(new Pizza("small",1,0,2)); //10+2*1+2*0+2*2=16
        pizzas.add(new Pizza("large",2,0,1)); //14+2*2+2*0+2*1=20
        pizzas.add(new Pizza("medium",1,1,1)); //12+1*2+1*2+1*2=18

        PizzaOrder order = new PizzaOrder(pizzas);
        assertEquals(54.00, order.calculateTotalPrice(), 0.001);
        order.add(new Pizza("large", 10, 2, 3));
        assertEquals(98., order.calculateTotalPrice(), 0.001);
    }
}
