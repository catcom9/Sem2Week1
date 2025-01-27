package atu.ie;

public class Burger implements MenuItem{
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

    public String getDescription() {
        return ingredients;
    }

}
