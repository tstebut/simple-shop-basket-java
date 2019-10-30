package com.company.basket.discount;

import com.company.item.*;

/**
 * Implementation de Discount qui réduit tous les cas suivant en un modèle simple:
 * - 1 item offert pour N achetés
 * - N+1 pour le prix de N
 * 
 * @author tstebut
 */
public class ThresholdDiscount implements Discount{

    private int threshold = 0;
    
    /**
     * Constructeur prenant le seuil pour paramètre
     * Autant dire que chaque fois que ce seuil est atteint, 
     * le prix d'un Item est à défalquer du total du lot
     */
    public ThresholdDiscount(int threshold){
        this.threshold = threshold;
    }
    
    /**
     * {@inheritDoc}
     */
    public Double getDiscountPrice(Item item, Integer quantity){
        return (item.getPrice() * quantity) - ((quantity/threshold) * item.getPrice());
    }
    
    

}
