public class Customer {
    private String name;
    private String id;

    public Customer(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void displayCustomer() {
        System.out.println("Customer Name: " + name + " | ID: " + id);
    }

    public String getId() {
        return id;
    }
}