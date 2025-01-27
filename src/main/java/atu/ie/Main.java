package atu.ie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Burger> items = new ArrayList<>();
        System.out.println("This is your order");

        //Create an order
        Burger cheeseBurger = new Burger("Cheeseburger", 1.99, "Tasty");
        Burger veggie = new Burger("Veggie Burger", 2.99, "Even Better");


        //List all the food items like burgers, pizzas, fries, etc
        items.add(cheeseBurger);
        items.add(veggie);

        for(Burger item : items){
            System.out.println("Name: " + item.getName());
            System.out.println("Ingredients: " + item.getIngredients());
            System.out.println("Price: " + item.getPrice());
        }




    }
}
