package domain;

import java.util.Scanner;
public class Product {
    /* atributos */
    int productId;
    String productName;
    double productDesc;
    double cost;
    double price;
    int quantity;
    boolean state;

    Scanner sc = new Scanner(System.in);
    Object[] products[] = new Object[1][6];

    /* comportamientos (verbos) */
    public Object[] createProduct() {
        Object[] product = new Object[6];

        System.out.println("Ingrese el id del producto");
        productId = sc.nextInt();
        product[0] = productId;
        sc.nextLine();

        System.out.println("Ingrese el nombre del producto");
        productName = sc.nextLine();
        product[1] = productName;

        System.out.println("Ingrese el descuento del producto");
        productDesc = sc.nextDouble();
        product[2] = productDesc;

        System.out.println("Ingrese el costo del producto");
        cost = sc.nextDouble();
        product[3] = cost;

        System.out.println("Ingrese la cantidad del producto");
        quantity = sc.nextInt();
        product[4] = quantity;

        System.out.println("ingrese el estado del producto");
        state = sc.nextBoolean();
        product[5] = state;



        return product;
    }


    public void agregateToProducts() {
        for(int i = 0; i < products.length; i++) {
            products[i] = (Object[]) createProduct();
        }
    }

    public void listProduct() {
        for(int i = 0; i < products.length; i++) {
            for(int j = 0; j < products[i].length; j++) {
                System.out.println(products[i][j]);
            }
        }
    }

    public void deleteProduct() {

    }

}
