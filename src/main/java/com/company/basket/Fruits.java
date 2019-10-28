package com.company.basket;

public enum Fruits {
    APPLE(0.2), ORANGE(0.5), WATERMELON(0.8);
    
    private double price;
    
    private Fruits(double price){
        this.price = price;
    }
    
    public double getPrice(){
        return price;
    }
    
    public Fruit getFruit(){
        Fruit fruit = new Fruit();
        fruit.setName(this.name());
        fruit.setPrice(this.getPrice());
        return fruit;  
    }
}
