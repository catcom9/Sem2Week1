package atu.ie;

public class Pizza implements MenuItem{
    private String name;

    private double price;

    private String ingredients;


    public Pizza(String name, double price, String ingredients) {
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getDescription() {
        return ingredients;
    }
}
