package OnlineRetailer;

public class Product {

    String name;
    String category;
    double netPrice;
    int unitsInStock;
    int stockReorderThreshold;

    public Product(String n, String cat, Double np, int u, int r){
        System.out.println("I have made an object!");
        name = n;
        category = cat;
        netPrice = np;
        unitsInStock = u;
        stockReorderThreshold = r;
    }

    public String toString() {
        return String.format("%s in category %s costs NOK %.2f. We have %d in stock and will reorder more when we have %d left", name, category, netPrice, unitsInStock, stockReorderThreshold);
    }

    public boolean isAvailable(){
        return (unitsInStock >= 1);
    }

    public double getSalesTax() {
        return netPrice*0.25;
    }

    public double getGrossPrice() {
        return netPrice + getSalesTax();
    }

    public void buyProduct() {
        if (isAvailable()) {
            unitsInStock--;
            if (reorderProduct()) {
                System.out.printf("We just ordered 20 new %s\n", name);
            }
        }
    }

    public void returnProduct() {
            unitsInStock++;
    }

    public boolean reorderProduct() {
        if (unitsInStock <= stockReorderThreshold) {
            unitsInStock += 20; //always reorder 20
        return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

}
