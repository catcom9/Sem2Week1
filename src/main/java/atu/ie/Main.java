package atu.ie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<MenuItem> items = new ArrayList<>();
        System.out.println("This is your order");

        //Create an order
        Burger cheeseBurger = new Burger("Cheeseburger", 1.99, "Tasty");
        Burger veggie = new Burger("Veggie Burger", 2.99, "Even Better");
        Pizza Tuna = new Pizza("Tuna pizza", 3.43, "Has tuna on it");
        Salad caesarSalad = new Salad("CaesarSald", 4.3, "Nothing");


        //List all the food items like burgers, pizzas, fries, etc
        items.add(cheeseBurger);
        items.add(veggie);
        items.add(Tuna);
        items.add(caesarSalad);

        for(MenuItem item : items){
            System.out.println("Name: " + item.getName());
            System.out.println("Ingredients: " + item.getDescription());
            System.out.println("Price: " + item.getPrice());
        }




    }
}
