package food2Door;

import food2Door.Product.Product;
import food2Door.manufacturer.Manufacturer;

public class OrderMaker {

    public void order(Product product, int quantity, Manufacturer manufacturer){
        System.out.println("Create order!");
        if (manufacturer.process()){
            System.out.println("Order confirmation!");
        }else {
            System.out.println("Order refusal!");
        }
        System.out.println();
    }
}
