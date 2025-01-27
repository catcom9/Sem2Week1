package atu.ie;

public class Burger {
    private String name;
    private double price;
    private String ingredients;


    Burger(String name, double price, String ingredients){
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
}
