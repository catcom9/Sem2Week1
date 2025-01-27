package atu.ie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<MenuItem> items = new ArrayList<>();
        System.out.println("This is your order");

        //Create an order
        Burger cheeseBurger = new Burger("Cheeseburger", 1.99, "Beef Patty, Bacon, Cheese");
        Burger veggie = new Burger("Veggie Burger", 2.99, "Veggie Burger, Lettuce, tomato");
        Pizza Tuna = new Pizza("Tuna pizza", 3.43, "Chesse, Tuna, Tomato Sause");
        Salad caesarSalad = new Salad("Caesar Salad", 4.3, "Salad");


        //List all the food items like burgers, pizzas, fries, etc
        items.add(cheeseBurger);
        items.add(veggie);
        items.add(Tuna);
        items.add(caesarSalad);

        double totalPrice = 0;
        for(MenuItem item : items){
            System.out.println("Name: " + item.getName());
            System.out.println("Ingredients: " + item.getDescription());
            System.out.println("Price: €" + item.getPrice() + "\n\n");
            totalPrice += item.getPrice();
        }
        System.out.println("Total order price is: €" + totalPrice);




    }
}
