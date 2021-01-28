package OnlineRetailer;

public class Product {

    private String name;
    private String category;
    private double netPrice;
    private int unitsInStock;

    private final int productId;
    private final int reorderThreshold;
    private final int reorderAmount;

    private static int nextId = 11;
    private final static int REORDER_PERCENTAGE = 50/100;
    private final static double SALES_TAX_PERCENTAGE = 25/100;


    public Product(String name, String category, Double netPrice, int unitsInStock, int reorderThreshold){
        this.productId = nextId++;
        this.name = name;
        this.category = category;
        this.netPrice = netPrice;
        this.unitsInStock = unitsInStock;
        this.reorderThreshold = reorderThreshold;
        this.reorderAmount = reorderThreshold * REORDER_PERCENTAGE;
        System.out.println(unitsInStock);
        System.out.println(REORDER_PERCENTAGE); //Why = 0?
    }

    public String toString() {
        return String.format("%s in category %s costs NOK %.2f. We have %d in stock and will reorder more when we have %d left", name, category, netPrice, unitsInStock, reorderThreshold);
    }

    public boolean isAvailable(){
        return unitsInStock >= 1;
    }


    public double getSalesTax() {
        return netPrice * SALES_TAX_PERCENTAGE;
    }

    public double getGrossPrice() {
        return netPrice + getSalesTax();
    }

    public void buyProduct() {
        if (isAvailable()) {
            unitsInStock--;
            if (reorderProduct()) {
                System.out.printf("We just ordered %d new %s\n", reorderAmount, name);
            }
        }
    }

    public void returnProduct() {
            unitsInStock++;
    }

    public boolean reorderProduct() {
        if (unitsInStock <= reorderThreshold) {
            unitsInStock += reorderAmount;
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
