import com.company.basket.*;
import org.junit.jupiter.api.DisplayName;


import static org.junit.jupiter.api.Assertions.*;

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
    }

    @org.junit.jupiter.api.Test
    @DisplayName("test total basket count")
    void totalBasketCount() {
        basket.addItemToBasket(Fruits.valueOf("Apple".toUpperCase()).getFruit(), 1);
        basket.addItemToBasket(Fruits.valueOf("Orange".toUpperCase()).getFruit(), 2);
        basket.addItemToBasket(Fruits.valueOf("Watermelon".toUpperCase()).getFruit(), 3);
        double expectedSum  = 3.6;
        assertEquals(expectedSum, basket.totalBasketPrice());
    }


}