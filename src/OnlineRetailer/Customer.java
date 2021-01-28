package OnlineRetailer;

public class Customer {

    //Never changed
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
