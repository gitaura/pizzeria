import java.util.Scanner;

public class Waiter {

    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza getPizza(){

        pizzaBuilder.buildSauce();
        pizzaBuilder.buildTopping();
        pizzaBuilder.buildDough();
        return pizzaBuilder.getPizza();
    }



}
