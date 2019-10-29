package com.company.item;

import java.util.*;
import com.company.basket.discount.*;

public abstract class Item {
    private Double price;
    private String name;

    Item(){

    }

    public boolean isEligibleForDiscount(Map<Item, Discount> discounts){
        return discounts.containsKey(this);
    }

    public String getName(){
        return this.name;
    }

    public void setName(String itemName){
        this.name = itemName;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object other){
        // self check
        if (this == other)
            return true;
        // null check
        if (other == null)
            return false;
        // type check and cast
        if (getClass() != other.getClass())
            return false;
        Item item = (Item) other;
        // field comparison
        return Objects.equals(name, item.name)
            && Objects.equals(price, item.price);
    }
    
    @Override
    public int hashCode(){
        int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((price == null) ? 0 : price.hashCode());
        return result;
    }

}
