package OnlineRetailer;

import java.util.ArrayList;

public class ProductList {

    private final ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product aProduct) {
        products.add(aProduct);
    }

    public int getNumberOfProducts() {
        return products.size();
    }

    public Product searchForProduct(String searchText) {
        for (Product productX : products) {
            if (productX.getName().contains(searchText)) {
                return productX;
            }
        }
        System.out.println("Sorry, no match!");
        return null;
    }

}

