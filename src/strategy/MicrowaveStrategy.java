package strategy;

public class MicrowaveStrategy implements CookingStrategy {
    @Override
    public void cook(String pizzaType) {
        System.out.println(pizzaType + " is being heated quickly in the microwave. ⚡");
    }
}
