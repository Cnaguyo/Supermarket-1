package supermarket;

import java.util.ArrayList;

public class CashRegister {

    private ArrayList<Product> shoppingCart = new ArrayList<Product>();

    public void addProduct(Product product) {
        // Do something
    }

    public int getPrice() {
        // Do something
        shoppingCart.get(0).getProductPrice();
        return 0;
    }
    public void removeProduct(Product product){
        //remove product from the cart
    }
    public int clearPrice(){
        shoppingCart.clear();
        return 0;
    }
    public int calculate(Product product){
        int total;
        do {
            total =+ getPrice();
        }
        while (shoppingCart.size()>0);
return 0;
    }
}
