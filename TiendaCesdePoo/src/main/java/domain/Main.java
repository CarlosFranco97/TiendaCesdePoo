package domain;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();

        customer.agregateToCustomers();
        customer.listsUsers();


        Product product = new Product();

        product.agregateToProducts();
        product.listProduct();
    }
}
