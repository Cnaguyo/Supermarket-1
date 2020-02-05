package supermarket;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
       // Product p = new Product("soap" , 3);
        //List<Product> products = new ArrayList<>();

        CashRegister cashRegister = new CashRegister();
        cashRegister.addProduct(new Product("Soup", 3));
        cashRegister.getPrice();
        cashRegister.addProduct(new Product("Cereals", 2));
        cashRegister.getPrice();
        cashRegister.addProduct(new Product("Chinese vegetables", 5));
        cashRegister.getPrice();
        cashRegister.addProduct(new Product("Yoghurt", 2));
        cashRegister.getPrice();
        cashRegister.addProduct(new Product("Diapers", 10));
        cashRegister.getPrice();

        cashRegister.removeProduct(new Product("Soup", 3));
        cashRegister.clearPrice();
        cashRegister.removeProduct(new Product("Cereals", 2));
        cashRegister.clearPrice();
        cashRegister.removeProduct(new Product("Chinese vegetables", 5));
        cashRegister.clearPrice();
        cashRegister.removeProduct(new Product("Yoghurt", 2));
        cashRegister.clearPrice();
        cashRegister.removeProduct(new Product("Diapers", 10));
        cashRegister.clearPrice();

        cashRegister.calculate(new Product("Soup",5));









    }


}
