package strategy;

public class OvenBakeStrategy implements CookingStrategy {
    @Override
    public void cook(String pizzaType) {
        System.out.println(pizzaType + " is being baked in the oven.");
    }
}
