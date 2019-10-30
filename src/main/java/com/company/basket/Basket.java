package com.company.basket;

import java.util.*;
import com.company.item.*;
import com.company.basket.discount.*;
import java.text.DecimalFormat;

/**
 * Classe représentant le Panier
 * Il est typé selon une catégorie d'Items
 * Dans ce projet, nous alons implémenter le panier de Fruits.
 * 
 * @author jakubstankowski
 *  Version initiale
 * @author tstebut
 *  Version enrichie pour gérer 
 *   - Des quantités variables d'Items
 *   - Des discounts
 */
public class Basket<T extends Item> {

    private Map<T, Integer> items = new HashMap<>();
    private Map<T, Discount> possibleDiscounts = new HashMap<>();

    /**
     * Permet d'appliquer un jeu de Discount
     * @param Map<T, Discount> pour chaque instance d'Item en clé de cette Map 
     * pourra s'appliquer 1 et 1 seul discount.
     */
    public void applyDiscounts(Map<T, Discount> discounts){
        this.possibleDiscounts = discounts;    
    }
    
    /**
     * Ajoute une instance d'Item au panier
     * @param T l'item
     * @int la quantité ajoutée pour cet item
     */
    public void addItemToBasket(T item, int quantity) {
        Integer oldValue = items.putIfAbsent(item, quantity);
        if (oldValue != null)
            items.put(item, quantity + oldValue);
    }

    /**
     * Supprime 1 et 1 seule instance d'Item du panier
     * @param T l'instance d'Item à supprimer
     */
    public void deleteFromBasket(T item) {
        Integer oldValue = items.remove(item);
        if (oldValue != null && oldValue > 1)
            items.put(item, oldValue - 1 );
    }

    /**
     * Calcul le prix total du panier
     * @return double le prix total du panier
     */
    public double totalBasketPrice() {
        List<Double> priceList = new ArrayList<>();
        for (Map.Entry<T, Integer> entry : this.items.entrySet()) {
            // Si un discount est connu pour l'Item
            if (possibleDiscounts.containsKey(entry.getKey()))
                // On fait le calcul à partir du Discount correspondant
                priceList.add(possibleDiscounts.get(entry.getKey())
                    .getDiscountPrice(entry.getKey(), entry.getValue()));
            else
                // On fait le calcul simple
                priceList.add(entry.getValue() * entry.getKey().getPrice());
        }
        // Sum de tous les différents lots de fruits avec ou sans discount
        DecimalFormat newFormat = new DecimalFormat("#.##");
        return Double.valueOf(newFormat.format(
            priceList.stream()
                .reduce(0.0, (a, b) -> a + b))
        );
    }

    /**
     * Affiche sur l'écran console le contenu du Panier
     */
    public void showBasket() {
        for (Map.Entry<T, Integer> entry : this.items.entrySet()) {
            System.out.println("Item: " + entry.getKey().getName() + ", quantity: " + entry.getValue() + ", price: " + entry.getKey().getPrice() + "£");
        }

    }

    /**
     * Test si un Item est contenu au moins 1 fois dans le panier
     * @param Item l'item recherché
     * @return boolean vrai si l'item est contenu au moins 1 fois dans le panier
     */
    public boolean isInBasket(T item) {
        boolean isInBasket = false;
        if (this.items.containsKey(item)) {
            isInBasket = true;
        }
        return isInBasket;
    }


}
