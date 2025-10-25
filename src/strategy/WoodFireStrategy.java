package strategy;

public class WoodFireStrategy implements CookingStrategy {
    @Override
    public void cook(String pizzaType) {
        System.out.println(pizzaType + " is being cooked in a traditional wood-fired oven.");
    }
}
