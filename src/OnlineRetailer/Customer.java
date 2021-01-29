package OnlineRetailer;

public class Customer {

    //Never changed
    // ANDY - because you only use it inside one method.
    private final int customerID; //Why? "Can be converted to local variable?

    //Shared data
    private static int nextID = 9001;

    private String customerName;
    private String customerAddress;

    public Customer(String name, String address) {
        this.customerID = nextID++;
        customerName =name;
        customerAddress = address;
    }




}
