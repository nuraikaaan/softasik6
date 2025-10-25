package model;

import strategy.CookingStrategy;

public class Pizza {
    private final String type;
    private CookingStrategy cookingStrategy;

    public Pizza(String type) {
        this.type = type;
    }

    // Allows changing cooking method at runtime
    public void setCookingStrategy(CookingStrategy cookingStrategy) {
        this.cookingStrategy = cookingStrategy;
    }

    public void cookPizza() {
        if (cookingStrategy == null) {
            System.out.println("Please choose a cooking method for " + type + ".");
        } else {
            cookingStrategy.cook(type);
        }
    }
}
