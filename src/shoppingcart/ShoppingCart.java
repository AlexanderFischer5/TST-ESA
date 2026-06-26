package shoppingcart;

public class ShoppingCart {

    private double gesamtpreis = 0.0;

    public void addArtikel(double preis) {
        gesamtpreis += preis;
    }

    public double getGesamtpreis() {
        return gesamtpreis;
    }
}