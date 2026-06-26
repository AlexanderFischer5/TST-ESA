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
    
    
    @Test
    void anzahlDerArtikelWirdRichtigGezaehlt() {
        ShoppingCart cart = new ShoppingCart();

        cart.addArtikel(2.50);
        cart.addArtikel(3.00);

        assertEquals(2, cart.getQuantity());
    }
    @Test
    void artikelEntfernenVerringertGesamtpreis() {
        ShoppingCart cart = new ShoppingCart();

        cart.addArtikel(2.50);
        cart.addArtikel(3.00);

        cart.removeArtikel(2.50);

        assertEquals(3.00, cart.getGesamtpreis());
        assertEquals(1, cart.getQuantity());
    }
    
}