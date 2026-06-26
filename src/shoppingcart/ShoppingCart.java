package shoppingcart;

public class ShoppingCart {

    private double gesamtpreis;
    private int anzahl;

    public void addArtikel(double preis) {
        gesamtpreis += preis;
        anzahl++;
    }

    public double getGesamtpreis() {
        return gesamtpreis;
    }

    public int getQuantity() {
        return anzahl;
    }

}