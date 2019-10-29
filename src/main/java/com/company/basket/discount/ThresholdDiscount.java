package com.company.basket.discount;

import com.company.item.*;

public class ThresholdDiscount implements Discount{

    private int threshold = 0;
    
    public ThresholdDiscount(int threshold){
        this.threshold = threshold;
    }
    
    public Double getDiscountPrice(Item item, Integer quantity){
        return (item.getPrice() * quantity) - ((quantity/threshold) * item.getPrice());
    }
    
    

}
