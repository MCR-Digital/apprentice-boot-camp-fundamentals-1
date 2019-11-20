package checkout;

import java.util.ArrayList;

public class Basket {

    private ArrayList<Product> basketContents = new ArrayList<>();

    private void addProductToBasket(Product product) {

        basketContents.add(product);
    }
}
