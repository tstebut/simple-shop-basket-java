package com.company.item;

import java.util.*;
import com.company.basket.discount.*;

/**
 * Classe abstraite représentant un Item quel qu'il soit, fruit ou autre (qui sait)
 * 
 * @author jakubstankowski
 *  Version initiale
 * @author tstebut
 *  Version enrichie pour gérer un prix avec des décimales,
 *  et connaitre l'égibilité à un éventuel Discount
 */
public abstract class Item {
    
    /**
     * Nom de l'Item
     */
    private String name;
    
    /**
     * Prix de l'Item
     */
    private Double price;
    
    /**
     * Constructeur vide
     */
    Item(){
    }

    /**
     * Méthode permettant de savoir si l'Item est éligible pour un Discount
     * @param Map<Item, Discount> la correspondance entre les Discounts en cours et les Items
     * @return boolean vrai s'il y a correspondance d'un discount avec cet Item
     */
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
