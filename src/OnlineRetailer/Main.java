package OnlineRetailer;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product("MacBook Pro", "Laptop",27490.00, 30, 28);
        System.out.println(product1.toString());

        System.out.printf("The gross price of the product is NOK %.2f\n", product1.getGrossPrice());

        product1.buyProduct();
        product1.buyProduct();
        String name = product1.getName();
        int unitsInStock = product1.getUnitsInStock();
        System.out.printf("The customer bought 2 %s, there are now %d units in stock left.\n", name, unitsInStock);

        ProductList productlist = new ProductList();
        Product product2 = new Product("Apple iPhone 12 Pro","Phone",14000.00,50,20);
        Product product3 = new Product("Apple charger","accessories",180.00,100,50);


        productlist.addProduct(product1);
        productlist.addProduct(product2);
        productlist.addProduct(product3);
        System.out.println(productlist.getNumberOfProducts()); //Tested if added correctly --> Yes

        System.out.println(productlist.searchForProduct("12")); //Tested if search works -> Yes

         Customer customer1 = new Customer("Marina Santos Haugen", "Mor Go'hjertas vei 20");
    }
}
