import com.company.basket.*;
import com.company.basket.discount.*;
import com.company.item.*;

import java.util.Map;
import java.util.HashMap;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Simple classe de test du Panier
 */
class FruitBasketTest {

    private final Basket<Fruit> basket = new Basket<>();

    @org.junit.jupiter.api.Test
    @DisplayName("test add item to basket")
    void addItemToBasket() {
        Fruit orange = Fruits.valueOf("Orange".toUpperCase()).getFruit();
        basket.addItemToBasket(orange, 1);
        assertTrue(basket.isInBasket(orange));
    }

    @org.junit.jupiter.api.Test
    @DisplayName("test delete item to basket")
    void deleteFromBasket() {
        Fruit orange = Fruits.valueOf("Orange".toUpperCase()).getFruit();
        basket.addItemToBasket(orange, 1);
        basket.deleteFromBasket(orange);
        assertFalse(basket.isInBasket(orange));
        basket.addItemToBasket(orange, 2);
        basket.deleteFromBasket(orange);
        assertTrue(basket.isInBasket(orange));
        basket.deleteFromBasket(orange);
        assertFalse(basket.isInBasket(orange));
    }

    @org.junit.jupiter.api.Test
    @DisplayName("test total basket count")
    void totalBasketCount() {
        basket.addItemToBasket(Fruits.valueOf("Apple".toUpperCase()).getFruit(), 2);
        basket.addItemToBasket(Fruits.valueOf("Orange".toUpperCase()).getFruit(), 5);
        basket.addItemToBasket(Fruits.valueOf("Watermelon".toUpperCase()).getFruit(), 3);
        double expectedSum  = 5.3;
        assertEquals(expectedSum, basket.totalBasketPrice());
    }


}