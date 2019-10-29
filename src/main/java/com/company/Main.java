package com.company;

import java.util.*;

import com.company.basket.discount.*;
import com.company.item.*;
import com.company.item.Fruit;
import com.company.basket.*;

public class Main {

    public static void main(String[] args) {
        Basket<Fruit> basket = new Basket<>();
        Map<Fruit, Discount> discountMap = new HashMap<>();
        discountMap.put(Fruits.APPLE.getFruit(),new ThresholdDiscount(2));
        discountMap.put(Fruits.WATERMELON.getFruit(),new ThresholdDiscount(3));
        basket.applyDiscounts(discountMap);
        boolean exit = false;

        
        try (Scanner keyboard = new Scanner(System.in) ; Scanner inputScanner = new Scanner(System.in)){
            while (!exit) {
                System.out.println("What do you need? sum|add|list|delete|exit ");
                String input = keyboard.nextLine();
                try{
                    switch (input) {
                        case "add":
                            System.out.println("Add new item, put Name (Apple|Orange|Watermelon), case unsensitive ;) , then quantity: ");
                            basket.addItemToBasket(Fruits.valueOf(inputScanner.next().toUpperCase()).getFruit(), inputScanner.nextInt());
                            break;
                        case "list":
                            basket.showBasket();
                            break;
                        case "delete":
                            System.out.println("Which value yo want delete, put NAME:");
                            String deleteKey = inputScanner.next();
                            basket.deleteFromBasket(Fruits.valueOf(deleteKey.toUpperCase()).getFruit());
                            System.out.println("Success delete, list: ");
                            basket.showBasket();
                            break;
                        case "sum":
                            System.out.println("Total basket price is: " + basket.totalBasketPrice() + "£");
                            break;
                        case "exit":
                            System.out.println("Thanks for using my program! TvS 2019");
                            exit = true;
                            break;
                        default:
                            System.out.println("Wrong comand, try again !");
                    }
                }
                catch(IllegalArgumentException | java.util.InputMismatchException e){
                    System.out.println("Watchout, item can only be one of those fruits, and then quantity must be an int: \n Apple|Orange|Watermelon, case unsensitive ;)");                    
                }
    
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalArgumentException("Something wrong happened");
        }

    }
}
