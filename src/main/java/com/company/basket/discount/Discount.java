package com.company.basket.discount;

import com.company.item.*;

/**
 * Interface simple définissant le contrat minimum pour un discount,
 * c'est-à-dire transformer le prix d'un lot d'Items
 * 
 * @author tstebut
 */
public interface Discount {
    
    /**
     * Transforme le prix d'un lot d'Items
     * @return Double le prix transformé
     */
    Double getDiscountPrice(Item item, Integer quantity);
}
