package shoppingcart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Double> artikel = new ArrayList<>();

    public void addArtikel(double preis) {
        artikel.add(preis);
    }

    public double getGesamtpreis() {
        double summe = 0;

        for (double preis : artikel) {
            summe += preis;
        }

        return summe;
    }

    public int getQuantity() {
        return artikel.size();
    }

}