package OnlineRetailer;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product("MacBook Pro", "Laptop",27490.00, 30, 28);
        System.out.println(product1.toString());

        System.out.printf("The gross price of the product is NOK %.2f\n", product1.getGrossPrice());

        product1.buyProduct();
        product1.buyProduct();
        String n = product1.getName();
        int u = product1.getUnitsInStock();
        System.out.printf("The customer bought 2 %s, there are now %d units in stock left.\n", n, u);
    }
}
