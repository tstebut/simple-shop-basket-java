package com.company.basket;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Basket<Fruit> basket = new Basket<>();

        boolean exit = false;

        
        try (Scanner keyboard = new Scanner(System.in)){
            while (!exit) {
                System.out.println("What do you need? sum|add|list|delete|exit ");
                String input = keyboard.nextLine();
                switch (input) {
                    case "add":
                        System.out.println("Add new item, put Name, then quantity: ");
                        basket.addItemToBasket(Fruits.valueOf(keyboard.next()).getFruit(), keyboard.nextInt());
                        break;
                    case "list":
                        basket.showBasket();
                        break;
                    case "delete":
                        System.out.println("Which value yo want delete, put NAME:");
                        String deleteKey = keyboard.next();
                        basket.deleteFromBasket(Fruits.valueOf(deleteKey).getFruit());
                        System.out.println("Success delete, list: ");
                        basket.showBasket();
                        break;
                    case "sum":
                        System.out.println("Total basket count is: " + basket.totalBasketPrice() + "£");
                        break;
                    case "exit":
                        System.out.println("Thanks for using my program! TvS 2019");
                        exit = true;
                        break;
                    default:
                        exit = true;
                }
    
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("item count should be a number!");
        }

    }
}
