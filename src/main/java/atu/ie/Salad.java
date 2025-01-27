package atu.ie;

public class Salad implements MenuItem{
    private String name;
    private double price;
    private String ingredients;


    Salad(String name, double price, String ingredients){
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
