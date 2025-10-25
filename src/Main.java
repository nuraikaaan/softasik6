import model.Pizza;
import strategy.OvenBakeStrategy;
import strategy.WoodFireStrategy;
import strategy.MicrowaveStrategy;

public class Main {
    public static void main(String[] args) {
        Pizza margherita = new Pizza("Margherita Pizza");
        Pizza pepperoni = new Pizza("Pepperoni Pizza");


        margherita.setCookingStrategy(new WoodFireStrategy());
        pepperoni.setCookingStrategy(new OvenBakeStrategy());

        margherita.cookPizza();
        pepperoni.cookPizza();

        margherita.setCookingStrategy(new MicrowaveStrategy());
        margherita.cookPizza();
    }
}
