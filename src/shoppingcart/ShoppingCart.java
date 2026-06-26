package shoppingcart;

public class ShoppingCart {

    private double gesamtpreis;

    public void addArtikel(double preis) {
        gesamtpreis += preis;
    }

    public double getGesamtpreis() {
        return gesamtpreis;
    }
}