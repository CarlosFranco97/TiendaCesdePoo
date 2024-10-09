package domain;

import java.util.Scanner;
public class Customer {
    /* Atributos */
    int userId;
    String userName;
    String userLastName;
    String userEmail;
    String userPhone;
    String userPassword;

    String customerType;
    int customerPoints;

    static Scanner sc = new Scanner(System.in);

    /* Comportamientos */
    Object[][] customers = new Object[1][8];

    /* metodos que permitan hacer CRUD */
    public Object createUser() {
        Object [] customer = new Object[8];

        System.out.println("Ingrese el id del usuario");
        userId = sc.nextInt();
        customer[0] = userId;
        sc.nextLine();

        System.out.println("Ingrese el nombre del usuario");
        userName = sc.nextLine();
        customer[1] = userName;

        System.out.println("Ingrese el segundo nombre");
        userLastName = sc.nextLine();
        customer[2] = userLastName;

        System.out.println("Ingrese el correo");
        userEmail = sc.nextLine();
        customer[3] = userEmail;


        System.out.println("ingrese el numero de telefono");
        userPhone = sc.nextLine();
        customer[4] = userPhone;

        System.out.println("Ingrese la contraseña");
        userPassword = sc.nextLine();
        customer[5] = userPassword;

        System.out.println("Ingrese el tipo de cliente");
        customerType = sc.nextLine();
        customer[6] = customerType;

        System.out.println("Ingrese los puntos del cliente");
        customerPoints = sc.nextInt();
        customer[7] = customerPoints;

        return customer;

    }

    public void agregateToCustomers() {
        int i = 0;
        while(i < customers.length) {
            customers[i] = (Object[]) createUser();
            i++;
        }
    }

    public void listUser(){

       for(int i = 0; i < customers.length; i++) {
           for(int j = 0; j < customers[i].length; j++) {
               System.out.println(customers[i][j] + " ");
           }
       }



        /* para todos los usuarios, que vea un solo usuario, que pide su usario */
        /* String searchForName;


        boolean userIsFound = false;
        for(int i = 0; i < customers.length; i++) {
            String usersNamesCustomers = customers[i][1] + "";
            System.out.println("Ingrese su nombre para ver datos");
            searchForName = sc.nextLine();

            if(searchForName.equals(customers[i][1])) {
                userIsFound = true;
                System.out.println(name + );
            }



        }
        if(!userIsFound) {
            System.out.println("Usuario no encontrado");
        } */
    }

    public void listsUsers() {
        for(int i = 0; i < customers.length; i++) {
            for(int j = 0; j < customers[i].length; j++) {
                System.out.print(customers[i][j]);
            }
            System.out.println("\n");
        }
    }
    public void updateUser(){

    }

    public void deleteUser() {

    }

}
