package com.company.basket.discount;

import com.company.item.*;

public interface Discount {
    
    Double getDiscountPrice(Item item, Integer quantity);
}
