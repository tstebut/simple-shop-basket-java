package com.company.basket;

import java.util.*;
import com.company.item.*;
import com.company.basket.discount.*;
import java.text.DecimalFormat;

public class Basket<T extends Item> {

    private Map<T, Integer> items = new HashMap<>();
    private Map<T, Discount> possibleDiscounts = new HashMap<>();

    public void applyDiscounts(Map<T, Discount> discounts){
        this.possibleDiscounts = discounts;    
    }
    
    public void addItemToBasket(T item, int quantity) {
        Integer oldValue = items.putIfAbsent(item, quantity);
        if (oldValue != null)
            items.put(item, quantity + oldValue);
    }

    public void deleteFromBasket(T item) {
        Integer oldValue = items.remove(item);
        if (oldValue != null && oldValue > 1)
            items.put(item, oldValue - 1 );
    }


    public double totalBasketPrice() {
        List<Double> priceList = new ArrayList<>();
        for (Map.Entry<T, Integer> entry : this.items.entrySet()) {
            if (possibleDiscounts.containsKey(entry.getKey()))
                priceList.add(possibleDiscounts.get(entry.getKey())
                    .getDiscountPrice(entry.getKey(), entry.getValue()));
            else
                priceList.add(entry.getValue() * entry.getKey().getPrice());
        }
        DecimalFormat newFormat = new DecimalFormat("#.##");
        return Double.valueOf(newFormat.format(
            priceList.stream()
                .reduce(0.0, (a, b) -> a + b))
        );
                

    }


    public void showBasket() {
        for (Map.Entry<T, Integer> entry : this.items.entrySet()) {
            System.out.println("Item: " + entry.getKey().getName() + ", quantity: " + entry.getValue() + ", price: " + entry.getKey().getPrice() + "£");
        }

    }

    public boolean isInBasket(T item) {
        boolean isInBasket = false;
        if (this.items.containsKey(item)) {
            isInBasket = true;
        }
        return isInBasket;
    }


}
