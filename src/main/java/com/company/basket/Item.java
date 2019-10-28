package com.company.basket;

import java.util.Objects;

public abstract class Item {
    private double price;
    private String name;

    Item(){

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

}
