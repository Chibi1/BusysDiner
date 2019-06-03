package model;

import java.util.ArrayList;
import java.util.List;

public class Dish {
    private String dishName;
    private String description;
    private double dishPrice;
    private List<String> ingredientsInDish;
    private String recipe;

    public Dish(String name, String description, List<String> ingredientsInDish, String recipe) {
        this(name);
        this.description = description;
        this.ingredientsInDish = ingredientsInDish;
        this.recipe = recipe;
    }

    public Dish(String name) {
        this.dishName = name;

    }

    public String getDishName() { return dishName; }
    public double getDishPrice() { return dishPrice; }
    public String getDescription() { return description; }
    public List<String> getIngredientsInDish() { return ingredientsInDish; }
    public String getRecipe() { return recipe; }

    public void setDishName(String dishName) { this.dishName = dishName; }
    public void setDescription(String description) { this.description = description; }
    public void setDishPrice(double dishPrice) { this.dishPrice = dishPrice; }
    public void setIngredientsInDish(List<String> ingredientsInDish) { this.ingredientsInDish = ingredientsInDish; }
}
