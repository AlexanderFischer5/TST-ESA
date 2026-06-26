package shoppingcart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShoppingCartTest {

    @Test
    void neuerWarenkorbHatGesamtpreisNull() {
        ShoppingCart cart = new ShoppingCart();

        assertEquals(0.0, cart.getGesamtpreis());
            
    }

    @Test
    void artikelHinzufuegenErhoehtGesamtpreis() {
        ShoppingCart cart = new ShoppingCart();

        cart.addArtikel(2.50);

        assertEquals(2.50, cart.getGesamtpreis());
    }
    
}